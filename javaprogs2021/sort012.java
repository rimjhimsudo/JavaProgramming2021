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
public class sort012 {
    public static void sort012(int a[], int n){
        //t.c.= o(n) and s.c.=o(n)
        //correct
    // code here 
       int output[]=new int[n];
       int i=0;
       int j=n-1;
       for(int z=0;z<n;z++){
           if(a[z]==0){
               output[i]=0;
               i++;
           }
           else if(a[z]==2){
               output[j]=2;
               j--;
           }

       }
       if(i<=j){
           while(i<=j){
               output[i]=1;
               i++;
           }
       }
       for(int x=0;x<n;x++){
           a[x]=output[x];
       }
    }
    
    public static void _sort012(int a[], int n){
        //SPACE O(1) AND T.C=O(N)
         int lo = 0; 
        int hi = n - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        }
    }
    public static void main(String[] args){
    
        int a[]={0,2,0,1,1,2,2,0,2,0,1,0,2,1,0,2,1,0,1,2,1,0,2,1,0,2,1,0,2,1,2,2,2,2,2,1,0,2,0,2,1,2,1,0,1,1,1,1,1};
        int n=a.length;
        _sort012(a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
