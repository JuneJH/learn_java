package design_pattern;

public class Test {
    public static void main(String[] args){
        Singleton singleton = Singleton.newInstance();
        Singleton singleton1 = Singleton.newInstance();

        System.out.println(singleton1.getName() + "=>"+(singleton1 == singleton));
    }
}
