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
public class PrefixSumArray {
    
    static void fillPrefixSum(int arr[], int N, int prefixSum[]) 
    { 
     prefixSum[0] = arr[0]; 
  
    // Adding present element  
    // with previous element 
    for (int i = 1; i < N; i++) 
        prefixSum[i] = prefixSum[i-1] + arr[i]; 
    } 
    public static void main(String args[]){
        int N=5;
        int arr[]={1,2,3,4,5};
        int arr_prefix[]=new int[5];
        fillPrefixSum(arr, N ,arr_prefix);
         for(int j=0;j<N;j++){
            System.out.print(arr_prefix[j]+" ");
        }
    }
   
    
    
}
