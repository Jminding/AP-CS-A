package CodingBat;

public class zeroMax {
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 0, 1};
        arr = zeroMax(arr);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean exists = false;
            int largestOdd = 0;
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        exists = true;
                        largestOdd = Math.max(largestOdd, nums[j]);
                    }
                }
                if (exists) nums[i] = largestOdd;
            }
        }
        return nums;
    }
}