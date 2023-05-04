package leetCode;

public class P278 {
    public static void main(String[] args) {
        int result1 = firstBadVersion(5); // 4
        int result2 = firstBadVersion(1); // 1
    }

    public static boolean isBadVersion(int version){
        /* The isBadVersion API is defined in the parent class VersionControl. */
        return false;
    }

    public static int firstBadVersion(int n) {

        if(n==1){
            return 1;
        }
        if(n==2){
            return isBadVersion(1) ? 1 : 2;
        }

        int begin = 1;
        int last = n;
        int mid = (begin + last)/2;
        while(begin <= last){
            // last + begin 에서 큰값 만나면 int형 범위 초과.
            mid = begin + (last - begin) / 2;
            if (isBadVersion(mid)) {
                last = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return begin;

        // int mid = n/2;
        // int front = 0;
        // int last = n;
        // while(true){
        //     if(isBadVersion(mid)){
        //         if(!isBadVersion(mid-1)){
        //             return mid;
        //         }
        //         front = mid+1;
        //         mid = (front+last)/2;
        //     }else{
        //         if(isBadVersion(mid+1)){
        //             return mid+1;
        //         }else{
        //             last = mid-1;
        //             mid = (front+last)/2;
        //         }
        //     }
    }
}
