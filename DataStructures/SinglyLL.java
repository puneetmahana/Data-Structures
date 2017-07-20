import java.util.Scanner;

public class SinglyLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SINGLY LINKED LIST IMPLEMENTATION");
		SLinkedList sll = new SLinkedList();
		char ch;
		do{
			System.out.println(" Linked List Operations");
			System.out.println("1. Insert at Beginning");
			System.out.println("2. Insert at end");
			System.out.println("3. Insert at Position");
			System.out.println("4. Delete at Position");
			System.out.println("5. isempty");
			System.out.println("6. Size");
			
			int choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter the element to be inserted at the beginning");
		    		sll.insertatstart(sc.nextInt());
		    	break;
		    case 2:
		    	System.out.println("Enter the element to be inserted at the end");
		    	  sll.insertatend(sc.nextInt());
		    	break;
		    case 3:
		    	System.out.println("Enter the element to be inserted at a specific position");
		    	int element = sc.nextInt();
		    	System.out.println("specify position where the element has to be inserted");
		    	int pos = sc.nextInt();
                if (pos <= 1 || pos > sll.size() )

                    System.out.println("Invalid position\n");

                else
		    	sll.insertatpos(element,pos);
		    	break;
			case 4:
				System.out.println("Enter the position from which the element has to be deleted");
                int p = sc.nextInt() ;
                if (p < 1 || p > sll.size() )

                    System.out.println("Invalid position\n");

                else
				sll.deleteatpos(p);
		    	break;
			case 5:
			    System.out.println("Full Status : " + sll.isempty());
			    break;
			case 6:
			    System.out.println("Size : " + sll.size());
			    break;
			default:
				System.out.println("Wrong Entry");
				break;
		    }
		    sll.display();
		    System.out.println("Do you want to continue? (Type y or n)");
		    ch = sc.next().charAt(0);
		    
		} while(ch == 'Y' || ch == 'y' );
				
	}

}
