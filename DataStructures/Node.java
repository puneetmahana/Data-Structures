
public class Node {

	protected Node next;
	protected int data;
	
	public Node(){
		next=null;
		data=0;
	}
	
	public Node(int d, Node n){
		data =d;
		next =n;
	}
	public void setlink(Node n){
		next = n;
	}
	public void setdata(int d){
		data = d;
	}
	public Node getlink(){
		return next;
	}
	public int getdata(){
		return data;
	}
}
