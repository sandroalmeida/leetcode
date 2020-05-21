package info.sandroalmeida.hackerrank;

public class PrintLinkedList {

    private Node head;

    public PrintLinkedList(int[] inputData){
        Node current = null;
        for(int i = 0; i < inputData.length; i++){
            if(i == 0){
                this.head = new Node(inputData[i]);
                current = head;
                continue;
            }
            current.next = new Node(inputData[i]);
            current = current.next;
        }
    }

    public void apend(int value){
        if(head == null) head = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(value);
    }

    public void print(){
        if(head == null) return;
        System.out.println(head.data);
        Node current = head;
        while(current.next != null){
            current = current.next;
            System.out.println(current.data);
        }
    }

    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

    }

}
