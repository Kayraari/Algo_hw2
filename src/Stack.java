
    public class Stack {
        Node top;
        int size;

        public Stack(Node top) {
            this.top = top;
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
        }
        public void getNewMin(Node data){
            //we compare the new value to the old min. if the new value in smaller it becomes the new min
        }
        public Object pop() { return -1;}// Object instead of int


        public void printStack() {

        }

    }
