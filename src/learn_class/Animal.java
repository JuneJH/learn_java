package learn_class;

public class Animal {
    public Animal(){
        System.out.println("动物的构造方法");
    }
    public String name;

    protected void say(){
        System.out.println("我是Animal的子孙");
    }
}
