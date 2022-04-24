package box;

public class Test {
    public static void main(String[] args) {
        LinksBox linkBox = new LinksBox();

        linkBox.add(1);
        linkBox.add(2);
        linkBox.add(3);
        linkBox.add(4);
        linkBox.add(5);
        linkBox.add(6);
        linkBox.add(7);
        linkBox.add(8);
        linkBox.add(9);

       for(int i = 0; i < linkBox.size(); i ++){
           System.out.print(linkBox.get(i)+",");
       }

       linkBox.remove(2);
       linkBox.remove(3);
        System.out.println("=====");
        for(int i = 0; i < linkBox.size(); i ++){
            System.out.print(linkBox.get(i)+",");
        }
    }
}
