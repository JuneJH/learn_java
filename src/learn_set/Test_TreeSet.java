package learn_set;

import java.util.TreeSet;

public class Test_TreeSet {

    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();


        stringTreeSet.add("第一个元素");
        stringTreeSet.add("第一个元素");
        stringTreeSet.add("第一个元素");
        stringTreeSet.add("第一个元素");
        stringTreeSet.add("第一个元素");

        System.out.println(stringTreeSet);

        TreeSet<Dog> dogTreeSet = new TreeSet<>();
        dogTreeSet.add(new Dog(" 富贵",1,1));
        dogTreeSet.add(new Dog(" 富贵",2,1));
        dogTreeSet.add(new Dog(" 富贵",3,1));
        dogTreeSet.add(new Dog(" 富贵",4,1));
        dogTreeSet.add(new Dog(" 富贵",5,1));

        System.out.println(dogTreeSet);

    }
}
