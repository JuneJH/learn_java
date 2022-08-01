package learn_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test_HashMap {


    public static void main(String[] args) {


        HashMap<String,String> hashMap = new HashMap<String,String>();

        // 增
        hashMap.put("壹","1⃣️");
        hashMap.put("贰","2⃣️️");
        hashMap.put("叁","3⃣️");

        System.out.println("新增后："+hashMap);

        // 删除
        hashMap.remove("贰");
        System.out.println("删除后："+hashMap);
        // 更新
        hashMap.replace("壹","一");
        hashMap.put("叁","三");
        System.out.println("更新后："+hashMap);

        // 遍历
        Set<String> keySet = hashMap.keySet();
        for(String key : keySet){
            System.out.println(key + "==>"+hashMap.get(key));
        }
        System.out.println("遍历第二遍");
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+ "==>"+hashMap.get(key));
        }

    }
}
