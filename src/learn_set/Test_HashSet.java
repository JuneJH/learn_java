package learn_set;


import java.util.HashSet;
import java.util.Iterator;

public class Test_HashSet {

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("无序无重复");
        stringSet.add("重写equs");
        stringSet.add("重写hashcode");

        Iterator stringSetIterator = stringSet.iterator();

        while (stringSetIterator.hasNext()){
            System.out.println(stringSetIterator.next());
        }
        System.out.println(stringSet);
        for(String val:stringSet){
            System.out.println(val);
        }
    }

}
