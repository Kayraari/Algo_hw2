
    public class Stack {
        Node top;
        Node minTop;
        int size;

        LinkedList list;

        public Stack(Node top, Node minTop) {
            this.top = top;
            this.minTop=minTop;
            size = 0;
            this.list= new LinkedList(null);
        }

        public Node getTop() {
            return top;
        }
        public void setTop(Node top) {
            this.top = top;
        }

        public void push(Object V) {//bu degısebilir
            Node newNode = new Node(V, null);
            if (top == null) {
                top = newNode;
            } else {
                newNode.setNext(top);
                top = newNode;
            }
            size++;
            //update the min Stack
            if(minTop ==null || (Integer) V <=(Integer) minTop.data){
                Node minNode = new Node(V,null);
                minNode.setNext(minTop);
                minTop =minNode;
            }
        }
        public void getNewMin(){
            //we compare the new value to the old min. if the new value in smaller it becomes the new min
            Node current=list.head;

            int min= 110; // now minimum is the maximum int possible
            while(current!=null){
                if((Integer)current.data<min){ // we casted the current data bcs its data is object and not int
                    min=(Integer)current.data;

                }
                current=current.next; // current next is the new current so it will check in the loop if it is the new minimum or not
            }
        }
        public void pop() {
            Node current=list.head;

            if(list.head==list.tail){ //if head is also tail when it pops head and tail will be be null
                list.head=null;
                list.tail=null;
            }else{
                while(current.getNext()!=list.tail){ // get node before tail
                    current=current.getNext();
                }
                current=list.tail;
            }
            size--;
            getNewMin();// this checks if min was deleted so it updates the min
        }


        public void printStack() {
        Node current =top;
        while(current !=null){
            System.out.print(current.data +" ");
            current = (Node) current.data;
        }
        System.out.println();
        }

    }
