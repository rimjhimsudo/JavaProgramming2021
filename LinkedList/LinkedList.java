/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author lenovo
 */
public class LinkedList {
    //node class 
    //node class is private here so that authorrty of making objects of this class is with only linkedlist class and no other can use it
     class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public Node head;
    private Node tail;
    public int size=0;
    
    public void display(Node node){
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void addLast(int item){
        Node temp=new Node(item);
        this.size++;
        if(this.head==null){
            this.head=temp;
            this.tail=temp;
            return;
        }
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        this.tail=cur.next;
    }
    public void addFirst(int item){
        Node temp=new Node(item);
        this.size++;
        if(this.head==null){
            this.head=temp;
            this.tail=temp;
            return;
        }
        Node cur=this.head;
        temp.next=this.head;
        head=temp;
    }
   
    public int getNodeValueAt(int index) throws Exception{
        if(this.size==0){
            throw new Exception("list is empty");
        }
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        Node temp=head;
        int i=1; //start index from 1 because temp is already at head.
        while(i<=index){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
     public int getFirst() throws Exception{
         if(size==0){
             throw new Exception("LL is empty");
         }
         return this.head.data;
     }
     public int getLast() throws Exception{
         if(size==0){
             throw new Exception("LL is empty");
         }
         return this.tail.data;
     }
     public int removeFirst() throws Exception{
         if(size==0 || head==null){
             throw new Exception("LL is empty");
         }
         Node temp=head;
         if(head==tail){
             size--;
             head=null;
             return temp.data;
         }
         
         head=temp.next;
         this.size--;
         return temp.data;
     }
     public int removeLast() throws Exception{
         if(size==0 || head==null){
             throw new Exception("LL is empty");
         }
         if(head==tail){
             Node temp=tail;
             size--;
             head=null;
             tail=null;
             return temp.data;
         }
         //Node temp=tail;
         Node temp1=head;
         while(temp1.next!=tail){
             temp1=temp1.next;
         }
         int data=tail.data;
         temp1.next=null;
         temp1=tail;
         size--;
         return data;
     }
      //this function is private beacause it is returning node and we have kept node as private class in linkedlist class. so hence this fxn should also be private
    private Node getNodeAt(int index) throws Exception{
        if(this.size==0){
            throw new Exception("list is empty");
        }
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }
        Node temp=head;
        int i=1;
        while(i<=index){
            temp=temp.next;
            i++;
        }
        return temp;
    }
     
     public void reverseData() throws Exception{
        
         int r_idx =(this.size)-1;
         int l_idx =0;
         while(l_idx<r_idx){
             Node right=getNodeAt(r_idx); //it is a function
             Node left=getNodeAt(l_idx);
             //swap logic
             int val=left.data;
             left.data=right.data;
             right.data=val;
             
             l_idx++;
             r_idx--;
         }        
     }
     public Node reversePointers(Node head){
         if(head.next==null){
             return head;
         }
         /* //this approach i use first or if there are only 2 element but later i figured a general case for size =2 to size=n which iwas not able to figure befor so i made this as one if().
         if(head.next.next==null){
             Node cur=head.next;
             Node prev=head;
             cur.next=prev;
             prev.next=null;
             head=cur;
         }
        */
         Node temp=head; //will be used at last to change head ka nexxt = null when  list will be reversed
         Node cur=head.next;
         Node prev=head;
         head=cur.next;
         while(cur.next!=null){
             cur.next=prev; //this change pointers
             //cur=head;   ///if we keep cur=head then at last when cur will be pointing at last elemnt and want to go to head it will give error since head already ppoints at null
             prev=cur;
             cur=head;
             head=head.next;
         }
         cur.next=prev;
         head=cur;
         temp.next=null;
         return head;
        }
     
     public Node reverseRecursive(Node node){
         if(node==null){
             return null;
         }
         if(node.next==null){
             head=node;
             return head;
         }
         Node temp=reverseRecursive(node.next);
         temp.next=node;
         node.next=null;
         return node;
     }
     public int midVal(){
         //approach take 2 pointer out of which 1 moves double of first so double nobe reahes full length that time single node reaches only mid.
         if(size==0){
             return -1;
         }
         Node singleN=head;
         Node doubleN=head;
         /*
         //way 1
         while( doubleN.next!=null && doubleN.next.next!=null){
             for(int i=0;i<2;i++){
                 doubleN=doubleN.next;
             }
             singleN=singleN.next;
         }
        */
         while( doubleN.next!=null && doubleN.next.next!=null){
             doubleN=doubleN.next.next;
             singleN=singleN.next;
         } 
         return singleN.data;
     }
     public boolean detectLoop(Node head){
         Node slow=head;
         Node fast=head;
         while(slow!=null && fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(fast==slow){
                 return true;
             }
         }
         return false;
         
         
     }
     public Node reverseInGroupksize(Node node,int k){
         Node new_head=new Node(0);
         Node start=head;
         Node end=head;
         Node new_end=new_head;
         while(head.next!=null){
             int i=1;
             while(i<k && end.next!=null){
                 end=end.next;
                 i++;
             }
             head=end.next;
             end.next=null;
             Node temp=reverseList(start);
             new_end.next=temp;
             new_end=start;
             start=head;
             end=head;
         }
         return new_head.next;
     }

     public Node reverseList(Node head){
         Node cur=head;
         Node prev=null;
         while(cur!=null){
            head=cur.next;
            cur.next=prev;
            prev=cur;
            cur=head;
        }
         return prev;
     }
     //1.blank node to handle start
     //2.
      int intersectPoint(Node head1, Node head2)
     {  int x=-1;
     
         int c1=0;
         int c2=0;
         int d=0;
         
         c1=listSize(head1);
         System.out.println("c1   "+c1);
         c2=listSize(head2);
         System.out.println("c2   "+c2);
         
         if(c2>c1){
             d=c2-c1;
             for(int i=1;i<=d;i++){
                 head2=head2.next;
             }
         }
         else{
             d=c1-c2;
             for(int i=1;i<=d;i++){
                 head1=head1.next;
             }
         }
         while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                
              x= head1.data;
              System.out.println(x);
              return x;
            }
            head1=head1.next;
            head2=head2.next;
         }
         return x;
    }
    public int listSize(Node node){
        int c1=0;
        Node t1=node;
        while(t1!=null){
             c1++;
             t1=t1.next;
         }
         return c1;
    }
     public static Node partition(Node start, Node end){
        if (start == end || start == null || end == null){
            return start;
        }
            
        int piv=end.data;
        Node smallptr=start;
        Node prevsmall=start;
        while(start!=end){
            if(start.data<piv){
                //swap
                int temp=start.data;
                start.data=smallptr.data;
                smallptr.data=temp;
                prevsmall=smallptr;
                smallptr=smallptr.next;
            }
            start=start.next;
        }
        //swap at last and put pivot at right position
        end.data=smallptr.data;
        smallptr.data=piv;
              
        
        return prevsmall; 
       
    }
    public static void qsort(Node start, Node end){
        if(start==null || end==null || start==end.next || start==end){
            return ;
        }
        Node pivot_prev=partition(start,end);
        qsort(start,pivot_prev);
        qsort(pivot_prev.next.next,end);
        //return start; 
        
    }
    public static Node quickSort(Node node)
    {
        //Your code here
        Node head=node;
        Node tail=node;
        while(tail.next!=null){
            tail=tail.next;
        }
        System.out.println("tail  : "+tail.data);
        qsort(head,tail);
        return head;
    }
     
    
}



/////////////////////
import java.util.*;
import java.io.*;
public class drive{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //input
        while(T>0)
        {
             long N = sc.nextLong();
             long a[] = new long[(int)N];
             long k=sc.nextLong();
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Flipkart f = new Flipkart();
             long ans = f.game_func(a,k);
            
            
            System.out.println(ans);
            //System.out.println();
            T--;
        }
    }
}
class Flipkart{
    public  long game_func( long arr[] , long k){
        //long long arr[]=new long[n];
         long max=Max_fxn(arr);
         long min=Min_fxn(arr);
         long diff=max-min;
         long step=0;
        if(max-min==k){
            return 0;
        }
        while(diff!=k){
            //diff=
            if(k>=max && diff<k){
                max+=1;
            }
            else if(k<diff && k>=min && k<=max){
                max+=-1;
            }
            else if(k<=min  && diff>k){
                min+=1;
            }
            else if(k<=min  && diff<k){
                max+=1;
            }
            diff=max-min;
            step++;
        }
        return step;
    }


    public  long Max_fxn(long arr[]){
        int i; 
           
         // Initialize maximum element 
         long max = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max;
    }
    public  long Min_fxn( long inputArray[]){
         long minValue = inputArray[0]; 
        for(int i=1;i<inputArray.length;i++){ 
        if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
        } 
        } 
        return minValue; 
    }
}