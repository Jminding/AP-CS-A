import java.util.*;

public class Arrays2D {
    public static int[][] A = new int[3][5];

    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
        part6();
    }

    public static void part1() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void part2() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void part3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void part4() {
        int sum = 0;
        for (int i = 0; i < 3; i++) for (int j = 0; j < 5; j++) sum += A[i][j];
        System.out.printf("Sum: %s%n", sum);
        System.out.println();
    }

    public static void part5() {
        int min = Integer.MAX_VALUE;
        int r = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.printf("The minimum value is %s at position (%s, %s).%n", min, r, c);
        System.out.println();
    }

    public static void part6() {
        int[] B = new int[5];
        System.out.print("Sum of each column: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                B[i] += A[j][i];
            }
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}
