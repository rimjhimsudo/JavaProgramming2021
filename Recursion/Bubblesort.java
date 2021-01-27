/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author lenovo
 */
public class Bubblesort {
    public static void bubbleRec(int[] arr, int si, int li){
        if(li==0){
            return ;
        }
        if(si==li){
            bubbleRec(arr, 0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp=arr[si];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        bubbleRec(arr,si+1,li);
    }
    public static void main(String args[] ){
        int arr[]={56,34,90,78,65,2,4,3,1,5,6,0,98,34,98};
        bubbleRec(arr,0,14);
        for(int i=0;i<15;i++){
            System.out.println(arr[i]);
        }
        }
    
}
