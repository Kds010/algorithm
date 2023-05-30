package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Fail to Solve

public class P131 {
    public static void main(String[] args) {
        String c1 = "aab";
        System.out.println(partition(c1));
    }

    public static List<List<String>> partition(String s) {
        //Approach: Using Backtracking, T.C: O(n^2)
        if(s==null || s.length()==0) return new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, new ArrayList<>());
        return ans;
    }
    public static void helper(String s, List<List<String>> ans, List<String> level){
        //base case
        if(s==null || s.length()==0){
            ans.add(new ArrayList<>(level));
            return;
        }

        //iterate, here i=1 because we are going to use substring method
        for(int i=1;i<=s.length();i++){
            String temp = s.substring(0, i);

            //if not palindrome then continue
            if(!isPalindrome(temp)) continue;
            System.out.println();
            //add to level list
            level.add(temp);

            //call recursion
            helper(s.substring(i, s.length()), ans, level);

            //remove from the level list
            level.remove(level.size()-1);
        }
        return;
    }
    //using binary search algo
    public static boolean isPalindrome(String temp){
        int left = 0, right = temp.length()-1;
        while(left<=right){
            if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//    public static List<List<String>> partition(String s) {
//        List<String> tempList = new ArrayList<>();
//        List<List<String>> result = new ArrayList<>();
//        Set<String> temp = new HashSet<String>();
//        int length = s.length();
//
//        if(length == 1){
//            tempList.add(s);
//            result.add(tempList);
//            return result;
//        }
//
//        for(String a : s.split("")){
//            if(tempList.get(tempList.size()-1) == a){
//                List<String> secTemp = tempList;
//                String b = tempList.get(tempList.size()-1) + a;
//                secTemp.add(b);
//                tempList.add(a);
//            }else{
//                tempList.add(a);
//            }
//        }
//
//        return result;
//    }
}
