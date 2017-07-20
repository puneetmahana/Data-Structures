package BinaryTree;

public class Node {
	
	Node left;
	Node right;
	int data;
	
	public Node(){
		left=null;
		right=null;
		data=0;
	}
    public Node(int n){
        left = null;
        right = null;
        data = n;
    }
    public void setleft(Node n){
    	left = n;
    }
    public void setright(Node n){
    	right = n;
    }
    public Node getleft(){
     return left;
    }
    public Node getright(){
    	return right;
    }
    public void setdata(int d){
    	data =d;
    }
    public int getdata(){
    	return data;
    }

}