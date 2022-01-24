public class Randsum {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) numbers[i] = (int) Math.floor(Math.random() * (20 - 10 + 1) + 10);
        System.out.println();
    }
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }
}
