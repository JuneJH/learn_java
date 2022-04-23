package learn_class;

public class ArrayBox<E> {
    private E[] array;
    private static final int DEFAULT_SIZE = 15;
    private int size = 0;
    public ArrayBox(){
        this.array =(E[]) new Object[DEFAULT_SIZE];
    }
    public ArrayBox(int size){
        this.array =(E[]) new Object[size];
    }

    /**
     * 判断是否越界
     * @param index
     * @return
     */
    private boolean isIndexOut(int index){
        if(this.size > index && index >= 0){
            return  true;
        }
        return  false;
    }

    private void expansion(int size){
        if(this.array.length < size + this.size){
            Object[] arr = new Object[this.size + size + size / 2];
            int let = arr.length;
            System.out.println("lennnn"+let);
            for(int i = 0; i < this.array.length; i ++){
                arr[i] = this.array[i];
            }
            this.array = (E[]) arr;
        }
    }

    /**
     * push 一组数据
     * @param array
     * @return
     */
    public E[] push(E...array){
        this.expansion(array.length);
        for(E val : array){
            this.array[this.size ++] = val;
        }
        return  this.array;
    }

    /**
     * 获取size
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * 根据索引得到对应位置的值
     * @param index
     * @return
     */
    public E get(int index){
        if(this.isIndexOut(index)){
            return (E) this.array[index];
        }else{
            throw new BoxIndexOutException("越界");
        }
    }

    /**
     * 根据索引移除元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(this.isIndexOut(index)){
            for(int i = index; i < this.size; i ++){
                this.array[i] = this.array[i + 1];
            }
            this.array[--this.size] = null;
        }else {
            throw new BoxIndexOutException("越界");
        }
        return  this.get(index);
    }

    /**
     * 打印数组元素
     */
    public void print(){
        String str = "";
        for(int i = 0; i < this.size; i ++){
            str += this.array[i] + ",";
        }
        System.out.println(str.substring(0,str.length() - 1));
    }

    public E modifyByIndex(int index,E val){
        if(this.isIndexOut(index)){
            this.array[index] = val;
        }
        return  this.array[index];
    }
}
