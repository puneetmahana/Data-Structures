package Heap;

public class maxHeap {

    public static void main(String[] arg)
    {
        System.out.println("The Max Heap is ");
        maxH mh = new maxH(15);
        mh.insert(5);
        mh.insert(3);
        mh.insert(17);
        mh.insert(10);
        mh.insert(84);
        mh.insert(19);
        mh.insert(6);
        mh.insert(22);
        mh.insert(9);
        mh.maxHeap();
        mh.print();
        System.out.println("The Max val is " + mh.remove());
    }
}
