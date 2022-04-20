package class_relation;

public class Car {
    private String brand;
    private Motor motor;
    private String color;

    public Car(){}

    public Car(String brand,String color,Motor motor){
        this.brand = brand;
        this.color = color;
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public void start(){
        System.out.println(this.brand+"牌小汽车启动了,它搭载了"+this.motor.getBrand()+"牌子的发动机,它最高时速可达"+this.motor.getSpeed());
    }

}
