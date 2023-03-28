package estruturasDeDados.sortingAlgorithms;

public class CallBinaryTree {

    public static void main(String[] args){

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(10);
        binaryTree.add(8);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(7);
        binaryTree.add(18);
        binaryTree.add(13);
        binaryTree.add(20);
        PrintsBinaryTree print = new PrintsBinaryTree();

        System.out.println("Inorder");
        print.inOrder(binaryTree.getRoot());

        System.out.println("Preorder");
        print.preOrder(binaryTree.getRoot());

        System.out.println("Postorder");
        print.postOrder(binaryTree.getRoot());
    }
}
