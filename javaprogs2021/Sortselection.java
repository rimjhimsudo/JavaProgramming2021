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
public class Sortselection {
    
    public static void main(String[] args){
        int ar[]={99,33,78,56,45};
        int n=5;
        for(int i=0;i<n;i++){
            int j=i+1, min_i=i, min=ar[i];
            while(j<n){
                if(ar[j]<min){
                    min_i=j;
                    min=ar[j];
                }
                j++;
            }
            int temp=ar[i];
            ar[i]=ar[min_i];
            ar[min_i]=temp;
            for(int k=0;k<n;k++){
            System.out.print(ar[k]+" ");
        }
        System.out.println();

        }
        
        
    }
    
}
