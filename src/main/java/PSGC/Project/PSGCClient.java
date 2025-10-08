package PSGC.Project;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PSGCClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String asciiArt
                = "________ __________________________\n"
                + "___  __ \\__  ___/__  ____/__  ____/\n"
                + "__  /_/ /_____ \\ _  / __  _  /     \n"
                + "_  ____/ ____/ / / /_/ /  / /___   \n"
                + "/_/      /____/  \\____/   \\____/   \n"
                + "         _______ ________ ________\n"
                + "         ___    |___  __ \\____  _/\n"
                + "             /| |__  /_/ / __  /  \n"
                + "         _  ___ |_  ____/ __/ /   \n"
                + "         /_/  |_|/_/      /___/   \n"
                + "                 ________________ ______ ______ __________________ \n"
                + "                 __  ____/___    |___  / ___  / ___  ____/___  __ \\\n"
                + "                 _  /     __  /| |__  /  __  /  __  __/   __  /_/ /\n"
                + "                 / /___   _  ___ |_  /____  /____  /___   _  _, _/ \n"
                + "                \\____/   /_/  |_|/_____//_____//_____/   /_/ |_|  \n"
                + "                    _________             _____                ________________ ___    _________ \n"
                + "_______ ___ ______ _______  /_____        ___(_)_______        ______  /___    |__ |  / /___    |\n"
                + "__  __ `__ \\_  __ `/_  __  / _  _ \\       __  / __  __ \\       ___ _  / __  /| |__ | / / __  /| |\n"
                + "_  / / / / // /_/ / / /_/ /  /  __/       _  /  _  / / /       / /_/ /  _  ___ |__ |/ /  _  ___ |\n"
                + "/_/ /_/ /_/ \\__,_/  \\__,_/   \\___/        /_/   /_/ /_/        \\____/   /_/  |_|_____/   /_/  |_|";

        System.out.println(asciiArt);

        String spacer = "\n";
        System.out.println(spacer.repeat(8));

        System.out.print("Enter province/region name: ");
        String provinceName = scanner.nextLine().toLowerCase();

        // API Call
        String url = "https://psgc.cloud/api/provinces/" + provinceName + "/cities-municipalities";
        fetchMunicipalities(url, scanner);

        scanner.close();
    }

    private static void fetchMunicipalities(String url, Scanner scanner) {
        List<City> cities = null;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("Municipalities in the province:");
                
                // Parsing
                Gson gson = new Gson();
                Type cityListType = new TypeToken<List<City>>() {
                }.getType();
                cities = gson.fromJson(response.body(), cityListType);

                // Hashmap / Dictionary; Strings and their Int index
                Map<String, Integer> cityIndexMap = new HashMap<>();
              
                int[] columnWidths = printCityTableHeader(cities);
                int cityColumnWidth = columnWidths[0];  
                int codeColumnWidth = columnWidths[1];  

                // Table Formatted output
                for (int i = 0; i < cities.size(); i++) {
                    City city = cities.get(i);
                    cityIndexMap.put(city.getName().toLowerCase(), i); // Store lowercase for case-insensitive search
                    System.out.printf("|%-" + cityColumnWidth + "s|%-" + codeColumnWidth + "s|\n", (i + 1) + ". " + city.getName(), city.getCode());
                }
                // Table footer
                System.out.println("-".repeat(cityColumnWidth + codeColumnWidth + 3));

                // City Select
                System.out.print("Enter the number or name of the city to view barangays: ");
                String input = scanner.nextLine().toLowerCase();

                // Checking whether the input is an Int or String
                try {
                    int cityChoice = Integer.parseInt(input);
                    if (cityChoice > 0 && cityChoice <= cities.size()) {
                        City selectedCity = cities.get(cityChoice - 1);
                        fetchBarangays(selectedCity.getCode(), selectedCity);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } catch (NumberFormatException e) {
                    // Input is not a number, check for city name
                    if (cityIndexMap.containsKey(input)) {
                        int cityChoice = cityIndexMap.get(input);
                        City selectedCity = cities.get(cityChoice);
                        fetchBarangays(selectedCity.getCode(), selectedCity);
                    } else {
                        System.out.println("City not found. Please enter a valid city name.");
                    }
                }
            } else {
                System.out.println("Failed to fetch data. Status code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
        }
    }

    public static int[] printCityTableHeader(List<City> cities) {
        // Determine the maximum length of city names
        int maxCityNameLength = cities.stream()
                .mapToInt(city -> city.getName().length())
                .max()
                .orElse(0);
        
        int cityColumnWidth = maxCityNameLength + 5; 
        int codeColumnWidth = 12; 
        
        // Print the top separator
        System.out.println("-".repeat(cityColumnWidth + codeColumnWidth + 3)); 
        // Print the header
        System.out.printf("|%-" + cityColumnWidth + "s|%-" + codeColumnWidth + "s|\n", "Cities", "Code");
        // Print the separator below the header
        System.out.println("-".repeat(cityColumnWidth + codeColumnWidth + 3));

        return new int[]{cityColumnWidth, codeColumnWidth};

    }

    private static void fetchBarangays(String cityCode, City city) {
        String url = "https://psgc.cloud/api/cities-municipalities/" + cityCode + "/barangays";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                Type barangayListType = new TypeToken<List<Barangay>>() {
                }.getType();
                List<Barangay> barangays = gson.fromJson(response.body(), barangayListType);

                // Check if barangays list is empty
                if (barangays.isEmpty()) {
                    System.out.println("No barangays found in this city.");
                    return;
                }

                // Print barangays table
                printBarangayTable(barangays);
            } else {
                System.out.println("Failed to fetch barangays. Status code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
        }
    }

    private static void printBarangayTable(List<Barangay> barangays) {
        // Determine the maximum length of barangay names
        int maxBarangayNameLength = barangays.stream()
                .mapToInt(barangay -> barangay.getName().length())
                .max()
                .orElse(0);
        int barangayColumnWidth = Math.max(maxBarangayNameLength + 5, 19); // Add padding
        int codeColumnWidth = 12;

        // Print the top separator
        System.out.println("-".repeat(barangayColumnWidth + codeColumnWidth + 3));
        // Print the header
        System.out.printf("|%-" + barangayColumnWidth + "s|%-" + codeColumnWidth + "s|\n", "Barangays", "Code");
        // Print the separator below the header
        System.out.println("-".repeat(barangayColumnWidth + codeColumnWidth + 3));

        // Display the barangays and their codes in a table format
        for (int i = 0; i < barangays.size(); i++) {
            Barangay barangay = barangays.get(i);
            System.out.printf("|%-" + barangayColumnWidth + "s|%s" + codeColumnWidth + "|\n", (i + 1) + ". " + barangay.getName(), barangay.getCode());
        }

        // Print the bottom separator
        System.out.println("-".repeat(barangayColumnWidth + codeColumnWidth + 3));
    }
}
