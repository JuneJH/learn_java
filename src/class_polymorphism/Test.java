package class_polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p = new Child("June");
        p.eat();
        p.talk();
        System.out.println("Person:"+p.name);
//        p.wawa();
        Child c = (Child) p;
        c.eat();
        c.talk();
        c.wawa();
        System.out.println("Child:"+c.name);
    }
}
