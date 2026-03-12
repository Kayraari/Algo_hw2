import static sun.jvm.hotspot.oops.CellTypeState.top;

public class LinkedList {

    protected Node head;
    protected long size;
    protected int min;

    public LinkedList(Node head, long size, int min){
        this.head=head;
        this.size=size;
        this.min=min;
    }
    public Node getHead(){ return head; }
    public void setHead(Node head){ this.head=head; }
    public long getSize(){ return size; }
    public void setSize(long size){ this.size=size; }
    public int getMin(){ return min; }
    public void setMin(){ this.min=min;}

        public void getNewMin(Node data){
        //we compare the new value to the old min. if the new value in smaller it becomes the new min
        }
        public void addFirst(Node data){
        data.setNext(head);
        head=data;
        size++;
        }
        public void removeFirst(){
        Node data=head;
        head=head.getNext();
        data.setNext(null);
        size--;
        }
        public void peekFirst(Node data){
            Node topNode = mainStack.getTop();
        if(topNode!=null)
            System.out.println(topNode);
            else { System.out.println("Top is empty."); }
        }

        Stack mainStack= new Stack(null);
        Stack minStack = new Stack(null);
        //added two stacks, one for storing the min values

        mainStack.push(V);

}
