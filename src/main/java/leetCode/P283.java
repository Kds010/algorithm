package leetCode;

public class P283 {
    public static void main(String[] args) {
        int[] c1 = {0,1,0,3,12};
        int[] c2 = {0};
        moveZeroes(c1);
        moveZeroes(c2);
    }
    public static void moveZeroes(int[] nums){
        int size = nums.length;
        int zeroCnt = 0;
        int temp = 0;
        for(int i=0; i<size; i++){
            if(nums[i] == 0){
                zeroCnt++;
            }
        }
        for(int i=0; i<size; i++){
            if(nums[i] == 0){
                for(int j=i+1; j < size;j++){
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        for(int k=size-zeroCnt; k<size; k++){
            nums[k] = 0;
        }
    }
}
