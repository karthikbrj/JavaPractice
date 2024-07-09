public class Stack {
    Node top;
    int size;

    public void push(int ele){
        Node n=new Node(ele);
        if(size==0 && top==null){
            top=n;
        }else{
            n.next=top;
            top=n;
        }
        size++;
    }
    public int pop(){
        if(top==null){
            return 0;
        }else{
            Node temp=top;
            top=top.next;
            temp.next=null;
            return temp.val;
        }
    }
    public int size() {
        return size;
    }
    public int peek() {
        return top.val;
    }
    public void print() {
        if(top==null){
            System.out.println("the size zero");
        } else{
            while (top!=null) {
                top=top.next;
            }
        }
    }
}
