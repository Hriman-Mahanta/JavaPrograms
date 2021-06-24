//16. Program to find minimum and maximum element in a linked list.
public class MinMaxLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display(){
        Node current=head;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        System.out.print("The elements in the list are: ");
        while(current!=null){
            System.out.print(current.data+"  ");
            current=current.next;
        }
        System.out.println();
    }
    void min(){
        Node current=head;
        int min=head.data;
        while(current!=null){
            if(min>current.data)
                min=current.data;
            current=current.next;
        }
        System.out.println("The minimum element is: "+min);
    }
    void max(){
        Node current=head;
        int max=head.data;
        while(current!=null){
            if(max<current.data)
                max=current.data;
            current=current.next;
        }
        System.out.println("The minimum element is: "+max);
    }

    public static void main(String[] args) {
        MinMaxLinkedList list=new MinMaxLinkedList();
        list.addNode(1);
        list.addNode(4);
        list.addNode(3);
        list.addNode(0);
        list.addNode(6);
        list.display();
        list.min();
        list.max();
    }

}
