package design_pattern.strategy;

public class Test {
    public static void main(String[] args) {
        Person woman = new Woman("小花");
        Person man = new Man("小萨");

        ManagePerson mp = new ManagePerson();

        mp.day(woman);

        mp.day(man);
    }
}
