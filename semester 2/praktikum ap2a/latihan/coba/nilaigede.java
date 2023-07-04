import java.io.*;
import java.util.Scanner;

public class nilaigede {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("deret ganjil dan genap");
        System.out.println("1. deret genap");
        System.out.println("2. deret ganjil");
        System.out.println("3. exit");
        System.out.print("pilih angka : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("selamat datang di deret genap");
                System.out.print("masukan angka : ");
                int panjang = input.nextInt();
                System.out.println("deret genap : ");
                for (int i = 1; i < panjang; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                System.out.println("selamat datang di deret ganjil");
                System.out.print("masukan angka : ");
                int panjang2 = input.nextInt();
                System.out.println("deret genap : ");
                for (int i = 1; i < panjang2; i++) {
                    if (i % 2 == 1) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 3:
                System.out.println("program berhenti");
                break;
            default:
                System.out.println("error");
        }

    }
}
