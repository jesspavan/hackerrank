package estruturasDeDados.sortingAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class Exe1_2 {

    public static void main(String[] args){

        int[] inOder = {9, 3, 15, 20, 7};
        int[] postOrder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inOder, postOrder);
        PrintsBinaryTree print = new PrintsBinaryTree();

        print.postOrder(root);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);

        }

        return helper(postorder, 4);

    }

    private static TreeNode helper(int[] postorder, int indexRoot) {

        if(indexRoot <0){
            return null;
        }
        // the last value of postorder vector is the root of binary tree
        TreeNode root = new TreeNode(postorder[indexRoot]);
        indexRoot = indexRoot - 4;

        root.left = helper(postorder, indexRoot);
        root.right = helper(postorder, indexRoot);
        return root;

    }

    private TreeNode helper(Map<Integer, Integer> map, int[] postorder, int inLeft, int inRight, int poLeft, int poRight) {
        if (inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[poRight]);
        int inMid = map.get(root.val);

        root.left = helper(map, postorder, inLeft, inMid - 1, poLeft, poLeft + inMid - inLeft - 1);
        root.right = helper(map, postorder, inMid + 1, inRight, poRight - inRight + inMid, poRight - 1);
        return root;
    }
}


