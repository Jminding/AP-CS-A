package CodingBat;

public class tenRun {
    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 4, 20, 5};
        arr = tenRun(arr);
        for (int i : arr) System.out.print(i + " ");
    }

    public static int[] tenRun(int[] nums) {
        Integer currentMultiple = null; // Set it to an Integer and not an int, so it can be set to null
        // Setting it to null ensures that it will not accidentally coincide with one of the numbers in the array in the first test case
        for (int i = 0; i < nums.length; i++) {
            if (currentMultiple == null) currentMultiple = nums[i];
            else if (currentMultiple % 10 != 0 && nums[i] % 10 != 0) currentMultiple = nums[i];
            else if (nums[i] % 10 == 0) currentMultiple = nums[i];
            nums[i] = currentMultiple;
        }
        return nums;
    }
}
