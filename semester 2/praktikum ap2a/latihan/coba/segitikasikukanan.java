import java.io.*;
import java.util.Scanner;

public class segitikasikukanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int panjang = input.nextInt();

        // versi satu
        for (int i = panjang; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= panjang + 1 - i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}