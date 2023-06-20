package leetCode;

import leetCode.model.TreeNode;

public class P129 {
    public static void main(String[] args) {
//        TreeNode c1 = new TreeNode(1);
//        c1.left = new TreeNode(2);
//        c1.right = new TreeNode(3);
//        System.out.print("sumNumbers : "+sumNumbers(c1));

        TreeNode c2 = new TreeNode(4);
        c2.left = new TreeNode(9);
        c2.right = new TreeNode(0);
        c2.left.left = new TreeNode(5);
        c2.left.right = new TreeNode(1);
        System.out.print("sumNumbers : "+sumNumbers(c2));
    }
    public static int sumNumbers(TreeNode root) {
        int result = 0;
        String tempStr = "";

        if(root == null){
            return 0;
        }

        result = calc(root, tempStr, result);
        return result;
    }

    public static int calc(TreeNode root, String tempStr, int result){

        if(root == null){
            return Integer.valueOf(tempStr).intValue();
        }else{
            tempStr += Integer.toString(root.val);
            if(root.left == null){
                result += Integer.valueOf(tempStr).intValue();
                System.out.print("left result : "+ result);
                System.out.print(". left root.val : "+ root.val);
                System.out.println(". left tempStr : "+ tempStr);
                return Integer.valueOf(tempStr).intValue();
            }else{
                System.out.println(". left tempStr : "+ tempStr);
                result += calc(root.left, tempStr, result);
            }

            if(root.right == null){
                System.out.print("right result : "+ result);
                System.out.print(". right root.val : "+ root.val);
                System.out.println(". right tempStr : "+ tempStr);
                return Integer.valueOf(tempStr).intValue();
            }else {
                System.out.println(". right tempStr : " + tempStr);
                result += calc(root.right, tempStr, result);
            }

            return result;
        }
    }
}
