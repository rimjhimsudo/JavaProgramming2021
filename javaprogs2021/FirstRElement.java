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
import java.util.*;
public class FirstRElement {
    
    static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            else{
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        else{
            return -1;
        }
 
  
        // We reach here when element is not present 
        // in array 
    }
    static int linearSearch(int arr[],int size,int x){
         for(int i=0;i<size;i++){
        if(arr[i]==x){
            return i;
        }
       }
       return -1;  
    }

public static int firstRepeated(int []arr, int n) 
{    
    int final_ele=Integer.MAX_VALUE;
    int index_repeat=-1;
    int ele_repeat=-1;
    int arrcopy[]=new int[n];
    for(int i=0;i<n;i++){
        arrcopy[i]=arr[i];
    }
    Arrays.sort(arrcopy);
    int i=0;
    while(i<n-1){
        if(arrcopy[i]==arrcopy[i+1]){
            ele_repeat=arrcopy[i];
            index_repeat=linearSearch(arr, n,ele_repeat);
            
            if(index_repeat<final_ele){
                final_ele=index_repeat+1;
            }
            i+=2;    
        }
        else{
            i++;
        }
    }
    if(final_ele==Integer.MAX_VALUE){
        final_ele=-1;
    }
    return final_ele;
    
}
    public static void main(String args[]){
        
        int final_ele=Integer.MAX_VALUE;
        int n = 7;
        int arr[] = {1, 5, 30, 4, 3, 5, 3};
       // Arrays.sort(arr);
        //int ans=binarySearch(arr,0,n,3);
        int ans=firstRepeated(arr, n);
        System.out.println(ans);
        /*
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        arrlist.add(arr[i]);
        }
        
        Arrays.sort(arr);
        
        for(int k=0;k<n;k++){
            //System.out.println(arrlist.get(k));
            System.out.println(arr[k]);
        }*/
        
        
    
    }
    
}
