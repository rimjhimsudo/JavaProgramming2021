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
public class SmallestPositiveNumberMissing {
    public static void main(String args[]){
    int n=22;
    int a[]={8 ,45, -21, -13, -15, 43, -32, -22, -7, -39, -22, -21, 26, -46, -7, 13, -37, -12, -44, -10, -46, -32};

   // int a[]={0, 4, 1 ,2,3};
    Arrays.sort(a);
    for(int k=0;k<n;k++){
        System.out.println(a[k]);
    }
    int nas=findMissing(a,n);
    System.out.println("nas : " +  nas);
}
    
    static int findMissing(int arr[], int size)
    {
       
       // Your code here
       int ans=1;
       int i=0;
     //  int negative_f=false;
       Arrays.sort(arr);
       if(arr[size-1]<=0){
           return 1;
       }
       if(arr[size-1]>0  && arr[0]>=0){
           for(int z=0;z<size;z++){
               if(arr[z]!=z+1){
                   return z+1;
               }
           }
           
           return size+1;
          // return 1+arr[size-1];
       }
       while(i<size){
           if(arr[i]<0){
               i++;
           }
           else if(arr[i]==0){
              // negative_f=true;
               if(arr[i+1]==1){
                   i++;
               }
               else{
                   ans= 1;
                   break;
               }
           }
           else{
              // negative_f=true;
              for(int k=0;k<size;k++){
                  if(arr[i]!=k+1){
                      ans=k+1;
                      break;
                  }
                 // i++;
                 
              }
              ans=arr[size-1]+1;
              break;
           }
       }
       
       return ans;
       
    }
    
}
/*
 int val=arr[i];
               val++;
               int j=i+1;
               if(j<size && (arr[j]==val || arr[j]==val-1) ){
                   i++;
               }
               else if(i==size-1){
                   if(arr[i]-arr[i-1]==1){
                       ans=arr[i]+1;
                       break;
                   }
                   else{
                       ans=arr[i-1]+1;
                       break;
                   }
               }
               
               else{
                   ans= val;
                   break;
               }
*/

