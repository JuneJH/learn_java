package learn_gc;

public class Person {

    public Person(){
        System.out.println("Person被创建了");
    }

    public void finalize(){
        System.out.println("Person 被回收了");
    }
}
