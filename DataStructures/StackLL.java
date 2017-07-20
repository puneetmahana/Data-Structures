import java.util.Scanner;

public class StackLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Stack IMPLEMENTATION");
		StackLLImp stackll = new StackLLImp();
		char ch;
		do{
			System.out.println(" Stack Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. isEmpty?");
			System.out.println("5. size");
			
			int choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter the element to be pushed into stack");
		   		stackll.push(sc.nextInt());
		    	break;
		    case 2:
		    	try{
		     	System.out.println("Removed Element: " + stackll.pop());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 3:
		    	try{
			    System.out.println("Peek Element : " + stackll.peek());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
			    break;
			case 4:
			    System.out.println("Empty Status : " + stackll.isempty());
			    break;
			case 5:
			    System.out.println("Size : " + stackll.size());
			    break;
			default:
				System.out.println("Wrong Entry");
				break;
		    }
		    stackll.display();
		    System.out.println("Do you want to continue? (Type y or n)");
		    ch = sc.next().charAt(0);
		    
		} while(ch == 'Y' || ch == 'y' );
				
	}

}
