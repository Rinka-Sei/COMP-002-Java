package BSIT2ndSem.Classes_Objects.NoArguments;

/*
Naming Conventions:
Packages: Use all lowercase (e.g., bsit.assignment).
Methods: Use camelCase (e.g., helloName() instead of HelloName()).
Classes: Use PascalCase (e.g., NamePrinter).

Concepts to tackle:
Return Types: Moving beyond 'void' to 'byte', 'char', or 'boolean' to return data signals to the Caller.
Access Modifiers: Using 'public', 'private', and 'protected' to secure hardware-related data from external interference.
Variable Scope: Managing where data "lives" and "dies" (Stack memory for locals vs. Heap memory for globals).
Exception Handling: Moving from simple 'if' checks to 'try-catch' blocks to ensure the system doesn't crash if a sensor or user sends garbage data.

static to avoid heap overhead: Calls methods from the Class area, removing the need for a constructor or object allocation.
final keyword: Makes a variable constant to prevent accidental modification and allow for compiler optimization.
byte data type: Minimizes memory footprint on the Stack for small numeric ranges like days (1-7) or age.
*/

import java.util.*;

public class Caller {

    public static void main(String[] args) {
        
        // 1. Capture initial memory state
        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        
        // 2. Capture start time
        long startTime = System.nanoTime();
        
        DayPrinter DP = new DayPrinter();
        NamePrinter NP = new NamePrinter();

        // Good Practice try-with-resources 
        try (Scanner sc = new Scanner(System.in)) {
            DP.DaysOfTheWeek(sc); // we pass sc here as an argument to be used in this class
            NP.HelloName(sc);
        } // System.in is closed safely here avoiding the runtime error
        
        // 3. Capture end time and final memory
        long endTime = System.nanoTime();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // 4. Calculate Results
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        long memoryUsed = memoryAfter - memoryBefore;

        System.out.println("\n--- BENCHMARK RESULTS ---");
        System.out.println("Execution Time: " + duration + " ms");
        System.out.printf("Estimated Memory Footprint: %d bytes%n", memoryUsed);
        System.out.println("-------------------------");
    }
}
