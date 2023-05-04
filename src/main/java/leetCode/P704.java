package leetCode;

public class P704 {
    public static void main(String[] args) {
        int[] c1 = {-1,0,3,5,9,12};
        int[] c2 = {-1,0,3,5,9,12};
        int re1 = search(c1, 9); // 4
        int re2 = search(c1, 2); // -1
    }
    public static int search(int[] nums, int target) {
        // int index = 0;
        // boolean ck = false;
        // for(int num : nums){
        //     if(num == target){
        //         ck = true;
        //         return index;
        //     }
        //     index++;
        // };
        // if(!ck){
        //     return -1;
        // }
        // return index;

        int begin = 0;
        int last = nums.length -1;
        int mid = (begin + last)/2;
        while(begin <= last){
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                last = mid-1;
                mid = (begin+last)/2;
            }
            if(nums[mid] < target){
                begin = mid+1;
                mid = (begin+last)/2;
            }
        }

        return -1;
    }
}
