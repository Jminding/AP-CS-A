import java.util.Random;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] A = new int[3][5];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = rand.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                sum += A[i][j];
            }
        }
        System.out.println(sum);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                min = Math.min(min, A[i][j]);
            }
        }
        int[] B = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                B[i] += A[j][i];
            }
        }
    }
}
