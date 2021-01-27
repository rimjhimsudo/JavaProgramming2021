/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

import java.util.ArrayList;
import static javaprogs2021.IntersectionSortedArrays.printIntersection;

/**
 *
 * @author lenovo
 */
public class SortCounting {
    
    public static char[] sort(char arr[]){
        int n=arr.length;
        char op[]=new char[n];
        int count[]=new int[256];
        //initialise with 0
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            int index=arr[i];
            //System.out.println(index);
            count[index]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
            //System.out.println(count[i]);
        }
        for(int j=0;j<arr.length;j++){
            int op_index=count[arr[j]];
            op[op_index-1]=arr[j];
            count[arr[j]]--;
        }
        
        
        return op;
    }
     public static void main(String[] args){
        //int arr1[]={1,2,3,4,5,6,7,8,9,10};
        char arr[]={'w','y','i','o','j','g'};
        char arr1[]=sort(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            
        }
        
    }
}
