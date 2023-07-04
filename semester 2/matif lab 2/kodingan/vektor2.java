import java.io.*;

class vektor2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] jum = new int[10];
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int skalar;

        System.out.println("Masukkan jumlah vektor : ");
        int n = Integer.parseInt(input.readLine());

        System.out.println("Vektor 1");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen [1, " + (i + 1) + "] = ");
            v1[i] = Integer.parseInt(input.readLine());
        }

        System.out.println("Vektor 2");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen [1, " + (i + 1) + "] = ");
            v2[i] = Integer.parseInt(input.readLine());
        }

        System.out.println("Nilai Skalar = ");
        skalar = Integer.parseInt(input.readLine());

        System.out.print("Penjumlahan vektor :[");
        for (int i = 0; i < n; i++) {
            jum[i] = v1[i] + v2[i];
            System.out.print(jum[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("Pengurangan vektor : [");
        for (int i = 0; i < n; i++) {
            jum[i] = v1[i] - v2[i];
            System.out.print(jum[i]);
            if (i != n - 1) {
                System.out.print(",");
                if (jum[i] < 0) {
                    System.out.print("(vektor berlawanan arah)");
                    System.out.print(",");
                }
            }
        }
        System.out.println("]");

        System.out.print("Perkalian vektor : [");
        for (int i = 0; i < n; i++) {
            jum[i] = skalar * v1[i];
            System.out.print(jum[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("Pembagian vektor : [");
        for (int i = 0; i < n; i++) {
            jum[i] = v1[i] / v2[i];
            System.out.print(jum[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}