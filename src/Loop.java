public  class  Loop{
    public static void main(String[] args){
        comp();
        chickRabbit();
        findPrimeNumber(100);

    }
    // 加工零件370
    // a 加工零件 +10
    // b 加工零件 +20
    // c 加工零件 *2
    // d 加工零件 /2
    // 则a == b == c == d;
    public static void comp(){
        int a = 0, b = 0, c = 0, d = 0;
        for(int i = 1; i < 370; i ++){
            if(i - 10 +  i + 20 + i / 2 + i * 2 == 370 ){
                System.out.println("四个工人分别加工"+  (i - 10) +","+  (i + 20) +","+  (i / 2 ) +","+  (i * 2));
            }
        }
    }
    // 鸡兔同笼
    // 共50
    // 160只脚
    public static void chickRabbit(){
        for(int i = 0; i < 50; i ++){
            if(i * 2 + (50 - i) * 4 == 160){
                System.out.println("鸡有"+i+"只"+"兔子有"+ (50 - i)+"只");
            }
        }
    }

    public static void findPrimeNumber(int n){
        for(int i = 2; i <= n; i ++){
            boolean flag = false;
            for(int j = 2; j <= i / 2; j ++){
                if(i % j == 0){
//                    System.out.println(i + "不是质数");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i + " 是质数");
            }
        }
    }
}