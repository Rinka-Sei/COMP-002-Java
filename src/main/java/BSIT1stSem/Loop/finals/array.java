/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSIT1stSem.Loop.finals;

/**
 *
 * @author mj
 */
public class array {

    public static void main(String[] args) {
        String surnames[] = {"Almeda", "Miranda", "Silvio", "Ayub", "Pena", "Anonuevo", "Gonzales", "Almodal", "Canina", "Mutuc"};
        for (int x = 0; x < surnames.length; x++) {
            System.out.println(surnames[x]);
        }
        String surnames2D[][] = {{"Almeda", "Miranda", "Silvio", "Ayub", "Pena"}, {"Anonuevo", "Gonzales", "Almodal", "Canina", "Mutuc"}};

        for (int i = 0; i < surnames2D.length; i++) {

            System.out.print("Row " + i + ": ");

            for (int j = 0; j < surnames2D[i].length; j++) {
                System.out.print(surnames2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
