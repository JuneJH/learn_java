package design_pattern.strategy;

public class ManagePerson {

    public void day(Person person){
        System.out.println("======欢迎开启打工的一天=====");
        person.wakeUp();
        person.goOut();
        person.sleep();
        System.out.println("======早点休息吧,打工人======");

    }
}
