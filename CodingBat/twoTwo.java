package CodingBat;

public class twoTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        System.out.println(twoTwo(arr));
    }

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                i++;
                if (!(i < nums.length) || nums[i] != 2) return false;
                while (i < nums.length && nums[i] == 2) i++;
            }
        }
        return true;
    }
}
