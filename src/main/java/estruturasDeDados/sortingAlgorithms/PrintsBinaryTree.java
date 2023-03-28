package estruturasDeDados.sortingAlgorithms;

public class PrintsBinaryTree<TYPE> {

    public void inOrder(TreeNode current){
        if(current != null) {
            inOrder(current.getLeft());
            System.out.println(current.getVal());
            inOrder(current.getRight());
        }
    }

    public void preOrder(TreeNode current){
        if(current != null) {
            System.out.println(current.getVal());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void postOrder(TreeNode current){
        if(current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.println(current.getVal());
        }
    }

    public void naturalOrder(TreeNode current){
        if(current != null) {
            System.out.println(current.getVal());
            naturalOrder(current.getLeft());
            naturalOrder(current.getRight());
        }

    }
}
