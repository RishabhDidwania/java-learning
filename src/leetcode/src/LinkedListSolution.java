public class LinkedListSolution {

    public static void main(String[] args){
        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode head1 = head;
        while(head1!=null){
            System.out.print(head1.val+"  ");

            head1= head1.next;
        }
        System.out.println();
        head = LinkedListSolution.reverseInSets(head, 3);
        LinkedListSolution.printLL(head);

    }



    public static ListNode reverseInSets(ListNode head, int k ){

        ListNode dummy = new ListNode(0, head);

        ListNode head_ = head;
        int length = 0;
        while(head_!=null){
            head_ = head_.next;
            length +=1;
        }

        // Little addition to the constraints
        // if k< remaining length then dont reverse
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr!=null){
            System.out.println(curr.val);
            if(k<=length){
                for(int i=0; i<k-1&&curr.next!=null;i++){
                    ListNode temp = curr.next;
                    curr.next = temp.next;
                    temp.next = prev.next;
                    prev.next = temp;

                }
                length-=k;

                prev = curr;
                curr = prev.next;
            }
            else return dummy.next;
        }

        return dummy.next;

    }

    public static void printLL(ListNode head){
        System.out.println("Result");
        while(head!=null){
            System.out.print(head.val+"  ");
            head= head.next;
        }
    }


//1-2-3-4-5-null


}


class ListNode {
    int val;
    ListNode next;

     ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
         this.val = val;
         this.next=next;
    }
}