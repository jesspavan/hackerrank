package estruturasDeDados.sortingAlgorithms;

import java.util.*;

public class Exe2_3 {

    public static void main(String[] args) {

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

        List<List<Integer>> lista = new ArrayList<>();
        lista = levelOrderBottom(tree.getRoot());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\nCamada " + i);
            for (int j = 0; j < lista.get(i).size(); j++) {
                System.out.println(lista.get(i).get(j));
            }
        }

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode<Integer> root) {

        Map<Integer, List> map = new TreeMap<>(Collections.reverseOrder());
        List<List<Integer>> result = new ArrayList<>();

        insertMapping(root, map, 0);

        for(int i=1; i<= map.size(); i++){
            result.add(map.get(i));
        }

        return result;
    }

    public static void insertMapping(TreeNode<Integer> node, Map<Integer, List> map, int level){

        if(node == null){
            return;
        }

        level++;

        insertMapping(node.getLeft(), map, level);
        if(map.get(level) == null){
            List<Integer> newLevelArray = new ArrayList<>();
            newLevelArray.add(node.getVal());
            map.put(level, newLevelArray);
        }else{
            map.get(level).add(node.getVal());
        }

        insertMapping(node.getRight(), map, level);
    }
}

