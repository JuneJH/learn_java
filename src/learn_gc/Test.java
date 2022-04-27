package learn_gc;

public class Test {

    public static void printMemory(){
        Runtime r = Runtime.getRuntime();
        System.out.println("全部空间"+r.maxMemory() / 1024 / 1024);
        System.out.println("可用空间"+r.totalMemory()/ 1024 / 1024);
        System.out.println("空闲空间"+r.freeMemory()/ 1024 / 1024);
    }
    public static void main(String[] args) {

        Person p = new Person();
        try {
            Thread.sleep(1000);

        }catch (Exception e){
        }
        p = null;
        System.gc();
        printMemory();
        Long[] l = new Long[1024 * 1024];
        printMemory();






    }
}
