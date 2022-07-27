package learn_set;

public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private int num;

    public Dog(String name,int age,int num){
        this.age = age;
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }
}
