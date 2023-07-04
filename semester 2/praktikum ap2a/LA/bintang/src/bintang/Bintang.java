/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bintang;
import java.io.*;
import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int panjang = input.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("");
            }
            for (int j = i; j <= panjang; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for (int k = 1; k<= panjang; k++){
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
        }
            System.out.println();
    }
        
}
}

