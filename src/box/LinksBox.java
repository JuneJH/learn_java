package box;

public class LinksBox<T> implements Box<T>{

    private Node<T> first;
    private Node<T> last;
    private int size;


    private void linkNode(T element){
        Node lastNode = last;
        Node<T> newNode = new Node<T>(lastNode,element,null);

        if(lastNode == null){
            first = newNode;
        }else{
            lastNode.setNext(newNode);
        }
        last = newNode;
        size ++;
    }

    private void checkRange(int index){
        if(index < 0 || index > size){
            throw new BoxIndexOutException("索引位置不正常");
        }
    }

    private Node findLink(int index){
        Node<T> target = first;
        if(index < (size >> 1)){
            target = first;
            for (int i = 0; i < index; i ++){
                target  = target.getNext();
            }
        }else{
            target = last;
            for(int i = size; i > index + 1; i --){
                target = target.getPre();
            }
        }
        return  target;
    }

    private T unLink(int index){
        Node<T> target = this.findLink(index);
        Node prev = target.getPre();
        Node next = target.getNext();

        if(prev == null){
            first = next;
        }else{
            prev.setNext(next);
        }
        if(next == null){
            prev.setNext(null);
        }else{
            next.setPre(prev);
        }
        target.setPre(null);
        target.setNext(null);
        size --;
        return  target.getVal();
    }




    @Override
    public boolean add(T element) {
        this.linkNode(element);
        return true;
    }

    @Override
    public T get(int index) {
        this.checkRange(index);
        Node<T> target = this.findLink(index);
        return target.getVal();
    }

    @Override
    public T remove(int index) {
        this.checkRange(index);

        return this.unLink(index);
    }

    @Override
    public int size() {
        return this.size;
    }
}
