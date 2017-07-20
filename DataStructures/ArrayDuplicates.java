import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ArrayDuplicates {
	
	static int[] getRandomArray(int length){
		int random[] = new int[length];
		for(int i=0;i<length;i++)
			random[i] = (int) (Math.random()*15);
		return random;
	}
	
	static void Duplicates(int a[]){
		Set<Integer> set = new HashSet<Integer>();
		boolean bool = false;
		for(int value:a){
			if(!set.contains(value))
				set.add(value);
			else
				{System.out.println("Duplicate number:"+ value);
			     bool = true;
				}
						
		}
		if(bool == false)
			System.out.println("\n" + "Duplicates Not Found");
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int n = Integer.parseInt(sc.nextLine());
		if(n<2){
			System.out.println("No Duplicates Found.");
		}
		int a[] = getRandomArray(n);
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println("\n");
		Duplicates(a);
		
	}

}
