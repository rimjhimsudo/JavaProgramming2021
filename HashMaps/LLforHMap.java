/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMaps;

/**
 *
 * @author lenovo
 */
public class LLforHMap<T> {
    //node class 
    //node class is private here so that authorrty of making objects of this class is with only linkedlist class and no other can use it
     class Node{
        T data;
        Node next;
        public Node(T d){
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
    public void addLast(T item){
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
    public void addFirst(T item){
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
   
    public T getNodeValueAt(int index) throws Exception{
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
     public T getFirst() throws Exception{
         if(size==0){
             throw new Exception("LL is empty");
         }
         return this.head.data;
     }
     public T getLast() throws Exception{
         if(size==0){
             throw new Exception("LL is empty");
         }
         return this.tail.data;
     }
     public T removeFirst() throws Exception{
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
     public T removeLast() throws Exception{
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
         T data=tail.data;
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
    public int listSize(Node node){
        int c1=0;
        Node t1=node;
        while(t1!=null){
             c1++;
             t1=t1.next;
         }
         return c1;
    }
}
