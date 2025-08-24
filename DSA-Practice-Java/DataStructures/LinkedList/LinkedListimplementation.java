
    public class LinkedListimplementation {
    public static class Node{
    int data;
    Node next;
     Node(int data) {
        this.data = data;
   }
}
    public static class LinkedList{
     Node head = null;
     Node tail = null;
     int size = 0;
     void insertAtend(int val){
        Node x1 = new Node(val);
        if(head==null){
           head = x1;
        }else{
         tail.next = x1;
        }
       tail = x1;
       size++;
     }
     void printLin(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            
        }
    }
        
       void insertAtStart(int val){
           Node x2 = new Node(val);
        if(head==null){
           head = tail = x2;
        }else{
          x2.next = head;
          head = x2;
        }
        size++;
       }
       void insertAt(int idx,int val){
        if(idx==size ){
            insertAtend(val);
            return;
        }else if(idx==0){
            insertAtStart(val);
            return;
        }else if(idx<0||idx>size){
            System.out.println("Index out of bound");
            return;
        }
          Node x2 = new Node(val);
          Node temp = head;
          for(int i = 1; i<=idx-1; i++){
            temp = temp.next;
          }
           x2.next = temp.next;
           temp.next = x2;
           size++;
       }
        void getAt(int val ){
        Node temp = head;
         for(int i = 1; i<=val; i++){
            temp = temp.next;
          }
            System.out.println(temp.data);
        }
         void deletteAt(int val ){
         Node temp = head;
     
           if(val==0){
          head = head.next;
        } else{
         for(int i = 1; i<val; i++){
            temp = temp.next;
          }
          temp.next = temp.next.next;
        }
        if(val==size-1){
            tail = temp;
        }
         
       size--;
    }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtend(1);
        ll.insertAtend(2);
        ll.insertAtend(3);
        ll.insertAtend(4);
        ll.insertAtend(5);
        // ll.insertAtStart(100);
        // ll.insertAtStart(10);
      //  ll.insertAt(6, 45);
      // System.out.println(ll.size());
      //   System.out.println(ll.head.data);
      // ll.getAt(3);
      // ll.insertAt(2, 55);
      // ll.insertAtStart(54);
       ll.deletteAt(4);
      ll.printLin();
      System.out.println();
      System.out.println(ll.tail.data);
   System.out.println(ll.size);
   
    }
}


