

public class LinkedList {

    protected Node head;
    protected Node tail;
    public long size;
    protected int min;


    public LinkedList(Node head){ //sizeı constructora koymak
        this.head=head;
        this.tail=head;
        if (head!=null){
            this.size=1;

        }else{
            this.size=0;
        }

    }
    public Node getHead(){ return head; }
    public void setHead(Node head){ this.head=head; }
    public Node getTail(){return tail;}
    public void setTail(Node tail){this.tail=tail;}
    public long getSize(){ return size; }
    public void setSize(long size){ this.size=size; }
    public int getMin(){ return min; }
    public void setMin(){ this.min=min;}


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
       /* public void peekFirst(Node data){
            Node topNode = mainStack.getTop();
        if(topNode!=null)
            System.out.println(topNode);
            else { System.out.println("Top is empty."); }
        }
        */
        Stack mainStack= new Stack(null,null);
        Stack minStack = new Stack(null, null);
        //added two stacks, one for storing the min values



}
