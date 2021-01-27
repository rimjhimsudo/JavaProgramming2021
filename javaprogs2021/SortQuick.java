/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

/**
 *
 * @author lenovo
 */
public class SortQuick {
    static int partition(int arr[], int low, int high)
    {
        // your code here
   int pivot=arr[high];
   int i=low-1;
   for(int j=low;j<high;j++){
       if(arr[j]<pivot){
           i++;
           //swap
           int temp=arr[j];
           arr[j]=arr[i];
           arr[i]=temp;
           
       }
   }   
       //swap last elemnt which at arr[i+1] with pivot
       i++;
       int temp=arr[i];
       arr[i]=pivot;
       arr[high]=temp;
    
       return i;
    
    }
    
    static void qsort(int arr[], int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);
            qsort(arr,low,pi-1);
            qsort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        int a[]={4,5,10,6,2,7,8,4,9,0};
        int n=10;
        qsort(a,0,9);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
    
    
}
