package CodingBat;

public class MatchUp {
    public static void main(String[] args) {

    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.length; i++) if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) != 0) ret++;
        return ret;
    }
}
