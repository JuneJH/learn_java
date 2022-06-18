package learn_list;

import java.util.ArrayList;
import java.util.Iterator;

public class List_demo {

    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();

        ArrayList<String> al = new ArrayList<>();
        al.add("age");
        al.add("name");     //  新增
        al.addAll(al1);      // 并集
        al.remove(0); // 删除
        al.removeAll(al1);    // 差集
        al.get(0);          // 获取
        al.size();          // 得到长度
        al.clear();         // 清楚
        al.contains(1);     // 是否存在
        al.indexOf(1);      // 找到该元素的位置
        al.lastIndexOf(2);//
        al.isEmpty();        //
        Iterator<String> iterable = al.iterator(); //
        al.retainAll(al1); // 交集
        al.subList(0,1);  // 截取
        al.toArray();      // 变成数组 无法确定类型

        String[] arr = new String[al.size()];
        al.toArray(arr);  // 通过参数确定类型
        al.trimToSize(); // 变成有效长度

        // collection  存储的都是value值
        // collection =>  List Set
        // map          存储的都是key-value


    }
}
