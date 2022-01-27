package CodingBat;

import java.util.ArrayList;

public class evenOdd {
    public static void main(String[] args) {

    }

    public static int[] evenOdd(int[] nums) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i : nums) {
            if (i % 2 == 0) evens.add(i);
            else odds.add(i);
        }
        for (int i = 0; i < evens.size(); i++) nums[i] = evens.get(i);
        for (int i = evens.size(); i < odds.size() + evens.size(); i++) nums[i] = odds.get(i - evens.size());
        return nums;
    }
}
