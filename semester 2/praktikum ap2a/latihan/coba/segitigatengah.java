import java.io.*;
import java.util.Scanner;

public class segitigatengah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int panjang = input.nextInt();

        for (int p = panjang; p >= 1; p--) {
            for (int j = 1; j <= p - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= panjang + 1 - p; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
