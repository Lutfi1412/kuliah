import java.io.*;
import java.util.Scanner;

public class segitigasiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int panjang = input.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
