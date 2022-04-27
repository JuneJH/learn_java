package enum_practice;

public enum Hobby {
    football("足球",3),
    basketball("篮球",2),
    music("音乐",1),
    movie("电影",0);

    private String name;
    private int index;
    private Hobby(String name,int index){
        this.name = name;
        this.index = index;
    }
    public String getName(){
        return  name;
    }
    public int getIndex(){
        return  index;
    }
}
