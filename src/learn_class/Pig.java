package learn_class;

public class Pig extends Animal{
    public Pig(){
        System.out.println("π·ηδΈεΈ¦εζ°ζι ζΉζ³");
    }
    public Pig(String name){
        super.name = name;
        System.out.println("hello ζζ―δΈεͺε°π·:"+this.name);
    }

    public void eat(){
        System.out.println("π·ει₯²ζ");
    }
    public void say(){
        System.out.println("ζζ―π·ηεδ»£");
    }
}
