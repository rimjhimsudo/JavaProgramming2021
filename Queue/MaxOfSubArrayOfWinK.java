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
public class MaxOfSubArrayOfWinK {
    public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
        int arr[]={1000,10,3,100,5,50000,3,1};
        ArrayList<Integer> l=max_of_subarrays(arr,arr.length,1);
        for(int i=0;i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> list=new ArrayList <Integer>();
        Deque<Integer> q=new LinkedList<>();
        int i;
        for( i=0;i<k;i++){
            while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();   
            }
            q.addLast(i);  //we are ading indices not element in queue
        }
        for(;i<arr.length;i++){
           // System.out.println(arr(q.getFirst()));
           list.add(arr[q.getFirst()]);
            while(!q.isEmpty() && q.getFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();   
            }
            q.addLast(i);
        }
        //System.out.println(arr(q.getFirst()));
        list.add(arr[q.getFirst()]);
        return list;
    }
}
    
