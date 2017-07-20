import java.util.NoSuchElementException;

public class QueueDSImplementation {
	
	int front, rear, len, size;
	int queue[];
	
	public QueueDSImplementation(int tsize){
		front = -1;
		rear = -1;
		len =0;
		size = tsize;
		queue = new int[tsize];
	}
	
	public boolean isempty(){
		return front == -1;
	}
	public boolean isfull(){
		return front == 0 && rear == size -1;
	}
	public int size(){
		return len;
	}
	public int peek(){
		if(isempty())
	           throw new NoSuchElementException("Queue is Empty");
		return queue[front];
	}
	public void insert(int element){
		if(rear==-1){
			front =0;
			rear =0;
			queue[rear] = element;
		}
		else if(rear+1 >= size){
            throw new IndexOutOfBoundsException("Overflow Exception");
		}
		else if(rear+1<size){
			queue[++rear] = element;
		}
		len++;
	}
	public int remove(){
		if(isempty())
			throw new NoSuchElementException("Queue is Empty");
		else{
			len--;
			int element = queue[front];
			if(front == rear){
				front = -1;
				rear =-1;
			}
			else
				front++;
			return element;
		}
	}
	public void display(){
		System.out.print("Queue: ");
		if(len==0){
			System.out.println("Empty");
			return;
		}
		for(int i = front; i<=rear; i++)
			System.out.print(queue[i] + " ");
	    System.out.println("\n");
			
	}

}
