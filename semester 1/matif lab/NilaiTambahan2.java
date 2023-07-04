import java.util.Scanner;
public class NilaiTambahan2 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, numbers3;
        System.out.println("Lutfi Robbani");

        //input data
        System.out.print("Masukan Angka Pertama: ");
        numbers1 = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        numbers2 = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        numbers3 = input.nextInt();
        System.out.println("Nilai Maksimal Adalah : "+(terbesar(numbers1,numbers2,numbers3)));
    }
    private static int terbesar(int a, int b, int c){
        int maks;
        maks = (a > b)?a:b;
        maks = (maks > c)?maks:c;
        return maks;
    }
}
