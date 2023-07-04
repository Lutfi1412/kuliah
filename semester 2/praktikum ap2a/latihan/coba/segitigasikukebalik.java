import java.io.*;
import java.util.Scanner;

public class segitigasikukebalik {
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
    }
}
