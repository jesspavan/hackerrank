package estruturasDeDados.sortingAlgorithms;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
 }
public class Exe3_3 {

    public static void main(String[] args){

        int[] input = {0,1,2,3,4,5};
        ListNode node0 = new ListNode(-10);
        ListNode node1 = new ListNode(-3);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(9);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

  //      TreeNode<Integer> root = sortedListToBST(node0);

        PrintsBinaryTree print = new PrintsBinaryTree();
   //     print.inOrder(root);
    }
 //   public static TreeNode sortedListToBST(ListNode head) {

    //    return setLeftAndRight(head, 0, nums.length-1);
//    }

    public static TreeNode<Integer> setLeftAndRight(int[] nums, int inicio, int fim){

        if(inicio>fim){
            return null;
        }
        int middle = (fim + inicio)/2;

        TreeNode<Integer> root = new TreeNode<>(nums[middle]);

        root.setLeft(setLeftAndRight(  nums, inicio, middle-1  ));
        root.setRight(setLeftAndRight(  nums, middle+1, fim ));

        return root;
    }


}
