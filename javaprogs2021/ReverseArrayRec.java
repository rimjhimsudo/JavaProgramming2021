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
public class ReverseArrayRec {
    static void fxn_rev(int i,int j,int arr[]){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        fxn_rev(++i,--j,arr); //here pre increment not post else gives stackoverflow error
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int i=0,end=arr.length-1;
        fxn_rev(i,end,arr);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        
    }
    
}
