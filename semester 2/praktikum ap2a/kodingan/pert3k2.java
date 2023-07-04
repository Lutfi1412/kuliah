import java.util.Scanner;

public class pert3k2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka : ");
        int a = input.nextInt();
        System.out.println("");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}