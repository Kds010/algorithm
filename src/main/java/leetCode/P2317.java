package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2317 {
    public static void main(String[] args) {
        int[] c1 = {3, 2, 4, 6};
        int[] c2 = {1, 2, 3, 9, 2};
        // 0001, 0010, 0011, 1001, 0010
        System.out.println("c1 : "+maximumXOR(c1)); // 7
//        System.out.println("c2 : "+maximumXOR(c2)); // 11
    }

    // x = 4 and i = 3
    // num[3] = 6 and (6 xor 4) = 6 and 2= 2.
    // num[3] = 6
    // 110
    // 110 xor 100
    // 010
    // 2

    // 3 xor 2 xor 4 xor 2 = 7;
    // 011 xor 010 xor 100 xor 010
    // 011 xor 010 = 101
    // 101 xor 100 = 011
    // 011 xor 010 = 001

    // 011 xor 010 = 001
    // 010 xor 100 = 110
    // 110 xor 001 = 111
    // x 연산 적용시 최대값
    // 1의 개수가 짝수이면. 안된다. 0이 된다.
    public static int maximumXOR(int[] nums){
        // x의 존재 의미는 절대 1이 짝수가 되지 않도록 만드는 것으로 사용하면 된다. 결국 OR 값으로 자릿수가 1이 존재할시 최대값으로 계산하면 된다.
        ////////////
        int maxNums = Arrays.stream(nums).max().getAsInt();
        int binarydigits = 0;
        while (maxNums >= 2){
            binarydigits++;
            maxNums /= 2;
        }

        List<String> binaryNums = new ArrayList<>();
        for(int i=0; i < nums.length; i++){
            String binary = Integer.toBinaryString(nums[i]);
            int bilength = binary.length()-1;

            for(int j=0; j< binarydigits - bilength; j++){
                binary = "0"+binary;
            }

            binaryNums.add(binary);
        }

        List<Integer> temp = new ArrayList<>();
        for(int j=1; j<=binarydigits+1; j++){
            int calc = 0;
            for(int i=0; i<binaryNums.size();i++){
                if(binaryNums.get(i).substring(j-1, j).equals("1")){
                    calc++;
                }
            }
            if(calc%2==0){
                if(temp.isEmpty()){
                    temp.add(0,1);
                }else{
                    temp.add(0,0);
                }
            }else{
                temp.add(0,1);
            }
        }

        int result = 0;
        for(int i=0; i<temp.size(); i++){
            System.out.print("i : "+i);
            System.out.print(",    제곱 : "+(int) Math.round(Math.pow(2, i)));
            System.out.println(",   자릿수 값 더하기 : "+(int) Math.round(Math.pow(2, i)) * temp.get(i));
            result = result + (int) Math.round(Math.pow(2, i)) * temp.get(i);
        }

//         return result;
        // System.out.println("temp : "+temp);
        // System.out.println("result : "+result);

         int m = 0;
         for(int i=0; i<nums.length;i++){
             m = m | nums[i];
             System.out.println("m : "+m);
             // or ???
         }

         return m;
    }
}
