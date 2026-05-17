package BSIT2ndSem.array;

public class main {

    public static void main(String[] args) {
        System.out.println("=== 2D Array Loop Comparison ===\n");
        
        String[][] arrayStudentName = {
            {"MJ", "Lee", "Xai"},
            {"Ryan", "Ronell", "CJ"}
        };
        
        String[][] arrayStudentSurname = {
            {"Almeda", "Miranda", "Ayub"},
            {"Refuerzo", "Cortez", "Lomuntad"}
        };
        
        // 1. FOR LOOP (Simplest & Most Common)
        System.out.println("1. FOR LOOP:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayStudentName[i][j] + " " + arrayStudentSurname[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 2. WHILE LOOP
        System.out.println("2. WHILE LOOP:");
        int i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                System.out.print(arrayStudentName[i][j] + " " + arrayStudentSurname[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        
        // 3. DO-WHILE LOOP
        System.out.println("3. DO-WHILE LOOP:");
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(arrayStudentName[i][j] + " " + arrayStudentSurname[i][j] + " ");
                j++;
            } while (j < 3);
            System.out.println();
            i++;
        } while (i < 2);
        System.out.println();
        
        // 4. FOR-EACH LOOP (Hybrid - Best for readability)
        System.out.println("4. FOR-EACH LOOP:");
        i = 0;
        for (String[] nameRow : arrayStudentName) {
            int j = 0;
            for (String name : nameRow) {
                System.out.print(name + " " + arrayStudentSurname[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}