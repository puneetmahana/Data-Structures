package BinaryTree;

import java.util.NoSuchElementException;

public class BT {
	private Node root;
	
  public BT(){
	  root = null;
  }
  public boolean isempty(){
	  return root==null;
  }
  public void insert(int data){
	  root = insert(root, data);
  }
   private Node insert(Node node, int data){
	   if(node==null)
		   node = new Node(data);
		   else{
			   if(node.getright()==null)
				   node.right = insert(node.right,data);
			   else
				   node.left = insert(node.left,data);
		   }
		   return node;
	   }
   public int countnodes(){
	   return countnodes(root);
   }
   private int countnodes(Node node){
       if (node == null)
         return 0;
      else{
    	  int num = 1;
    	  num += countnodes(node.getleft());
    	  num += countnodes(node.getright());
    	  return num;
      }
   }
   
   public Boolean search(int val)
   {	
	   if(isempty())
		    throw new NoSuchElementException("Tree is empty");
	   else
       return search(root, val);
   }
   private Boolean search(Node node, int value){
       if (node.getdata() == value)
           return true;
       if (node.getleft() != null)
    	   if (search(node.getleft(), value))
               return true;
       if (node.getright() != null)
           if (search(node.getright(), value))
               return true;
       return false;         
   }
   
   public void inorder()   {
       inorder(root);
   }
   private void inorder(Node node) {
      if (node != null)
       {
           inorder(node.getleft());
           System.out.print(node.getdata() +" ");
           inorder(node.getright());
       }
   }
   public void preorder()   {
       preorder(root);
   }
   private void preorder(Node node) {
      if (node != null)
       {
    	  System.out.print(node.getdata() +" "); 
    	  preorder(node.getleft());
          preorder(node.getright());
       }
   }
   public void postorder()   {
       postorder(root);
   }
   private void postorder(Node node) {
      if (node != null)
       {
    	  postorder(node.getleft());
          postorder(node.getright());
          System.out.print(node.getdata() +" "); 
       }
   }
   
   
   }
