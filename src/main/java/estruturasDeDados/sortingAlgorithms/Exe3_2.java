package estruturasDeDados.sortingAlgorithms;

public class Exe3_2 {

    public static void main(String[] args){

        int[] input = {0,1,2,3,4,5};
        TreeNode<Integer> root = sortedArrayToBST(input);

        PrintsBinaryTree print = new PrintsBinaryTree();
        print.inOrder(root);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {

        int middle = (nums.length-1)/2;
        TreeNode<Integer> root = new TreeNode<>(nums[middle]);
        TreeNode<Integer> current = root;

        for(int i=0; i< middle; i++){
            current = setLeftAndRight(current, i, nums);
        }

        current = root;
        for(int i=middle+1; i < nums.length; i++){
            current = setLeftAndRight(current, i, nums);
        }

        return root;
    }

    public static TreeNode<Integer> setLeftAndRight(TreeNode<Integer> current, int i, int[] nums){
        TreeNode<Integer> newNode = new TreeNode<>(nums[i]);
        if(current.getVal() > nums[i]){
            current.setLeft(newNode);
            return current.getLeft();
        }else{
            current.setRight(newNode);
            return current.getRight();
        }
    }


}
