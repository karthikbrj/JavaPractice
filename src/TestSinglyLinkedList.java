public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        System.out.println("--------------");
        // s.insert(0, 5);
        // s.insert(2, 60);
        // s.remove(1);
        // System.out.println(s.get(0));
        s.reverseElements();

    }
}
