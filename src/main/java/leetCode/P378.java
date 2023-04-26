package leetCode;

import java.util.PriorityQueue;

public class P378 {
    public static void main(String[] args) {
        int[][] T1 = {{1,5,9}, {10,11,13},{12,13,15}};
        int[][] T2 = {{-5}};
        int output = version2(T1, 8);
        int output2 = version2(T2, 1);
        System.out.println("output : "+output);
        System.out.println("output2 : "+output2);
    }

    public static int version2(int[][] matrix, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                priorityQueue.add(matrix[i][j]);
            }
        }

        while(k>1){
            priorityQueue.remove();
            k--;
        }

        return priorityQueue.peek();
    }

    public static int version1(int[][] matrix, int k) {
        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // //높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        // PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                priorityQueue.add(matrix[i][j]);
            }
        }

        System.out.print(priorityQueue);
        int result = 0;
        while(k>0){
            result = priorityQueue.poll();
            k--;
        }

        return result;
    }
}
