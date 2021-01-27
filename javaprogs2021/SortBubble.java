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
public class SortBubble {
     public static void main(String[] args){
        int a[]={4,5,10,6,2,7,8,4,9,0};
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
