package Heap;

public class minHeap {

    public static void main(String...arg)
    {
        System.out.println("The Min Heap is ");
        minH mh = new minH(15);
        mh.insert(5);
        mh.insert(3);
        mh.insert(17);
        mh.insert(10);
        mh.insert(84);
        mh.insert(19);
        mh.insert(6);
        mh.insert(22);
        mh.insert(9);
        mh.minHeap();
        mh.print();
        mh.remove();
        mh.print();
        System.out.println("The Min val is " + mh.remove());
    }
}
