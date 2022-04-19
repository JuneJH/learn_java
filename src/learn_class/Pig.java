package learn_class;

public class Pig extends Animal{
    public Pig(){
        System.out.println("🐷的不带参数构造方法");
    }
    public Pig(String name){
        super.name = name;
        System.out.println("hello 我是一只小🐷:"+this.name);
    }

    public void eat(){
        System.out.println("🐷吃饲料");
    }
    public void say(){
        System.out.println("我是🐷的后代");
    }
}
