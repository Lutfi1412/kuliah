import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Deret Fibonacci: ");
        n = input.nextInt();

        System.out.print("Deret Fibonacci Adalah: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
