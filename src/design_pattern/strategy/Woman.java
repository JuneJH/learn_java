package design_pattern.strategy;

public class Woman extends Person{

    public Woman(String name){
        this.name = name;
    }
    public void wakeUp(){
        System.out.println(this.name+"起床化妆");
    }

    @Override
    public void goOut() {
        System.out.println(this.name + "整理衣服准备出门了");
    }

    @Override
    public void sleep() {
        System.out.println(this.name+"卸妆准备睡觉了");
    }
}
