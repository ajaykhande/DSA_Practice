
public class LinkedListFuntions {
    public static class Node{
        int data;
        Node next;
        Node random;
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
  static Node getendnode(Node head , int n){
        int count = 0;
       Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        } temp = head;
        int lenght = count-n+1;
         for(int i = 1; i<lenght; i++){
            temp = temp.next;
          }
          return temp;
     }
  static Node getendnodeOptimize(Node head , int n){
       Node slow = head;
       Node fast = head;
       for(int i = 1; i<=n; i++){
            fast = fast.next;
          }
        while(fast!=null){
           fast = fast.next;
            slow = slow.next;  
        }
          return slow;
     }
    static Node  removeNthNode(Node head , int n){
          Node slow = head;
       Node fast = head;
       for(int i = 1; i<=n; i++){
            fast = fast.next;
          }
          if(fast==null){
            head = head.next;
             return  head;
            }
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;  
            }
            slow.next = slow.next.next;
            return  head;
       //  System.out.println(slow.next.data);
     }
 static Node  findIntersectin(Node headA ,Node headB){
          Node temp = headA;
        Node temp2 = headB;
        int count1 = 0;
        int count2 = 0;
       while(temp!=null||temp2!=null){
        if(temp!=null){
           count1++;
           temp = temp.next;
        }
       if(temp2!=null){
          count2++;
           temp2 = temp2.next;
            }  
        }
       temp = headA;
       temp2 = headB;
       if(count1>count2){
      int step = count1 - count2;
        for(int i = 1; i<=step; i++){
            temp = temp.next;
          }
       }else{
        int step = count2 - count1;
        for(int i = 1; i<=step; i++){
            temp2 = temp2.next;
          }
       }
       while(temp!=temp2){
      temp = temp.next;
       temp2 = temp2.next;  
            }     
     return temp;
    }
static Node  findMiddalElement(Node head){
       Node slow = head;
       Node fast = head;
        while(fast.next!=null&&fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;  
            }
   
            return  slow;
     }
    static Node   deleteMiddalElement(Node head){ 
      if(head.next==null) return null;
       Node slow = head;
       Node fast = head;
     while(fast.next.next!=null&&fast.next.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;  
            }
            slow.next = slow.next.next;
     return head;
     }
     static boolean    CycleLinkedList(Node head){ 
       Node slow = head;
       Node fast = head;
     if(head==null||head.next==null)return false;
       while(fast!=null){
        if(slow==null) return false;
         slow = slow.next;
        if(fast.next==null) return false;
         fast = fast.next.next;
          if(slow==fast){
          return true;
        }
       }
     return false;
     }
       static Node    CycleLinkedList2(Node head){ 
      Node slow = head;
      Node fast = head;
       if(head==null||head.next==null)return null;
       while(fast!=null){
           if(slow==null) return null;
         slow = slow.next;
           if(fast.next==null) return null;
         fast = fast.next.next;
         if(slow==fast){
           break;
          }
        }
    if(slow==fast){
        Node remp = head;
        while(remp!=null){
          if(remp==slow) return slow;
          remp = remp.next;
          slow = slow.next;
        }
         }
     return null; 
     }
  static Node   merge2LinkedList1(Node head1, Node head2){ 
      Node temp1 = head1;
      Node temp2 = head2;
         Node node = new Node(-1);
           Node temp3 = node;
        while(temp1!=null&&temp2!=null){ 
           if(temp1.data<temp2.data){
           node.next = temp1;
           temp1 = temp1.next;
          }
          else{
            node.next = temp2;
            temp2 = temp2.next;
          }
          node = node.next;
         
        }
          if(temp1==null) node.next = temp2;
        else node.next = temp1;
           return temp3.next;
          }      
static Node merge2LinkedList2(Node head1, Node head2){
       Node temp1 = head1;
      Node temp2 = head2;
         Node node = new Node(-1);
           Node temp3 = node;
        while(temp1!=null&&temp2!=null){ 
           if(temp1.data<temp2.data){
           Node x1 = new Node(temp1.data);
           node.next = x1;
           node = x1;
           temp1 = temp1.next;
          }
          else{
            Node x1 = new Node(temp2.data);
            node.next = x1;
            node = x1;
            temp2 = temp2.next;
          }
        }
         if(temp1==null)  node.next = temp2;
        else node.next = temp1;
           return temp3.next;
          }
static Node leetcodespitOddAndEven(Node head){
       Node input = head;
         Node node1 = new Node(-1);
         Node node2 = new Node(-1);
          Node odd = node1;
          Node even = node2;
        while(input!=null){ 
           odd.next = input;
           odd = odd.next;
           input = input.next;
          if(input==null) break;;
           even.next = input;
           even = even.next;
           input = input.next;
        }
        odd.next = node2.next;
        even.next = null;
        return node1.next;
      }
      static Node spitOddAndEven(Node head){
       Node input = head;
         Node node1 = new Node(-1);
         Node node2 = new Node(-1);
          Node odd = node1;
          Node even = node2;
        while(input!=null){ 
           if(input.data%2!=0){
           odd.next = input;
           odd = input;
          }
          else{
           even.next = input;
           even = input;
       
          }
          input = input.next;
        odd.next = node2.next;
        even.next = null;
      }
      return node1.next;
    
    }
      static Node removeDuplicatesList(Node head){
    if (head == null || head.next == null) return head;
       Node input = head;
         Node node1 = new Node(-1);
          Node temp = node1;
        while(input.next!=null){ 
           if(input.data!=input.next.data){
              temp.next = input;
             temp = temp.next;
             input = input.next;
            }
            else{
              input = input.next;
            }
        }
       temp.next = input;
       temp = temp.next;
       temp.next = null;
      return node1.next;
    }
      static Node removeDuplicatesList2(Node head){
    if (head == null || head.next == null) return head;
       Node input = head;
        while(input.next!=null){ 
           if(input.data!=input.next.data){
             input = input.next;
            }
            else{
              input.next = input.next.next;
            }
        }
      return head;
    } //  5 4 ,3 2,1  ,4,5
      static Node  reversListItretive(Node head){
        Node prev = null;
        Node curr = head;
        Node after = null;
        while(curr!=null){ 
          after = curr.next;
          curr.next = prev;
          prev = curr;
          curr = after;
            }
          return prev;
    }
     static Node  reversListRecursive(Node head){
      if(head.next==null) return head;
    Node newhead = reversListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return newhead;
    }
     static boolean   palindromeList(Node head){
        Node t = findMiddalElement(head); 
        Node prev = null;
        Node curr = t.next;
        Node after = null;
        while(curr!=null){ 
          after = curr.next;
          curr.next = prev;
          prev = curr;
          curr =
           after;
            }
       while(prev!=null){ 
         if(prev.data!=head.data) return false;
           prev = prev.next;
           head = head.next;
              }
          return true;
            }
      static int maximumTwinSum(Node head){
        Node t = findMiddalElement(head); 
        Node t2 = reversListItretive(t.next); 
        Node prev = t2;
         int sum = 0;
       while(prev!=null){ 
         if(prev.data+head.data>sum){
           sum = prev.data+head.data;
          } 
         prev = prev.next;
        head = head.next;
       }
          return sum;
            }
    static Node copyWithRamdomePointer(Node head){
        Node temp1 = head;
       Node h = new Node(-1);  
         Node temp2 = h;
       while(temp1!=null){   ///  new dammay node
      Node newnode = new Node(temp1.data); 
       temp2.next = newnode;
       temp2 = newnode;
       temp1 = temp1.next;
      }
      h = h.next;
      temp2 = h;
      temp1 = head;
     Node h2 = new Node(-1);  
       Node temp = h2;
      while(temp1!=null){    ///  conect cros  old and new
       temp.next = temp1;
       
       temp1 = temp1.next;
       temp = temp.next;
      
       temp.next = temp2;
       temp2 = temp2.next;
   
       temp = temp.next;
      }
      temp2 = h;
      temp1 = head;
        while (temp1 != null && temp2 != null) {
        if (temp1.random == null) {
            temp2.random = null;
        } else {
            temp2.random = temp1.random.next;
        }
        // Move both forward by skipping one node (since they are interleaved)
        temp1 = temp2.next;
        if (temp1 != null)
            temp2 = temp1.next;
    }
      temp2 = h;
      temp1 = head;
       while(temp1 != null && temp2 != null){    /// random  conect cros  old and new
       temp1.next = temp2.next;
       temp1 = temp1.next;
        if(temp1==null) break;
       temp2.next = temp1.next;
      
       temp2 = temp2.next;
      }
       return h;
    }              
   public static void main(String[] args) {
        Node x1 = new Node(1);
        Node x2 = new Node(44);
        Node x3 = new Node(5);       
        Node x4 = new Node(4);
        Node x5 = new Node(1);
       
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
     
        x1.random = null;
        x2.random = x1;
        x3.random = x5;
        x4.random = x3;
        x5.random = x1;
       
   }
   }

