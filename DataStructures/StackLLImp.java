import java.util.NoSuchElementException;

public class StackLLImp {
 
	protected Node top;
	public int size;
	
	public StackLLImp(){
		size=0;
		top=null;
	}
	
	public boolean isempty(){
		return top == null;
	}
	
	public int size(){
		return size;
	}
	
	public void push(int value){
		Node nptr = new Node(value, null);
		size++;
		if(top==null){
			top=nptr;
		}
		else{
			nptr.setlink(top);
			top=nptr;
			
		}
	}
	
	public int pop(){
		if(isempty())
		    throw new NoSuchElementException("Stack is Empty");
		else{
			size--;
			Node ptr=top;
			top = ptr.getlink();
			return ptr.getdata();
		}
	}
	
	public int peek(){
		if(isempty())
	           throw new NoSuchElementException("Stack is Empty");
		return top.getdata();
	}
	
	public void display(){
		System.out.print("Stack: ");
		if(size==0){
			System.out.println("Empty");
			return;
		}
		Node ptr=top;
        while (ptr != null)
        {
            System.out.print(ptr.getdata()+" ");
            ptr = ptr.getlink();
        }
        System.out.println();        
			
	}
}
