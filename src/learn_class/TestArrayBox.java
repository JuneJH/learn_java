package learn_class;

import learn_class.ArrayBox;

public class TestArrayBox {

    public static void main(String[] args) {
        ArrayBox<String> arrayBox = new ArrayBox<String>(2);
        arrayBox.push("我是索引1","我是索引2","我是索引3","我是索引4","我是最后一个元素");
        arrayBox.print();
        System.out.println("我是测试get"+arrayBox.get(3));
        arrayBox.remove(3);
        arrayBox.print();
        arrayBox.modifyByIndex(3,"修改索引");
        arrayBox.print();
        arrayBox.push("新作者","新作者","新作者","新作者","新作者","新作者","新作者","新作者");
        arrayBox.push("新作者","新作者","新作者","新作者","新作者","新作者","新作者","新作者");
        arrayBox.print();
        arrayBox.push("最后一个");
        System.out.println("我是测试get"+arrayBox.get(20));
    }
}
