package BinaryTree;

import java.util.Scanner;

public class BinaryTree
{
 public static void main(String[] args)
 {            
       Scanner scan = new Scanner(System.in);
       BT bt = new BT(); 
       System.out.println("Binary Tree Test\n");          
       char ch;        
       do    
       {
           System.out.println("Binary Tree Operations:");
           System.out.println("1. insert ");
           System.out.println("2. search");
           System.out.println("3. count nodes");
           System.out.println("4. check empty");
           int choice = scan.nextInt();            
           switch (choice)
           {
           case 1 : 
               System.out.println("Enter integer element to insert");
               bt.insert( scan.nextInt() );                     
               break;                          
           case 2 : 
               try{
            	   System.out.println("Enter integer element to search"); 
            	   System.out.println("\nValue found status: "+ bt.search( scan.nextInt()));
               }
               catch(Exception e){
		    		 System.out.println("Error : " +e.getMessage());
		    	}
               break;                                          
           case 3 : 
               System.out.println("Nodes = "+ bt.countnodes());
               break;     
           case 4 : 
               System.out.println("Empty status = "+ bt.isempty());
               break;            
           default : 
               System.out.println("Wrong Entry \n ");
               break;   
           }
           System.out.print("\nPost order : ");
           bt.postorder();
           System.out.print("\nPre order : ");
           bt.preorder();
           System.out.print("\nIn order : ");
           bt.inorder();
           System.out.println("\nDo you want to continue (Type y or n)\n");
           ch = scan.next().charAt(0);                        
       } while (ch == 'Y'|| ch == 'y');               
   }

}
