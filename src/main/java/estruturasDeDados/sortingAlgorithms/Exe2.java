package estruturasDeDados.sortingAlgorithms;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exe2 {

    public static void main(String[] args){

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(3);

        TreeNode<Integer> node9 = new TreeNode<>();
        node9.setVal(9);
        tree.getRoot().setLeft(node9);
//
//        TreeNode<Integer> node4 = new TreeNode<>();
//        node4.setVal(4);
//        node9.setRight(node4);
//
//        TreeNode<Integer> node5 = new TreeNode<>();
//        node5.setVal(5);
//        node9.setLeft(node5);

        TreeNode<Integer> node20 = new TreeNode<>();
        node20.setVal(20);
        tree.getRoot().setRight(node20);

        TreeNode<Integer> node15 = new TreeNode<>();
        node15.setVal(15);
        node20.setLeft(node15);

        TreeNode<Integer> node7 = new TreeNode<>();
        node7.setVal(7);
        node20.setRight(node7);

        PrintsBinaryTree print = new PrintsBinaryTree();

     //   System.out.println("Inorder");
      //  print.inOrder(tree.getRoot());

        levelOrderBottom(tree.getRoot());

    }
    public static List<List<Integer>> levelOrderBottom(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stackInteger = new Stack<>();
        stackTheTreeInOrder(root, stackInteger);
        ArrayList<Integer> arrayAux = new ArrayList<>();

        int numberNodes = stackInteger.size();
        int numberLevels = ((int) (Math.log(numberNodes) / Math.log(2))) + 1;
        System.out.println("Number of Levels: "+numberLevels);

        for(int i=0; i<numberLevels; i++){
            ArrayList<Integer> newArray = new ArrayList<>();
            result.add(newArray);
        }

        while (!stackInteger.isEmpty()){
            arrayAux.add(stackInteger.pop());
        }



        int j=0;
        for(int i=0; i< arrayAux.size(); i++){
            System.out.println(arrayAux.get(i));
            if(numberNodes/2 != i){
                result.get(j).add(arrayAux.get(i));
            }

            j++;
            if(j== (numberLevels-1)){
                j=0;
            }

        }

        result.get(numberLevels-1).add(arrayAux.get(numberNodes/2));




        System.out.println("\nPrimeiro array: ");
        for(int i=0; i< result.get(0).size(); i++){
            System.out.println(result.get(0).get(i));
        }

        return result;
    }

    public static Stack<Integer> stackTheTreeInOrder(TreeNode<Integer> root, Stack<Integer> stackInteger){

        if(root != null){
            stackTheTreeInOrder(root.getRight(), stackInteger);
            stackInteger.push(root.getVal());
            stackTheTreeInOrder(root.getLeft(), stackInteger );
        }

        return stackInteger;
    }
}
