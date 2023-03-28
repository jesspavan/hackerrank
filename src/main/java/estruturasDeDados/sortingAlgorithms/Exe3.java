package estruturasDeDados.sortingAlgorithms;

public class Exe3 {

    public static void main(String[] args){

        int[] input = {0,1,2,3,4,5,6,7};
        TreeNode<Integer> root = sortedArrayToBST(input);

        PrintsBinaryTree print = new PrintsBinaryTree();
        print.inOrder(root);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    private static TreeNode CreateBST(int nums[], int left, int right) {

        if (left > right)
            return null;

        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);

        root.left = CreateBST(nums, left, m - 1);
        root.right = CreateBST(nums, m+ 1, right);

        return root;
    }
}
