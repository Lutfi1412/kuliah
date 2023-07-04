import java.io.*;

class ordo2 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ordo Matriks = 2*2");
        int[][] matrika = new int[2][2];
        System.out.println("Masukan elemen matriksnya: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + (i + 1) + ", " + (j + 1) + "] = ");
                matrika[i][j] = Integer.parseInt(input.readLine());
            }
            for (int k = 0; k < 2; k++) {
                System.out.print("");
                for (int j = 0; j < 2; j++)
                    System.out.print(matrika[k][j] + " ");
            }
            System.out.println("|");
        }
        int dtr = ((matrika[0][0] * matrika[1][1]) - (matrika[1][0] * matrika[0][1]));
        System.out.println("Determinannya = " + dtr);
    }
}