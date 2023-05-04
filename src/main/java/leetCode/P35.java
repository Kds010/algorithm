package leetCode;

public class P35 {
    public static void main(String[] args) {
        int[] c1 = {1,3,5,6};
        int result1 = searchInsert(c1, 5);
        int result2 = searchInsert(c1, 2);
        int result3 = searchInsert(c1, 7);
    }
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = (low + high)/2;
        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                high = mid-1;
            }
            if(nums[mid] < target){
                low = mid+1;
            }
        }

        return low;
    }
}
