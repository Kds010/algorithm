package leetCode;

public class P11 {
    public static void main(String[] args) {
        int[] c1 = {1,8,6,2,5,4,8,3,7};
        int[] c2 = {1,1};
        int re1 = maxArea(c1);  // 49
        int re2 = maxArea(c2);  // 1
    }
    public static int maxArea(int[] height) {
        int firstIdx = 0;
        int lastIdx = height.length-1;
        int area = 0;

        while(lastIdx > firstIdx){
            if(height[firstIdx] < height[lastIdx]){
                area = Math.max(area, height[firstIdx] * (lastIdx - firstIdx));
                firstIdx += 1;
            }else{
                area = Math.max(area, height[lastIdx] * (lastIdx - firstIdx));
                lastIdx -= 1;
            }
        }

        return area;
    }

    public static int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = (right - left)*Math.min(height[left], height[right]);
        while(left < right){
            if(height[left] <= height[right]){
                left++;
            }
            else {
                right--;
            }

            max_area = Math.max(max_area, (right - left)*Math.min(height[left], height[right]) );
        }

        return max_area;
    }

    // 양쪽의 값을 비교(기존의 값보다 큰 지)하면서 차례로 넓이를 비교계산하여 풀이하려 했다.
    public static int failSolving(int[] height){
        int first = height[0];
        int last = height[height.length-1];
        int firstIdx = 0;
        int lastIdx = height.length-1;
        int area = getArea(first, last, lastIdx - firstIdx);

        // for(int i=1; i<height.length; i++){

        //     if(first < height[i]){
        //         if(area <= getArea(height[i], last, lastIdx - i)){
        //             area = getArea(height[i], last, lastIdx - i);
        //             firstIdx = i;
        //             first = height[i];
        //         }
        //     }else{
        //         if(last < height)
        //     }

        // }
        int i = 0;

        while(i<height.length-1){
            if(last > first){
                if(first < height[i]){
                    if(area <= getArea(height[i], last, lastIdx - i)){
                        area = getArea(height[i], last, lastIdx - i);
                        firstIdx = i;
                        first = height[i];
                    }
                }else{
                    if(last < height[height.length-1-i]){
                        if(area <= getArea(height[i], last, height.length-1-i - first)){
                            area = getArea(first, height[height.length-1-i], height.length-1-i - first);
                            lastIdx = height.length-1-i;
                            last = height[height.length-1-i];
                        }
                    }
                }
            }
            i++;
        }

        return area;
    }

    public static int getArea(int first, int last, int length){
        // System.out.println("last : "+last);
        // System.out.println("first : "+first);
        // System.out.println("length : "+length);
        if(first >= last){
            // System.out.print("getArea : "+(last * length));
            return last * length;
        }
        // System.out.print("getArea : "+(first * length));
        return first * length;
    }
}
