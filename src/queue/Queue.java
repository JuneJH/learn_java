package queue;

public class Queue {
    Node head;
    Node tail;
    class Node{
        Node next;
        int val;
        public Node(){}
        public Node(int i){
            val = i;
        }
    }
    private int size = 0;

    public Queue(){
        head = tail = new Node();
    }

    public void add (int i){
        Node newNode = new Node(i);
        tail.next = newNode;
        tail = tail.next;
        size ++;
    }

    public int poll(){
        Node currHead = head.next;

        if(currHead == null){
            tail = head;
            return  0;
        }else{
            head.next = currHead.next;
        }

        size --;
        return currHead.val;

    }

    public int size(){
        return  size;
    }
    public void print(){
        Node h = head.next;
        while (h != null){
            System.out.print(h.val +",");
            h = h.next;
        }
    }

}
