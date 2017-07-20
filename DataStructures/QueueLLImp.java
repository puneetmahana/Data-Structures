import java.util.NoSuchElementException;

public class QueueLLImp {
 
	protected Node front;
	protected Node end;
	public int size;
	
	public QueueLLImp(){
		size=0;
		end=null;
		front=null;
	}
	
	public boolean isempty(){
		return front == null;
	}
	
	public int size(){
		return size;
	}
	
	public void insert(int value){
		Node nptr = new Node(value, null);
		size++;
		if(front==null){
			front=nptr;
			end = nptr;
		}
		else{
			front.setlink(nptr);
			front=front.getlink();
		}
	}
	
	public int remove(){
		if(isempty())
		    throw new NoSuchElementException("Queue is Empty");
		else{
			size--;
			Node ptr =end;
			end = ptr.getlink();
			if(end==null)
				front=null;
			return ptr.getdata();	
		}
	}
	
	public int peek(){
		if(isempty())
	           throw new NoSuchElementException("Queue is Empty");
		return end.getdata();
	}
	
	public void display(){
		System.out.print("Queue: ");
		if(size==0){
			System.out.println("Empty");
			return;
		}
		Node ptr=end;
        while (ptr != front.getlink() )
        {
            System.out.print(ptr.getdata()+" ");
            ptr = ptr.getlink();
        }
        System.out.println();             
			
	}
}
