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
public class Fibonacci {
    
    public static long fib_DP_FindNTerm(int n , long arr[]){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        // 0 1 1 2 3 5 8 13.... so on
        if(arr[n]!=0){
            return arr[n];
        }
        
        long f1=fib_DP_FindNTerm(n-1 , arr);
        long f2=fib_DP_FindNTerm(n-2, arr);    
        long fans=f1+f2;
        arr[n]=fans;
        return fans;
    }
    public static long fibIterative(int n){
        //0 1 1 2 3 5 8 13 21 
        //array filling
        long arr[]=new long[n+1];
        arr[1]=1; //seed : to put value which are initialising
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
        
    }
    public static long[] printFibbSeries(int n) 
    {
        //Your code here
        long[] arr=new long[n];
        if(n==1){
            arr[0]=1;
            return arr;
        }
        arr[0]=1;
        arr[1]=1;

         arr[n-1]=fibUtilityForPrintSeries(n-1,arr);
         return arr;

    }
    public static long fibUtilityForPrintSeries(int n , long arr[]){
            if(n==0){
                //arr[0]=1;
                return arr[0];
            }
            if(n==1){
                //arr[1]=1;
                return arr[1];
            }
            if(arr[n]!=0){
                return arr[n];
            }

            long f1=fibUtilityForPrintSeries(n-1 , arr);
            long f2=fibUtilityForPrintSeries(n-2, arr);    
            long fans=f1+f2;
            arr[n]=fans;
            return fans;
    }
    
    public static void main(String args[] ){
        int n=7;
        long arr[]=new long[n];
        //long ans=fib_DP_FindNTerm(n,arr);
        //long ans=fibIterative(n);
        //System.out.println(ans);
        long series[]=printFibbSeries(n);
        for(int i=0;i<n;i++){
            System.out.println(series[i]);
        }
    }
    
    
    
}
