package learn_class;

public class Overload {

    public void say(int i){
        System.out.println("调用的是int方法,你输入的是int的数据类型"+i);
    }
    public void say(String s){
        System.out.println("调用的是String方法,你输入的是String的数据类型"+s);
    }
    public void say(boolean b){
        System.out.println("调用的是boolean方法,你输入的是boolean的数据类型"+b);
    }
    public void say(long l){
        System.out.println("调用的是long方法,你输入的是long的数据类型"+l);
    }
    public void say(int...i){
        int res = 0;
        for(int val : i){
            res += val;
        }
        System.out.println("调用的是剩余参数方法,你输入的参数和为"+res);
    }

// 不可以使用数组和动态参数列表进行重载
//    public  void say(int[] array){
//
//    }

    public static void main(String[] args){
        Overload overload = new Overload();
        overload.say(1);
        overload.say("你好,方法重载");
        overload.say(97);// 类型自动转化
        overload.say(false);
        overload.say((long) 123);
        overload.say(1,2,3,4,5,6,7,8,9);

    }
}

