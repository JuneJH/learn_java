package class_relation;

public class Motor {
    private int speed;
    private String brand;
    public Motor(int speed,String brand){
        this.brand = brand;
        this.speed = speed;
    }
    public void run(){
        System.out.println(this.brand + "牌的启动器开始执行...他的最高速度"+this.speed);
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getBrand(){
        return this.brand;
    }

}
