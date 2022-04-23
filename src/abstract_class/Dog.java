package abstract_class;

public class Dog extends Animal{

    public Dog(String name){
        setName(name);
    }
    public void eat() {
        System.out.println(getName() +" 吃饭");
    }


    public void say(String content) {
        System.out.println(getName()+"说"+content);
    }
}
