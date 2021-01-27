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
     static int remove_duplicate(int A[],int N){
        // code here
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




