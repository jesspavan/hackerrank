package estruturasDeDados.sortingAlgorithms;
import java.util.Stack;

public class Exe1 {

    public static void main(String[] args){

        int[] inOder = {3, 9, 18, 7, 4, 2 ,6};
        int[] postOrder = {3, 18, 4, 6, 2, 7, 9};

        TreeNode root = buildTree(inOder, postOrder);
        PrintsBinaryTree print = new PrintsBinaryTree();

        print.inOrder(root);
       // print.naturalOrder(root);

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        // If either of the input arrays are empty, the tree is empty, so return null
        if (inorder.length == 0 || postorder.length == 0)
            return null;

        // Initialize indices to the last elements of the inorder and postorder traversals
        int indexIn = inorder.length - 1;
        int indexPost = postorder.length - 1;

        // Create an empty stack to help us build the binary tree
        Stack<TreeNode> stack = new Stack<TreeNode>();

        // Initialize prev to null since we haven't processed any nodes yet
        TreeNode parent = null; //anterior

        // Create the root node using the last element in the postorder traversal
        TreeNode root = new TreeNode(postorder[indexPost]);

        // Push the root onto the stack and move to the next element in the postorder traversal
        stack.push(root);
        indexPost--;
        int cont = 0;

        // Process the rest of the nodes in the postorder traversal
        while (indexPost >= 0) {

            // While the stack is not empty and the top of the stack is the current inorder element
            // então sabemos que já printamos o filho da direita e da esquerda do ultimo nodo
            if (!stack.isEmpty() && stack.peek().val.equals(inorder[indexIn])) {
                // The top of the stack is the parent of the current node, so pop it off the stack and update prev
                stack.pop();
                parent = stack.pop();
                indexIn = indexIn - 2;
            }

            // Create a new node for the current postorder element
            TreeNode newNode = new TreeNode(postorder[indexPost]);

            // If prev is not null, the parent of the current node is prev, so attach the node as the left child of prev
            if (parent != null) {
                parent.left = newNode;
                // If prev is null, the parent of the current node is the current top of the stack, so attach the node as the right child of the current top of the stack
            } else if (!stack.isEmpty()) {
                TreeNode currTop = stack.peek();
                currTop.right = newNode;
            }

            // Push the new node onto the stack, reset prev to null, and move to the next element in the postorder traversal
            stack.push(newNode);
            parent = null;
            indexPost--;
        }

        // Return the root of the binary tree
        return root;
    }
}
