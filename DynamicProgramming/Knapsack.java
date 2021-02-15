/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author lenovo
 */
import java.util.*;
import java.io.*;
import java.lang.*;
public class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSackRecursive(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         if(n==0 || W==0){
             return 0;
         }
         int ansInc=0;
         int ansExc=0;
         if(wt[n-1]<=W){
             ansInc= Math.max(val[n-1]+knapSackRecursive(W-wt[n-1], wt, val, n-1),knapSackRecursive(W, wt, val, n-1));
         }
         else if(wt[n-1]>W){
             ansExc=knapSackRecursive(W, wt, val, n-1);
         }
         return Math.max(ansInc, ansExc);
         
    } 
    // Returns the maximum value that can be put in a knapsack of capacity W 
   
    static int knapSackMemo(int W, int wt[], int val[], int n){
         int[][] strg=new int[n+1][W+1];   
         for(int i = 0; i < n + 1; i++){   
            for(int j = 0; j < W + 1; j++) {  
                strg[i][j] = -1;   
            }
             
        }
        return knapSackRecforMemo(W, wt, val, n, strg);
    } 
    static int knapSackRecforMemo(int W, int wt[], int val[], int n,int[][]strg) 
    { 
         // your code here 
         if(n==0 || W==0){
             return 0;
         }
         if(strg[n][W]!=-1){
             return strg[n][W];
         }
       
         if(wt[n-1]<=W){
             return strg[n][W]= Math.max(val[n-1]+knapSackRecforMemo(W-wt[n-1], wt, val, n-1,strg),knapSackRecforMemo(W, wt, val, n-1,strg));
          
         }
         else{
             return strg[n][W]=knapSackRecforMemo(W, wt, val, n-1,strg);
         }
         
    } 
    
    public static void main(String args[] ){
        int W=4;
        int wt[]={4,5,1};
        int val[]={1,2,3};
        int ans=knapSackMemo(W,wt,val,3);
        System.out.println(ans);        
    }
}