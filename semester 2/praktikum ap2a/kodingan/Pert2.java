
//act 1
import java.util.Scanner;

public class Pert2 {
    public static void main(String[] args) {
        System.out.println("Masukan Nilai Anda : ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if (a > 100) {
            System.out.println("You Are God");
        } else if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("Ngulang Aja Bro!!!!");
        }
    }
}
