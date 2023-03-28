package estruturasDeDados.sortingAlgorithms;
import java.lang.Comparable;

public class BinaryTree<TYPE extends Comparable>  {

    private TreeNode<TYPE> root;

    public BinaryTree(){
        this.root = null;
    }

    public TreeNode<TYPE> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<TYPE> root) {
        this.root = root;
    }

    public void add(TYPE value){
        TreeNode<TYPE> newNode = new TreeNode<TYPE>(value);
        if(this.root == null){
            this.root = newNode;
        }else{
            TreeNode<TYPE> current = this.root;
            while (true) {
                if (newNode.getVal().compareTo(current.getVal()) == -1) { // Se o novo valor é menor
                    if (current.getLeft() != null) {                          //-1 = smaller; 1 = bigger; 0 = equal
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else { // Se o novo valor é maior ou igual
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }

                }
            }
        }
    }

}
