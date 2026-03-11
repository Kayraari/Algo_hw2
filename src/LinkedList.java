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

        public void getNewMin(){
        //we compare the new value to the old min. if the new value in smaller it becomes the new min
        }
}
