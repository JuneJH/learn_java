package interface_test;

public class Dog implements Animal{

    private String name;
    public Dog(String name){
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "吃饭");
    }


    public void say(String content) {
        System.out.println(this.name + "说"+content);
    }
}
