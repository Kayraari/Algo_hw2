
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
            if (top == null) {
                System.out.println("Empty");
                return;
            }
            int removed = (Integer) top.data;
            top = top.next;
            size--;
            if( minTop!=null&& removed == (Integer) minTop.data){
                minTop = minTop.next;
            }
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
