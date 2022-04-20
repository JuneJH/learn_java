package class_relation;

public class Test {
    public static void main(String[] args) {
        People p = new People("June",18);
        Car car  = new Car("BWM","red",new Motor(1000,"520"));
        p.driver(car);
    }
}
