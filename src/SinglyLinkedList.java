public class SinglyLinkedList {
    private Node head;
    private  Node last;
    private int size;

    SinglyLinkedList(Node head,Node last){
        this.last=last;
        this.head=head;
    }
    SinglyLinkedList(){
        super();
    }

    public void add(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            last=n;
        }else{
            Node temp=head;
            last.next=n;
            last=n;
        }
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            Node temp=head;
            for(int i=0;i<size;i++){
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
    }

    public int size(){
        if(size==0){
            return 0;
        }else{
            return size;
        }
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    public boolean contains(int data){
        if(head==null){
            return false;
        }else{
            Node temp=head;
            for(int i=0;i<size;i++){
                int d=temp.val;
                if(d==data){
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }

    public void insert(int pos,int data){
        Node n=new Node(data);

        if(head==null || pos>size){
            System.out.println("list is empty and pos is less than size");
        }else{
            if(pos==0){
                n.next=head;
                head=n;

            }else{
                    Node temp=head;
                    for(int i=0;i<pos-1;i++){
                        temp=temp.next;
                    }
                     n.next=temp.next;
                     temp.next=n;
                }
        }
        size++;
    }

    public int remove(int pos){
        if(head==null || pos>=size){
            return 0;
        }else{
            if(pos==0){
                int d=head.val;
                head=head.next;
                size--;
                return d;
            }else{
                Node temp=head;
                for(int i=0;i<pos-1;i++){
                    temp=temp.next;
                }
                Node remove=temp.next;
                temp.next=remove.next;
                remove.next=null;
                size--;
                return remove.val;
            }
        }
    }

    public int get(int pos){
        if(head==null || pos>=size){
            throw new IllegalArgumentException("give proper input");
        }else{
            Node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            return temp.val;
        }
    }

    public void clear(){
        head=last=null;
        size=0;
    }
    public int findMiddleElement() {
		Node first = head;
		Node second = head;
		while (second.next != null && second.next.next != null) {
			first = first.next;
			second = first.next.next;
		}
		return first.val;
	}

    public boolean isCycle(){
        if(head==null || size==1){
            return false;
        }else{
            Node first = head;
            Node second = head;
            while(first.next!=null && second.next.next !=null && first !=second){
                first = first.next;
                second = second.next.next;
            }
            if(first==second){
                return true;
            }else{
                return false;
            }
        }

    }


}
