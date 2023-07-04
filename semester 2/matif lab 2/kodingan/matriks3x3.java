import java.io.*;

public class matriks3x3 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ordo Matrik = 3x3");
        int[][] MatriksY = new int[3][3];
        System.out.println("Masukkan Elemen Matriksnya : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + (i + 1) + ", " + (j + 1) + "] = ");
                MatriksY[i][j] = Integer.parseInt(input.readLine());
            }
        }
        for (int k = 0; k < 3; k++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(MatriksY[k][j] + " ");
            }
            System.out.println("|");
        }
        int determinan = ((MatriksY[0][0] * MatriksY[1][1] * MatriksY[2][2])
                + (MatriksY[0][1] * MatriksY[1][2] * MatriksY[2][0])
                + (MatriksY[0][2] * MatriksY[1][0] * MatriksY[2][1]))
                - ((MatriksY[0][2] * MatriksY[1][1] * MatriksY[2][0])
                        + (MatriksY[0][0] * MatriksY[1][2] * MatriksY[2][1])
                        + (MatriksY[0][1] * MatriksY[1][0] * MatriksY[2][2]));
        System.out.println("Determinannya Adalah = " + determinan);
        int m11, m12, m13, m21, m22, m23, m31, m32, m33;
        m11 = 1 * ((MatriksY[1][1] * MatriksY[2][2]) - (MatriksY[1][2] * MatriksY[2][1]));
        m12 = -1 * ((MatriksY[1][0] * MatriksY[2][2]) - (MatriksY[1][2] * MatriksY[2][0]));
        m13 = 1 * ((MatriksY[1][0] * MatriksY[2][1]) - (MatriksY[1][1] * MatriksY[2][0]));
        m21 = -1 * ((MatriksY[0][1] * MatriksY[2][2]) - (MatriksY[0][2] * MatriksY[2][1]));
        m22 = 1 * ((MatriksY[0][0] * MatriksY[2][2]) - (MatriksY[0][2] * MatriksY[2][0]));
        m23 = -1 * ((MatriksY[0][0] * MatriksY[2][1]) - (MatriksY[0][1] * MatriksY[2][0]));
        m31 = 1 * ((MatriksY[0][1] * MatriksY[1][2]) - (MatriksY[0][2] * MatriksY[1][1]));
        m32 = -1 * ((MatriksY[0][0] * MatriksY[1][2]) - (MatriksY[0][2] * MatriksY[1][0]));
        m33 = 1 * ((MatriksY[0][0] * MatriksY[1][1]) - (MatriksY[0][1] * MatriksY[1][0]));
        MatriksY[0][0] = m11;
        MatriksY[0][1] = m21;
        MatriksY[0][2] = m31;
        MatriksY[1][0] = m12;
        MatriksY[1][1] = m22;
        MatriksY[1][2] = m32;
        MatriksY[2][0] = m13;
        MatriksY[2][1] = m23;
        MatriksY[2][2] = m33;

        System.out.println("Matriks Inversnya : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(MatriksY[i][j] / determinan + " ");
            }
            System.out.println("|");
        }
    }
}
