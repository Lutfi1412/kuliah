import java.util.Scanner;

public class tugasap2a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Perulangan While");
        int a = input.nextInt();

        System.out.println("Masukan Perulangan Do While");
        int b = input.nextInt();

        System.out.println("Masukan Perulangan For");
        int c = input.nextInt();

        System.out.println("Ini Contoh Perulangan While");
        int i = 1;
        while (i <= a) {
            System.out.print(i);
            i++;
        }

        System.out.println();
        System.out.println("Ini Contoh Perulangan Do While");
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= b);

        System.out.println();
        System.out.println("Ini Contoh Perulangan For");
        for (int k = 1; k <= c; k++) {
            System.out.print(k);
        }

        input.close();
    }
}
