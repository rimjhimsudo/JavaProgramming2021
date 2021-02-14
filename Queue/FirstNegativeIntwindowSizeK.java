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
public class FirstNegativeIntwindowSizeK {
     public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
        int arr[]={12,1,7,-8,-15,30,16,28};
        ArrayList<Integer> l=negative_of_subarrays_sizeK(arr,arr.length,1);
        for(int i=0;i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
    static ArrayList <Integer> negative_of_subarrays_sizeK(int arr[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> list=new ArrayList <Integer>();
        Deque<Integer> q=new LinkedList<>();
        int i;
        for( i=0;i<k;i++){
            if(arr[i]<0){
            q.addLast(i);
            }//we are ading indices not element in queue
        }

        for(;i<arr.length;i++){
           // System.out.println(arr(q.getFirst()));
           if(q.isEmpty()){
               list.add(0); 
           }
           else{
               list.add(arr[q.getFirst()]);
           }
            while(!q.isEmpty() && q.getFirst()<=i-k){
                q.removeFirst(); //checking indices whther alreay added indices negative number will contribute in next window or not
            }
            if(arr[i]<0){
            q.addLast(i);
            }
        }
        if(!q.isEmpty()){
        list.add(arr[q.getFirst()]);
        }
        else{
            list.add(0); 
        }
        return list;
    }
    
}
