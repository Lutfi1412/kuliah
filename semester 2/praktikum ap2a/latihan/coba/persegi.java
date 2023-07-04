import java.io.*;
import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int panjang = input.nextInt();

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
