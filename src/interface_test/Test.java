package interface_test;

public class Test {
    public static void main(String[] args){
        Dog dog = new Dog("小花");
        dog.eat();
        dog.say("hello");
        String str = dog.myType;
        System.out.println("这是"+dog.myType+"即"+Dog.myType);
    }
}
