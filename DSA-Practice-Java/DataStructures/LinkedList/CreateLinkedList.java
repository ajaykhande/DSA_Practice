public class CreateLinkedList {
   public static class Node{
    int data;
    Node next;
     Node(int data) {
        this.data = data;
   }
   }
   public static void display(Node head){
       while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
       }
   }
    public static void displayRecursion(Node head){
       if(head==null) return;
        System.out.print(head.data+" ");
         display(head.next);
       }
       public static int size(Node head){
         int count = 0;
         while(head!=null){
             head = head.next;
             count++;
       }
       return count;
       }
   
    public static void main(String[] args) {
        Node x1 = new Node(5);
        Node x2 = new Node(3);
        Node x3 = new Node(9);
        Node x4 = new Node(8);
        Node x5 = new Node(16);
        Node x6 = new Node(16);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
       // display(x1);
      //  displayRecursion(x1);
        System.out.println(size(x1));

    
    }
}
