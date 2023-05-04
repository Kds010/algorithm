package leetCode;

import java.util.ArrayList;
import java.util.List;

public class P733 {
    static List<Integer[]> arr = new ArrayList<>();

    public static void main(String[] args) {
        int[][] T1 = {{1,1,1}, {1,1,0},{1,0,1}};
        int[][] T2 = {{0,0,0}, {0,0,0}};
        int[][] output = floodFill(T1, 1, 1, 2);
        int[][] output2 = floodFill(T2, 0, 0, 0);

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int bfColor = image[sr][sc];
        int max = image.length;
        int min = image[0].length;

        if(bfColor == color){
            return image;
        }

        if(image[sr][sc] == bfColor){
            image[sr][sc] = color;
        }

        fill(image, sr, sc, max, min, bfColor, color);
        agian(arr.size(), image, max, min, bfColor, color);

        return image;
    }

    public static void agian(int rc, int[][] image, int max, int min, int bfColor, int color){

        List<Integer[]> bbb = new ArrayList<>();
        for(int a=0; a<arr.size(); a++){
            bbb.add(arr.get(a));
        }
        arr.clear();

        for(int i=0;i<rc;i++){
            fill(image, bbb.get(i)[0], bbb.get(i)[1], max, min, bfColor, color);
        }

        if(arr.size() == 0){
            return;
        }

        agian(arr.size(), image, max, min, bfColor, color);
    }

    public static int[][] fill(int[][] image, int sr, int sc, int max, int min, int bfColor, int color){

        if(sr != 0 && image[sr-1][sc] == bfColor){
            image[sr-1][sc] = color;
            arr.add(new Integer[]{sr-1,sc});
        }
        if(sr != max-1 && image[sr+1][sc] == bfColor){
            image[sr+1][sc] = color;
            arr.add(new Integer[]{sr+1,sc});
        }
        if(sc != 0 && image[sr][sc-1] == bfColor){
            image[sr][sc-1] = color;
            arr.add(new Integer[]{sr,sc-1});
        }
        if(sc != min-1 && image[sr][sc+1] == bfColor){
            image[sr][sc+1] = color;
            arr.add(new Integer[]{sr,sc+1});
        }

        return image;
    }
}
