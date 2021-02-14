/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author lenovo
 */
import java.util.*;
public class ReverseQueue {
    //does return new queue
    public static Queue<Integer> reverseQ(Queue<Integer> q){
        if(q.isEmpty()){
            return new LinkedList<>();
        }
        int element=q.remove();
        reverseQ(q);
        q.add(element);
        return q;
    }
    //doesnt return and changes in same queue
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int element=q.remove();
        reverseQ(q);
        q.add(element);
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //Queue<Integer> q_rev=reverseQ(q);
        reverseQ(q);
        System.out.println(q);
    }
}
