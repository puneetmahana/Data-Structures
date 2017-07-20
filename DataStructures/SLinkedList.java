
public class SLinkedList {
	
	protected Node start;
	protected Node end;
	int size;
	
	public void SLinkedList(){
		size=0;
		start=null;
		end=null;
	}
	
	public boolean isempty(){
		if(start==null)
			return true;
		else
			return false;
	}
	
	public int size(){
		return size;
	}
	
	public void insertatstart(int element){
		Node nptr = new Node(element, null);
		size++;
		if(start==null){
			start=nptr;
			end=start;
		}
		else
			nptr.setlink(start);
		    start=nptr;
	}
	
	public void insertatend(int element){
		Node nptr = new Node(element, null);
		size++;
		if(start==null){
			start=nptr;
			end=start;
		}
		else{
			end.setlink(nptr);
			end = nptr;
		}
	}
	
	public void insertatpos(int element, int pos){
		Node nptr = new Node(element, null);
		size++;
		Node ptr = start;
		pos = pos-1;
		for(int i=1;i<size;i++){
			if(i==pos){
				Node tmp = ptr.getlink();
				ptr.setlink(nptr);
				nptr.setlink(tmp);
				break;
			}
			ptr=ptr.getlink();
		}
		
	}
	
	public void deleteatpos(int pos){
		if(pos == 1){
			start=start.getlink();
			size--;
			return;
		}
		if(pos==size){
			Node s = start;
			Node t = start;
			while(s!=end){
				t=s;
				s=s.getlink();
			}
			end=t;
			end.setlink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos=pos-1;
		for(int i=1;i<size-1;i--){
			if(i==pos){
				Node tmp=ptr.getlink();
				tmp = tmp.getlink();
				ptr.setlink(tmp);
				break;
			}
			ptr=ptr.getlink();
		}
		size--;
	}
	
	public void display(){
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getlink() == null) 
        { 
        	System.out.println(start.getdata() );
        	return;
        }
        Node ptr=start;
        System.out.print(start.getdata()+ "->");
        ptr = start.getlink();
        while (ptr.getlink() != null)
        {
            System.out.print(ptr.getdata()+ "->");
            ptr = ptr.getlink();
        }
        System.out.print(ptr.getdata()+ "\n");
	}

}
