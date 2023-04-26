package leetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

// 1986. Minimum Number of Work Sessions to Finish the Tasks
public class P1986 {
    public static void main(String[] args) {
        int output = minSessions(new int[]{9, 8, 8, 4, 6}, 14);
        System.out.println("output : "+output);
    }

//    1110

    public static int minSessions(int[] tasks, int sessionTime) {
        int result = 0;
        int sum = 0;
        int length = tasks.length;

        ArrayList taskList = new ArrayList<Integer>();
        for(int i=0; i<length; i++){
            taskList.add(tasks[i]);
        }

        while (!taskList.isEmpty()){
            
        }

//
//        while (tasks.length > 0){
//            for(int i=0; i < tasks.length; i++){
//                result += tasks[i];
//                    if(result < sessionTime) {
//                        if (Arrays.asList(tasks).contains(sessionTime - result)) {
//
//                        }
//                    }else if(result == sessionTime){
//                        sum++;
//                        result = 0;
//                    }else if(result > sessionTime){
//                        result = tasks[i];
//                        sum++;
//                    }
//            }
//        }
//
//        if(result != 0){
//            sum++;
//        }

        return sum;
    }
}
