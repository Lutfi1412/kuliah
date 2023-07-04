import java.util.Scanner;

public class ujian {
    private static double[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Input Matriks");
            System.out.println("2. Hitung Determinan Matriks 3x3");
            System.out.println("3. Hitung Invers Matriks 3x3");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputMatrix(scanner);
                    break;
                case 2:
                    calculateDeterminant();
                    break;
                case 3:
                    calculateInverse();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program berakhir.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void inputMatrix(Scanner scanner) {
        matrix = new double[3][3];
        System.out.println("Input Matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Matriks berhasil diinput.");
    }

    public static void calculateDeterminant() {
        if (matrix == null) {
            System.out.println("Matriks belum diinput. Silakan input matriks terlebih dahulu.");
            return;
        }

        double determinant = calculateDeterminant(matrix);
        System.out.println("Determinan matriks 3x3: " + determinant);
    }

    public static void calculateInverse() {
        if (matrix == null) {
            System.out.println("Matriks belum diinput. Silakan input matriks terlebih dahulu.");
            return;
        }

        double[][] inverse = calculateInverse(matrix);
        System.out.println("Invers matriks 3x3:");
        printMatrix(inverse);
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double calculateDeterminant(double[][] matrix) {
        double determinant = 0;
        determinant += matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        determinant -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        determinant += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        return determinant;
    }

    public static double[][] calculateInverse(double[][] matrix) {
        double determinant = calculateDeterminant(matrix);

        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }
}
