package enum_practice;

public class Test {
    public static void main(String[] args) {

        System.out.println(Hobby.basketball);
        Hobby[] hobbies = Hobby.values();
        for(Hobby val : hobbies){
            System.out.println("Hobby"+val.name()+"===>"+val.ordinal());
        }
        for(Hobby val : hobbies){
            System.out.println("Hobby:"+val.getName()+"===>"+val.getIndex());
        }
    }
}
