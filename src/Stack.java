
    public class Stack {
        Node top;
        Node minTop;
        int size;

        public Stack(Node top, Node minTop) {
            this.top = top;
            this.minTop=minTop;
            size = 0;
        }

        public Node getTop() {
            return top;
        }
        public void setTop(Node top) {
            this.top = top;
        }

        public void push(Object V) {
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
            //prints current min or empty if stack is empty
            if(minTop==null){
                System.out.println("Empty");
            } else{
                System.out.println((Integer) minTop.data);
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
