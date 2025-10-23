# COMP-002 Java Programming

This repository contains all the source codes of projects and laboratories for our COMP-002 Java programming class during my first semester as a first-year BSIT student.

## Project Structure

*   **`src/main/java/BSIT1stSem`**: This folder contains all the projects and laboratories related to the COMP-002 course.
*   **`src/main/java/Practice`**: This folder contains additional practice exercises and personal projects.

## Building and Running

This is a Maven-based project, as indicated by the `pom.xml` file. You can open it in any IDE that supports Maven (like Apache NetBeans) or build and run it from the command line.

### IDE Instructions (Recommended)

1.  Open your IDE (e.g., Apache NetBeans).
2.  Go to `File > Open Project` and select the cloned repository folder.
3.  The IDE should automatically recognize it as a Maven project and load the necessary dependencies.
4.  Find the main class to run the desired project.

### Command Line Instructions

1.  **Clone the repository.**
2.  **Navigate to the project directory.**
3.  **Build the project:**
    The `pom.xml` file includes the following dependencies:
    *   **gson**: `2.11.0`
    *   **httpclient5**: `5.4`
    *   **jline**: `3.27.0`

    To compile the project and download these dependencies, run:
    ```bash
    mvn clean install
    ```
4.  **Run the main class:**
    *(Note: You may need to specify the correct main class to run a specific project.)*
    ```bash
    mvn exec:java
    ```
