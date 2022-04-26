package design_pattern.strategy;

public class Man extends Person{
    public Man(String name){
        this.name = name;
    }
    public void wakeUp(){
        System.out.println(this.name+"睡过去了,等待下一个闹钟叫醒");
    }

    @Override
    public void goOut() {
        System.out.println(this.name + "拿着外套出门了");
    }

    @Override
    public void sleep() {
        System.out.println(this.name+"直接睡觉了");
    }
}
