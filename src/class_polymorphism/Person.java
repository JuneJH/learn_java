package class_polymorphism;

public class Person {

    public String name;

    public Person(String name){
        this.name = name;
    }

    public void talk(){
        System.out.println(this.name+"说：Java hello !!!!");
    }

    public void  eat(){
        System.out.println(this.name+"正在吃饭");

    }
}
