public class pert4 {
    public static void main(String[] args) {
        int max = 0;
        int[][] arr2D = {
                { 2, 5, 4 },
                { 7, 1, 9 },
                { 4, 6, 8 }
        };
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                    
                }
            }
        }
        System.out.println(max);
    }
}

