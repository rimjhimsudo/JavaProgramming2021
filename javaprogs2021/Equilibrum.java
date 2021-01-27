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
public class Equilibrum {
    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n) {
        if(n==1){
            return 1;
        }

        // Your code here
        int left_i=0;
        int righ_j=2;
        long leftsum=0;
       // int a[]={-7, 1 ,5 ,2 ,-4, 3 , 0};
        //int n=7;
        long sum=0, rightsum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        boolean flag=false;
        while(left_i<n-2){
            leftsum+=arr[left_i];
            rightsum=sum-arr[righ_j-1] -leftsum;
            if(leftsum==rightsum){
                flag=true;
                break;
            }
            left_i++;
            righ_j++;
        }
        if(flag==true){
            return righ_j;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        
    }
}
