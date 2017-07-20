import java.util.Scanner;

public class QueueDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUEUE IMPLEMENTATION");
		System.out.println("Enter the length of integer queue");
		int n = sc.nextInt();
		QueueDSImplementation queue = new QueueDSImplementation(n);
		char ch;
		do{
			System.out.println(" Queue Operations");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
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
		    		queue.insert(sc.nextInt());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 2:
		    	try{
		     	System.out.println("Removed Element: " + queue.remove());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
		    	break;
		    case 3:
		    	try{
			    System.out.println("Peek Element : " + queue.peek());
		    	}
		    	catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
			    break;
			case 4:
			    System.out.println("Empty Status : " + queue.isempty());
			    break;
			case 5:
			    System.out.println("Full Status : " + queue.isfull());
			    break;
			case 6:
			    System.out.println("Size : " + queue.size());
			    break;
			default:
				System.out.println("Wrong Entry");
				break;
		    }
		    queue.display();
		    System.out.println("Do you want to continue? (Type y or n)");
		    ch = sc.next().charAt(0);
		    
		} while(ch == 'Y' || ch == 'y' );
				
	}

}
