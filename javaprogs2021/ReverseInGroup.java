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
public class ReverseInGroup {
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
        rev_group(6,2,arr1);
        
        for(int j=0;j<6;j++){
            System.out.print(arr1.get(j)+" ");
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
