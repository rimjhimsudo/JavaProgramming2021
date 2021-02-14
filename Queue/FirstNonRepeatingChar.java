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
public class FirstNonRepeatingChar {
    public static void main(String args[]){
        //TIME COMPLEXITY = T.C.=N+N=O(N)
        // enter . to terminate program
        
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
         int i=0;
         HashMap<Character, Integer> map = new HashMap<>();
         Queue<Character> q=new LinkedList<>();
         while(c!='.'){
             q.add(c); //enqueue
             if(map.containsKey(c)){
                 int count=map.get(c);
                 count+=1;
                 map.put(c,count);
             }
             else{
                 map.put(c,1);
             }
             while(!q.isEmpty()){
                 char front=q.peek();
                 if(map.get(front)==1){
                     System.out.println(front);
                     break;
                 }
                 else{
                     q.remove();
                 }
             }
             if(q.isEmpty()){
                 System.out.println("-1");
             }
             c=sc.next().charAt(0);
         }
         
    }
    
    
    
}
