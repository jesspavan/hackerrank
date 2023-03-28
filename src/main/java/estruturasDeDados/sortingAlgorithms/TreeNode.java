package estruturasDeDados.sortingAlgorithms;

  public class TreeNode<TYPE> {
      TYPE val;
      TreeNode<TYPE> left;
      TreeNode<TYPE> right;
      public TreeNode(){

      }
      public TreeNode(TYPE val){
          this.val = val;
      }
      public TreeNode(TYPE val, TreeNode<TYPE> left, TreeNode<TYPE> right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public TYPE getVal() {
          return val;
      }

      public void setVal(TYPE val) {
          this.val = val;
      }

      public TreeNode<TYPE> getLeft() {
          return left;
      }

      public void setLeft(TreeNode<TYPE> left) {
          this.left = left;
      }

      public TreeNode<TYPE> getRight() {
          return right;
      }

      public void setRight(TreeNode<TYPE> right) {
          this.right = right;
      }
  }
