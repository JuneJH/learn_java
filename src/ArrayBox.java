public class ArrayBox {
    public int[] array;

    public ArrayBox(){}
    public ArrayBox(int[] array){
        this.array = array;
    }
    public ArrayBox(String[] array){
//        this.a = array;
    }

    public int[] push(int...array){
        int[] arr = new int[array.length + this.array.length];
        int index = 0;
        for(int val : this.array){
            arr[index ++] = val;
        }
        for(int val : array){
            arr[index ++] = val;
        }
        return  this.array = arr;
    }
    public int getSize(){
        return  this.array.length;
    }


    public static void main(String[] arg){
        int[] array = {1,2,3,4,5};
        ArrayBox arraybox = new ArrayBox(array);

        arraybox.push(6,7,8,9);

        System.out.println("当前数组");
        for(int val : arraybox.array){
            System.out.println(val);
        }
        System.out.println("当前数组的长度"+ arraybox.getSize());



    }
}
