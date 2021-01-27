/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author lenovo
 */
public class FindXarray {
    
    public static boolean recurX(int arr[], int n, int index,int x){
        if(index>=n){
            return false;
        }
        if(arr[index]==x){
            return true;
        }
        return recurX(arr,n,index+1,x);
        
    }
    public static void main(String[] args){
        int arr[]={4,3,6,5,2,3,8};
        boolean ans=recurX(arr,arr.length,0,3);
        System.out.println(ans);
    }
    
}
