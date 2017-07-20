package Heap;

public class maxH {

	private int[] heap;
	private int size;
	private int maxsize;
	
	public static final int front =1;
	
	public maxH(int maxsize){
		this.maxsize = maxsize;
		this.size=0;
		heap = new int[maxsize +1];
		heap[0] = Integer.MAX_VALUE;
	}	
     private int parent(int pos){
    	 
    	 return pos/2;
     }
     
     private int leftchild(int pos){
    	 return (pos*2);
     }
     
     private int rightchild(int pos){
    	 return ((2*pos)+1);
     }
     
     private boolean isleaf(int pos){
    	 if((pos>=size/2) && (pos<=size)){
    		 return true;
    	 }
    	 else
    		 return false;
     }
     
     private void swap(int fpos, int spos){
    	 int tmp;
    	 tmp = heap[fpos];
    	 heap[fpos] = heap[spos];
    	 heap[spos] = tmp;
     }
     
     public void insert(int element){
    	 heap[++size] = element;
         int current = size;
         while(heap[current]>heap[parent(current)]){
        	 swap(current,parent(current));
        	 current = parent(current);
         }
     }
     public void print()
     {
         for (int i = 1; i <= size / 2; i++ )
         {
           System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i] 
                 + " RIGHT CHILD :" + heap[2 * i  + 1]);
             System.out.println();
         } 
     }
     public void maxHeap()
     {
         for (int pos = (size / 2); pos >= 1 ; pos--)
         {
             maxHeapify(pos);
         }
     }
     private void maxHeapify(int pos)
     {
         if (!isleaf(pos))
         { 
             if (heap[pos] < heap[leftchild(pos)]  || heap[pos] < heap[rightchild(pos)])
             {
                 if (heap[leftchild(pos)] > heap[rightchild(pos)])
                 {
                     swap(pos, leftchild(pos));
                     maxHeapify(leftchild(pos));
                 }else
                 {
                     swap(pos, rightchild(pos));
                     maxHeapify(rightchild(pos));
                 }
             }
         }
     }
     public int remove()
     {
         int popped = heap[front];
         heap[front] = heap[size--]; 
         maxHeapify(front);
         return popped;

     }
    
}

