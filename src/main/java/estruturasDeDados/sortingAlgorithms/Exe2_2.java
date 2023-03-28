package estruturasDeDados.sortingAlgorithms;

import java.util.*;

public class Exe2_2 {

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

        List<List<Integer>> lista = new ArrayList<>();
        lista = levelOrderBottom(tree.getRoot());

        for (int i=0; i<lista.size(); i++){
            System.out.println("\nCamada "+i);
            for(int j=0; j<lista.get(i).size(); j++){
                System.out.println(lista.get(i).get(j));
            }
        }

    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        traverseBST(root, map, 0);
        List<List<Integer>> result = new ArrayList<>();

        for (int key : map.keySet()){
            result.add(map.get(key));
        }

        System.out.println("Teste: ");
        System.out.println(map.entrySet());

        return result;
    }

    private static void traverseBST(TreeNode<Integer> node, Map<Integer, List<Integer>> map, int lvl) {
        if (node == null) return;

        lvl++;

        traverseBST(node.left, map, lvl);

        if (map.containsKey(lvl)) {
            map.get(lvl).add(node.getVal());
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(node.getVal());
            map.put(lvl, list);
        }

        List<Integer> list = new Vector<>();
        traverseBST(node.right, map, lvl);
    }
}
