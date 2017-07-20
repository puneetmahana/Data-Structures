package BinaryTree;

public class BinaryST {
	private Node root;
	
	public BinaryST(){
		root = null;
	}
	
	public boolean isempty(){
		return root==null;
	}
	
	public void insert(int data){
	  root = insert(root,data);
	}
	private Node insert(Node node, int data){
		if(node == null)
			node = new Node(data);
		else{
			if(data<node.getdata())
				node.left = insert(node.left,data);
			else
				node.right = insert(node.right,data);
		}
		return node;
	}
	
	public void delete(int element){
		if(isempty())
			System.out.println("Tree Empty");
		else if(search(element) == false)
			System.out.println("The value " +element+ " is not found.");
		else{
			root = delete(root, element);
			System.out.println(element + " is deleted");
		}
	}
	
	private Node delete(Node node, int value){
	     {
	         Node p, p2, n;
	         if (node.getdata() == value)
	         {
	             Node lt, rt;
	             lt = node.getleft();
	             rt = node.getright();
	             if (lt == null && rt == null)
	                 return null;
	             else if (lt == null)
	             {
	                 p = rt;
	                 return p;
	             }
	             else if (rt == null)
	             {
	                 p = lt;
	                 return p;
	             }
	             else
	             {
	                 p2 = rt;
	                 p = rt;
	                 while (p.getleft() != null)
	                     p = p.getleft();
	                 p.setleft(lt);
	                 return p2;
	             }
	         }
	         if (value < node.getdata())
	         {
	             n = delete(node.getleft(), value);
	             node.setleft(n);
	         }
	         else
	         {
	             n = delete(node.getright(), value);
	             node.setright(n);             
	         }
	         return root;
	     }
	}
	public boolean search(int val)
	   {
	       return search(root, val);
	   }
	private Boolean search(Node node, int value){
	  boolean found = false;
	  while((node!=null) && !found){
		  int currvalue = node.getdata();
		  if(value < currvalue)
			  node = node.getleft();
		  else if (value > currvalue)
			  node = node.getright();
		  else{
			  found = true;
			  break;
		  }
		  found = search(node, value);
			  
	  }
	  return found;
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
