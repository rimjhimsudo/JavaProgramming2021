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
public class JugglingAlgo {
   
    /*int arr[];
    public int[] juggle(int arr[], int n ,int k , int gcd){
        int
        return arr;
    }*/
    
    public static void main(String args[]){
        //testcase 1
       /* int N=12;
        int k=3;
        int gcd=3;
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        */
       //testcase2
        /*
        int N=15;
        int k=5;
        int gcd=5;
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        */
        //testcase 3
        /*int N=7;
        int k=2;
        int gcd=1;
        int arr[]={1,2,3,4,5,6,7};
        */
        int N=18;
        int k=7;
        int gcd=1;
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for(int i=0;i<gcd;i++){
            int tempval=arr[i];
            int j=i;
            int z=j+gcd;
            while(z<arr.length){
                arr[j]=arr[z];
                z+=gcd;
                j+=gcd; // or j=z;
            }
            arr[j]=tempval;
        }
        for(int j=0;j<N;j++){
            System.out.print(arr[j]+" ");
        }
        /*
        //wrong approach
        int count=0;
        for(int i=0;i<3;i++){
            int tempval=arr[i];
            for(int z=0;z<div;z++){
                int y=z+1;
                if(z==i){
                    arr[z]=arr[gcd+i];
                }
                else 
                if(gcd==z){
                    arr[gcd*z + count]=tempval;
                }
                else{
                    arr[gcd*z+i]=arr[gcd*y+i];
                }
                
            }
            count++;
            for(int j=0;j<N;j++)
            {
            System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        */
        
        
    }
    
}


















