package class_relation;

public class People {
    private String name;
    private int age;
    public void driver(Car car){
        System.out.println(this.name+"选手开始开车了,他今年"+this.age+"岁,他驾驶的是"+car.getBrand()+"牌汽车");
        car.start();
    }

    public People(){}
    public People(String name,int age){
        this.age = age;
        this.name = name;
    }
}
