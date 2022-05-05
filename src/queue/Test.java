package queue;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
        System.out.println("size:"+q.size());
        q.poll();
        q.poll();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.print();
        System.out.println("size:"+q.size());
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.add(10);
        q.print();
        System.out.println("size:"+q.size());
    }
}
