
    public class Stack {
        Node top;
        int size;
        LinkedList list;

        public Stack(Node top) {
            this.top = top;
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
        }
        public void getNewMin(Node data){
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
        public Object pop() { return -1;}// Object instead of int


        public void printStack() {

        }

    }
