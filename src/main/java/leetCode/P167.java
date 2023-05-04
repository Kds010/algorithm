package leetCode;

public class P167 {
    public static void main(String[] args) {
        int[] C1 = {2,7,11,15};
        int[] C2 = {2,3,4};
        int[] C3 = {-1,0};
        int[] result1 = twoSum(C1, 9);
        int[] result2 = twoSum(C2, 6);
        int[] result3 = twoSum(C3, -1);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int size = numbers.length;
        for(int i=0; i<size; i++){
            if(numbers[i]+numbers[size-1] < target){
                continue;
            }
            for(int j=i+1; j<size; j++){
                if(target == numbers[i]+numbers[j]){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
