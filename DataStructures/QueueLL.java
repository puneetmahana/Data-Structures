import java.util.Scanner;

public class QueueLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUEUE IMPLEMENTATION");
		QueueLLImp queuell = new QueueLLImp();
		char ch;
		do{
			System.out.println(" Queue Operations");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. isEmpty?");
			System.out.println("5. size");
			
			int choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter the element to be inserted into queue");
		   		queuell.insert(sc.nextInt());
		    	break;
		    case 2:
		    	try{
		     	System.out.println("Removed Element: " + queuell.remove());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 3:
		    	try{
			    System.out.println("Peek Element : " + queuell.peek());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
			    break;
			case 4:
			    System.out.println("Empty Status : " + queuell.isempty());
			    break;
			case 5:
			    System.out.println("Size : " + queuell.size());
			    break;
			default:
				System.out.println("Wrong Entry");
				break;
		    }
		    queuell.display();
		    System.out.println("Do you want to continue? (Type y or n)");
		    ch = sc.next().charAt(0);
		    
		} while(ch == 'Y' || ch == 'y' );
				
	}

}
