import java.util.NoSuchElementException;

public class StackDSImplementation {
	
	int top, len, size;
	int stack[];
	
	public StackDSImplementation(int tsize){
		top=-1;
		len =0;
		size = tsize;
		stack = new int[tsize];
	}
	
	public boolean isempty(){
		return top == -1;
	}
	public boolean isfull(){
		return top==size-1;
	}
	public int size(){
		return len;
	}
	public int peek(){
		if(isempty())
	           throw new NoSuchElementException("Stack is Empty");
		return stack[top];
	}
	public void push(int element){
		if(top+1 >= size){
            throw new IndexOutOfBoundsException("Overflow Exception");
		}
		if(top+1<size){
			stack[++top] = element;
		}
		len++;
	}
	public int pop(){
		if(isempty())
			throw new NoSuchElementException("Stack is Empty");
		else{
			len--;
			int element = stack[top];
			top--;
			return element;
		}
	}
	public void display(){
		System.out.print("Stack: ");
		if(len==0){
			System.out.println("Empty");
			return;
		}
		for(int i = top; i>=0; i--)
			System.out.print(stack[i] + " ");
	    System.out.println("\n");
			
	}

}
