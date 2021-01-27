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
public class WSTksumArray {
    static int maxSlidingWin(int arr[],int k){
        int sum_first_block=0;
        int win_sum_new=0;
        for(int i=0;i<k;i++){
            sum_first_block+=arr[i];
        }
        int win_sum=sum_first_block;
        int max=win_sum;
        int j=k,i=0;
        while(j<arr.length){
            win_sum_new=win_sum - arr[i] + arr[j];
            if(win_sum_new>win_sum){
                max=win_sum_new;
            }
            j++;
            i++;
            win_sum=win_sum_new;
        }
        return max; 
    }
    public static void main(String args[]){
        int arr[]={1000,10,3,100,5,5,3,200000};
        int max_sub_k_Consecutive_elements_sum=maxSlidingWin(arr,3);
        System.out.println("sum :"+max_sub_k_Consecutive_elements_sum);
    }
    
}
