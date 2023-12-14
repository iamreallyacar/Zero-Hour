package src;

public class SingleLinkedList<T> {

    private class Node {
        private T data;
        private Node nextNode;

        public Node(T data){
            this(data, null);
        }

        public Node(T data, Node next){
            this.data = data;
            this.nextNode = next;
        }

        public T getData(){
            return this.data;
        }

        public Node getNextNode(){
            return this.nextNode;
        }
    }

    private Node head;

    public SingleLinkedList(){
        this.head = null;
    }

    public getData

    public void add(T data){
        if(this.head == null){
            this.head = new Node(data);
        } else {
            Node newNode = new Node(data, this.head);
            this.head = newNode;
        }
    }

    public void remove(T data){



    }

}
