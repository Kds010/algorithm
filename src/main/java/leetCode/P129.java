package leetCode;

import leetCode.model.TreeNode;

public class P129 {
    public static void main(String[] args) {
        TreeNode c1 = new TreeNode(1);
        c1.left = new TreeNode(2);
        c1.right = new TreeNode(3);
        System.out.println("C1 25   sumNumbers : "+sumNumbers(c1));

        TreeNode c2 = new TreeNode(4);
        c2.left = new TreeNode(9);
        c2.right = new TreeNode(0);
        c2.left.left = new TreeNode(5);
        c2.left.right = new TreeNode(1);
        System.out.println("C2 1026 sumNumbers : "+sumNumbers(c2));

        TreeNode c3 = new TreeNode(0);
        c3.left = new TreeNode(1);
        System.out.println("C3 1    sumNumbers : "+sumNumbers(c3));

        TreeNode c4 = new TreeNode(1);
        c4.left = new TreeNode(0);
        System.out.println("C4 10   sumNumbers : "+sumNumbers(c4));

        TreeNode c5 = new TreeNode(1);
        c5.right = new TreeNode(5);
        System.out.println("C5 15   sumNumbers : "+sumNumbers(c5));
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
            System.out.println("tempStr : "+tempStr);
            int temp = 0;
            if(root.left == null && root.right == null){
                return Integer.valueOf(tempStr).intValue();
            }

            if(root.left != null){
                temp += calc(root.left, tempStr, result);
            }
            if(root.right != null){
                temp += calc(root.right, tempStr, result);
            }

            result += temp;

            return result;
        }
    }
}
