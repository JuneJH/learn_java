package class_polymorphism;

public class Child extends Person{
    public String name;
    public Child(String name) {
        super(name);
        this.name = "子类的"+name;
    }


    public void eat(){
        System.out.println("小孩子不能好好吃饭");
    }

    public void wawa(){
        System.out.println("小孩子只能哇哇哇哇哇");
    }
}
