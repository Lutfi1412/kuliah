import java.util.Scanner;

public class pert3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka : ");
        int a = input.nextInt();

        System.out.println("Ini angka genap : ");
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Ini angka ganjil : ");
        for (int i = 1; i < a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
