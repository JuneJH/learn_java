package design_pattern;

public class Singleton {

    private static Singleton singleton;

    private final String name = "singleton_pattern";

    private Singleton(){}

    public static Singleton newInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public String getName(){
        return name;
    }
}
