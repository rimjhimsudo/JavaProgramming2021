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
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    //best approach in constant space
   static int removeDup(int a[],int N){
        // code here
        if(N==0 || N==1){
            return N;
        }
        int j=0;
        //i is kept i<n-1 beacuse we are comparing a[i] to a[i+1] so
        for(int i=0;i<N-1;i++){
            if(a[i]!=a[i+1]){
                a[j++]=a[i];
            }
            
        }
        a[j++]=a[N-1];
        return j;//return new size
    }
     static int remove_duplicate(int A[],int N){
        //BRUTEFORCE APPROACH
        int size=N;
        if(size==1){
            return size;
        }
        int i=0;
        while(i<size-1){
            
            if(A[i+1]!=A[i]){
                i++;
            }
            else{
                if(size==2){
                    return size-1;   
                }
                for(int j=i+1;j<size-1;j++){
                    A[j]=A[j+1];
                }
                size--;

            }
        }
        return size;
    }
     
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=6;
        int a[] = new int[N];
        for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            int n = remove_duplicate(a,N);
            
            for(int i=0; i<n; i++){
                System.out.println(i+" : "+a[i]+" ");
                
            }
            System.out.println();
            
        }
    }




