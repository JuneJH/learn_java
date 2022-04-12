public class LearnClass {
    public String firstName;
    public String lastName;
    public int age;
    public boolean sex;

    public void introduce(){
        System.out.println("大家好，我是"+this.firstName + this.lastName+"今年"+age+"岁");
    }


    public LearnClass(){
        System.out.println("我是重载的构造函数");
    }// 最好重载一下默认构造函数
    public LearnClass(String firstName,String lastName,int age,boolean s){
        this();// 只能在第一行调用其他构造函数
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        sex = s;// 如果参数与属性不同名可以这样赋值
    }

    {
        System.out.println("我是程序块,在构造函数之前执行"+this.age);// 能使用this,但是不能访问,因为他在构造函数之前执行
    }


    public static void main(String[] args) {
        LearnClass lc = new LearnClass("Ju","ne",18,true);
        lc.introduce();
    }



}
