package abstract_class;

public abstract class Animal {

    {
        System.out.println("我是Animal的程序块");
    }

    private String name;

    public final String myType = "ABSTRACT";
    public static final String myTypeText = "抽象类";

    public abstract void eat();
    public  abstract void say(String content);

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }
}
