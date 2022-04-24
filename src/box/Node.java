package box;

public class Node<T> {

    private Node pre;
    private Node next;
    private T val;

    public Node(Node pre,T val,Node next){
        this.next = next;
        this.pre = pre;
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public Node getPre() {
        return pre;
    }

    public T getVal() {
        return val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
