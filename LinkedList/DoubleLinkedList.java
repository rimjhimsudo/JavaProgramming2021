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
public class DoubleLinkedList {
    class Node { 
        int data; 
        Node prev; 
        Node next; 

        // Constructor to create a new node 
        // next and prev is by default initialized as null 
        Node(int d) 
        { 
            prev=null;
            next=null;
            data = d; } 
    }
   Node head;
   public void addNodeLast(int data){
       Node n=new Node(data);
       if(head==null){
           head=n;
           return;
       }
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       n.prev=temp;
       temp.next=n;
       
   }
   public void display(Node h){
        Node temp=h;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   public  Node findMid(Node head) {
        Node fast = head, slow = head , prev=null;  
        while (fast.next != null && fast.next.next != null) { 
           // prev=slow;
            fast = fast.next.next; 
            slow = slow.next; 
        } 
        Node temp = slow.next; 
        slow.next = null; 
        System.out.println(temp.data);
        return temp; 
     
    }
    //MERGESORT
   public  Node mergeSort(Node head){
        if(head.next==null || head==null){
            return head;
            
        }
        //find mid    
        Node mid=findMid(head);
        //call on left
        Node one=mergeSort(head);
        //call on right
        Node two=mergeSort(mid);
        return merge(one,two);
    }
    //MERGE
    public  Node merge(Node one,Node two){
        Node third=new Node(-1);
        Node ptr=third;
        while(one!=null  && two!=null){
            if(one.data<=two.data){
                ptr.next=one;
                Node temp=one.next;
                one.prev=ptr;
                one.next=null;
                one=temp;
            }
            else{
                ptr.next=two;
                Node temp=two.next;
                two.prev=ptr;
                two.next=null;
                two=temp;
            }
            ptr=ptr.next;
        }
        if(one!=null){
            ptr.next=one;
            one.prev=ptr;
            
        }
        else if(two!=null){
            ptr.next=two;
            two.prev=ptr;
        }
        Node head=third.next;
        head.prev=null;
        return head;
    }
    
    public  Node sortDoubly(Node head)
    {
        Node h=mergeSort(head);
        return h;
    }
    
}
