import java.util.Scanner;

public class StackDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Stack IMPLEMENTATION");
		System.out.println("Enter the length of integer Stack");
		int n = sc.nextInt();
		StackDSImplementation stack = new StackDSImplementation(n);
		char ch;
		do{
			System.out.println(" Stack Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. isEmpty?");
			System.out.println("5. isFull?");
			System.out.println("6. Size");
			
			int choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter the element to be inserted");
		    	try{
		    		stack.push(sc.nextInt());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 2:
		    	try{
		     	System.out.println("Removed Element: " + stack.pop());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 3:
		    	try{
			    System.out.println("Peek Element : " + stack.peek());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
			    break;
			case 4:
			    System.out.println("Empty Status : " + stack.isempty());
			    break;
			case 5:
			    System.out.println("Full Status : " + stack.isfull());
			    break;
			case 6:
			    System.out.println("Size : " + stack.size());
			    break;
			default:
				System.out.println("Wrong Entry");
				break;
		    }
		    stack.display();
		    System.out.println("Do you want to continue? (Type y or n)");
		    ch = sc.next().charAt(0);
		    
		} while(ch == 'Y' || ch == 'y' );
				
	}

}
