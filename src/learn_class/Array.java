package learn_class;

public class Array {
   public static void main(String[] args) {
       int[] swapA = {1,2,3,4};
       int[] swapB = new int[]{5,6,7,8};
       swapIndex(swapA,swapB);
       System.out.println("交换数组："+swapA[0]+"===="+swapB[0]);
       int[] swapC = new int[5];
       for(int i = 0; i < swapC.length; i ++){
           swapC[i] = i;
       }
       swapHead2footer(swapC);
       System.out.println("交换数组头尾："+swapC[0]+"===="+swapC[swapC.length - 1]);
       int[] swapD = {1,2,3,4,5,6,7,8,9};
       float avg = computerAvg(swapD);
       System.out.println("计算数组的平均值："+avg);
       int[] max_min = findMaxMin(swapD);
       System.out.println("找到最大值和最小值："+max_min[0]+"===="+max_min[1]);
       int[] testA = {1,2,3,4,5};
       int[] testB = {6,7,8,9};
       int[] mergeRes = mergeArr(testA,testB);
       System.out.println("合并两个数组：");
       for(int val:mergeRes){
           System.out.println(val);
       }
       System.out.println("合并两个数组;end");
       int[] testC = {1,2,3,0,0,0,5,6,7,0,0};
       int[] trimRes = trimArr(testC);
       System.out.println("去掉0位置：");
       for(int val:trimRes){
           System.out.println(val);
       }
       System.out.println("去掉0位置;end");
       int[] testE = {1,2,3,6,4,5};
       int[] splitRes = splitArr(testE);
       System.out.println("分裂数组;");
       for(int val:splitRes){
           System.out.println(val);
       }
       System.out.println("分裂数组;end");





   }
    // 1.给定两个数组a{1,2,3,4} b{5,6,7,8}将两个数组内元素对换
    public static void swapIndex(int[] a,int[] b){
       for(int i = 0; i < a.length; i ++){
           int temp = a[i];
           a[i] = b[i];
           b[i] = temp;

           a[i]  =  a[i] ^ b[i];
           b[i] = a[i] ^ b[i];
           a[i] = a[i] ^ b[i];

           a[i] += b[i];
           b[i] = a[i] - b[i];
           a[i] = a[i] - b[i];
       }

    }
    // 2.给定一个数组a{1,2,3,4,5,6}将这个数组中元素头尾互换位置
    public static void swapHead2footer(int[] a){
       int len = a.length;
       a[0] ^= a[len - 1];
       a[len - 1] = a[0] ^ a[len - 1];
       a[0] = a[0] ^ a[len - 1];
    }
    // 3.给定一个数组a{1,2,3,4,5,6}计算数组所有元素的平均值
    public static float computerAvg(int[] a){
       float sum = 0;
       for(int val : a){
           sum += val;
       }
       return sum / a.length;
    }
    // 4.给定一个数组a{1,2,3,4,5,6,7,8,9}找到最大值和最小值
    public static int[] findMaxMin(int[] a){
       int[] res = {0,99};// 最大的数 TODO
       for(int val : a){
           if(val > res[0]){
               res[0] = val;
           }
           if(val < res[1]){
               res[1] = val;
           }
       }
       return res;
    }
    // 5.给定两个数组a{1,2,3} b{4,5}合并两个数组
    public static int[] mergeArr(int[] a,int[] b){
       int[] res = new int[a.length + b.length];
       int index = 0;
       for(int val : a){
           res[index++] = val;
       }
       for(int val:b){
           res[index ++] = val;
       }
       return  res;
    }
    // 6.给定一个数组a{1,2,3,0,0,0,5,6,7,0,0}去掉数组中0元素
    public static int[] trimArr(int[] a){
       int invalidNum = 0;
        for(int val : a){
            if(val == 0){
                invalidNum ++;
            }
        }
        int[] res = new int[a.length - invalidNum];
        int index = 0;
        for(int val : a){
            if(val != 0){
                res[index ++] = val;
            }
        }
        return  res;
    }
    // 7.给定一个数组a{1,2,3,6,4,5}安装数组中最大值位置将数组拆分为两个数组
    public static int[] splitArr(int[] a){
       int max = 0;
       int maxIndex = 0;
       for(int i = 0; i < a.length; i ++){
           int val = a[i];
           if(val > max){
               max = val;
               maxIndex = i;
           }
       }
       int[] res = new int[maxIndex];
       for(int i = 0; i < maxIndex; i ++){
           res[i] = a[i];
       }
       return  res;
    }
    // 8.创建一个数组 存储2-100之间的素数
    // 9.数组元素的排序
}
