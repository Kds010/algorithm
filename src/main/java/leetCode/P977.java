package leetCode;

import java.util.Arrays;

public class P977 {
    public static void main(String[] args) {
        int[] c1 = {-4,-1,0,3,10};
        int[] c2 = {-7,-3,2,3,11};
        int[] re1 = sortedSquares(c1);
        int[] re2 = sortedSquares(c2);
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){ nums[i] = nums[i]*nums[i]; }
        Arrays.sort(nums);
        return nums;
    }
}
