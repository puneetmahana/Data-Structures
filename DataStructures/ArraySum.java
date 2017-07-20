import java.util.*;


public class ArraySum {
	
	static int[] getRandomArray(int length){
		int random[] = new int[length];
		for(int i=0;i<length;i++)
			random[i] = (int) (Math.random()*15);
		return random;
	}
	
	static void pairSet(int a[], int sum){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		boolean bool = false;
		for(int value:a){
			int difference = sum - value;
			if(!map.containsKey(difference))
				map.put(value,difference);
			else
				{System.out.println("Pair of numbers:"+ value + " " + difference);
			     bool = true;
				}
						
		}
		if(bool == false)
			System.out.println("\n" + "Pair Not Found");
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int n = Integer.parseInt(sc.nextLine());
		if(n<2){
			System.out.println("Length of array cannot be less than 2."+"\n"+"Re-enter the length of array:");
		    n = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter value of the sum:");
		int k = Integer.parseInt(sc.nextLine());
		int a[] = getRandomArray(n);
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println("\n");
		pairSet(a,k);
		
	}

}
