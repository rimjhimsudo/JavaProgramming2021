/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
import java.util.*;
import java.math.*;
public class ReverseInGroup {
    //BEST approach
    static void reverseKsub(int n,int k,int []arr){
        //int n=arr.length;
        for(int i=0;i<n;i+=k){
            int left=i; //marks start of sub array size k
            int right=Math.min(i+k-1,n-1);///marks start of sub array size k
            //reverse sub array
            while(left<right){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                ++left;
                --right;
            }
        }
    }
    static void fxn_revOnArr(int i,int j,int arr[]){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        fxn_revOnArr(++i,--j,arr); //here pre increment not post else gives stackoverflow error
        
    }
    static void fxn_revRecur(int i,int j,ArrayList<Integer> arr){
        if(i>=j){
            return;
        }
        int temp=arr.get(i);
        int temp2=arr.get(j);
        arr.set(i,temp2);
        arr.set(j,temp);
        fxn_revRecur(++i,--j,arr); //here pre increment not post else gives stackoverflow error
        
    }
     static void rev_group(int n,int k,ArrayList<Integer> arr){
         int start=0;
         int size=n-1;
         int end=k-1;
         int i=0;
         while(i<size){
             fxn_revRecur(start,end,arr);
             i+=k;
             start=i;
             if(size-i<k){
                 end=size;
             }
             else{
                end=i+(k-1);
             }
         }
     }
     static void fxn_revIterative(int i,int j,ArrayList<Integer> arr){
        int n=j;
        int temp;
        for(int k=i;k<j/2;k++){
            temp=arr.get(k);
            arr.set(k,arr.get(k));
            arr.set(j,temp);
            n--;
        }
    }
     

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int j=0;j<6;j++){
            arr1.add(j+1);
        }
         for(int j=0;j<6;j++){
            System.out.print(arr1.get(j)+" ");
        }
         System.out.println();
        reverseKsub(6,2,arr);
        
        for(int j=0;j<6;j++){
            System.out.print(arr[j]+" ");
        }
        
    }
}
/*
Runtime ErrorException in thread "main" java.lang.IndexOutOfBoundsException:
Index 76 out of bounds for length 5at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)

/*
void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
          int s=0;
         int size=n-1;
         int end=k-1;
         int i=0;
         while(i<size){
             fxn_revRecur(s,end,arr);
             i+=k;
             s=i;
             if(size-i<k){
                 end=size;
             }
             else{
                end=i+(k-1);
             }
         }
    }
    
    static void fxn_revRecur(int i,int j,ArrayList<Integer> arr){
        if(i>=j){
            return;
        }
        int temp=arr.get(i);
        int temp2=arr.get(j);
        arr.set(i,temp2);
        arr.set(j,temp);
        fxn_revRecur(i+1,j-1,arr); //here pre increment not post else gives stackoverflow error
    }
*/
