package learn_tools_class;

public class Test_lang {

    public static void main(String[] args) {


        Integer i1 = new Integer(127);
        Integer i2 = 127;
        Integer i3 = 127;
        int i4 = 127;
        int i5 = 127;
        Integer i6 = 128;
        Integer i7 = 128;

        System.out.println(i1 == i2); // false
        System.out.println(i1 == i3); // false
        System.out.println(i2 == i3); // true
        System.out.println(i6 == i7); // false  // Integer自动静态变了-128 127
        System.out.println(i2 == i4); // true
        System.out.println(i4 == i5); // true
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.equals(i3)); // true
        System.out.println(i1.equals(i4)); // true


        Integer i = 3;

        System.out.println(Integer.toBinaryString(i)); // 转换二进制





    }
}
