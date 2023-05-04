package leetCode;

import java.util.Arrays;

public class P189 {
    public static void main(String[] args) {
        int[] c1 = {1,2,3,4,5,6,7};
        int[] c2 = {-1, -100, 3, 99};
        rotate(c1, 3);
        rotate(c2, 2);
    }
    public static void rotate(int[] nums, int k) {
        int[] newNums1 = {};
        int[] newNums2 = {};
        if(nums.length == 1){
        }else if(nums.length < k){
            int count = k%nums.length;
            newNums1 = Arrays.copyOfRange(nums, 0, nums.length-count);
            newNums2 = Arrays.copyOfRange(nums, nums.length-count, nums.length);
            for(int i=0;i<newNums2.length;i++){
                nums[i] = newNums2[i];
            }
            for(int i=0;i<newNums1.length;i++){
                nums[newNums2.length+i] = newNums1[i];
            }
        }else{
            newNums1 = Arrays.copyOfRange(nums, 0, nums.length-k);
            newNums2 = Arrays.copyOfRange(nums, nums.length-k, nums.length);

            for(int i=0;i<newNums2.length;i++){
                nums[i] = newNums2[i];
            }
            for(int i=0;i<newNums1.length;i++){
                nums[newNums2.length+i] = newNums1[i];
            }
        }
    }
}
