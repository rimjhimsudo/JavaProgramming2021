/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import LinkedList.LinkedList.Node;

/**
 *
 * @author lenovo
 */
public class Client {
    public static void main(String args[]) throws Exception{
        //*************double linked ist**************
        
        DoubleLinkedList dll=new DoubleLinkedList();
        dll.addNodeLast(2);
        dll.addNodeLast(1);
        dll.addNodeLast(5);
        dll.addNodeLast(0);
        dll.addNodeLast(3);
        dll.display(dll.head);
        System.out.println();
        dll.sortDoubly(dll.head);
        dll.display(dll.head);
        
        //********List1**********
        /*
        LinkedList llist1=new LinkedList();
        llist1.addLast(0);
        llist1.addLast(20);
        llist1.addLast(10);
        llist1.addLast(3);
        llist1.addLast(4);
        llist1.addLast(5);
        llist1.addLast(6);
        llist1.addLast(7);
        llist1.display(llist1.head);
        */
        System.out.println();
        ///*****************LIST 2***********************
        /*
        LinkedList llist2=new LinkedList();
        llist2.addLast(1);
        llist2.addLast(2);
        llist2.addLast(3);
        llist2.addLast(4);
        llist2.addLast(5);
        llist2.addLast(6);
        llist2.addLast(7);
        llist2.display(llist2.head);
        System.out.println();
        //************LIST1**********
        LinkedList llist1=new LinkedList();
        llist1.addLast(0);
        llist1.addLast(20);
        llist1.addLast(10);
        llist1.addLast(3);
        llist1.addLast(4);
        llist1.addLast(5);
        llist1.addLast(6);
        llist1.addLast(7);
        llist1.display(llist1.head);
        Node s=llist1.quickSort(llist1.head);
        llist1.display(s);
        */
        //System.out.println("list1  : "+llist1.head+"    list2  :" +llist2.head);
        
       // int x=llist1.intersectPoint(llist1.head, llist2.head);
        //System.out.println(llist2.head.data + "headdata");
        //Node head=llist2.reverseInGroupksize(llist2.head,2);
        //Node h=llist2.reverseList(llist2.head);
        //System.out.println("point "+ x);
       // llist2.display(h);
        
       // System.out.println("mid val : "+llist2.midVal());
       
        
       /*
        LinkedList llist=new LinkedList();
        llist.addLast(4);
        llist.addLast(5);
        llist.addLast(6);
        llist.addLast(7);
        //llist.addFirst(3);
        //llist.addFirst(2);
        //llist.addFirst(1);
       // llist.display();
        System.out.println();
        System.out.println(llist.size+"size");
        try{
            System.out.println(llist.getNodeValueAt(2));
        }
        catch(Exception e){
            System.out.println("couldlnt work");
        }
        //if you put throws exception in front of main sincce now this is also dangrous fxn then try catch is not required like it is not reqd for getFirst();
        System.out.println("data at first :"+llist.getFirst());
        System.out.println("data at last :"+llist.getLast());
        System.out.println("data at last :"+llist.removeLast()); 
        llist.display();
        System.out.println("data at last :"+llist.removeFirst());
        //llist.reverseData();
        //llist.display();
        */
        
        
        
        
    }
    
}
