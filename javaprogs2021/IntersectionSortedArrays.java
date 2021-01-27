/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

import java.util.ArrayList;
import java.util.Collections;
import static javaprogs2021.UnionSortedArrays.findUnion;

/**
 *
 * @author lenovo
 */
public class IntersectionSortedArrays {
     public static int linear_serach(ArrayList<Integer> al, int unknown){
        for(int i=0;i<al.size();i++){
            if(al.get(i)==unknown){
                return i;
            }
        }
        return -1;
    }
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        // add your code here
        ArrayList<Integer> reslist=new ArrayList<Integer>();
        int i=0, j=0;
        if(arr1[i]<arr2[j] && arr1[n-1]<arr2[j])
            {
                reslist.add(-1);
                return reslist;
            }
        
        else if(arr1[i]>arr2[j] && arr2[m-1]>arr1[i]){
            
                reslist.add(-1);
                return reslist;
            
        }
        else{
             int z=-1;
             while(i<n && j<m){
                 if(arr1[i]==arr2[j]){
                     if(z==-1){
                         z++;
                         reslist.add(arr1[i]);
                         i++;
                         j++;
                     }
                     else{
                         int adj=reslist.get(z);
                         if(adj!=arr1[i]){
                             reslist.add(arr1[i]);
                             z++;
                             i++;
                             j++;
                         }
                     }
                 }
                 else if(arr1[i]<arr2[j]){
                     i++;
                 }
                 else{
                     j++;
                 }
             }
           
        }
        return reslist;
    }
    public static void main(String[] args){
        int arr1[]={1,2,2,3,4};
        int arr2[]={1,1,1,1,1,2};
        ArrayList<Integer> a=new ArrayList<Integer>();
        a=intersection(arr1, arr2,5,6);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
            
        }
        
    }
     static ArrayList<Integer> intersection(int arr1[], int arr2[], int n, int m) 
    {
        ArrayList<Integer> reslist=new ArrayList<Integer>();
        int i=0, j=0;
        
             int z=-1;
             while(i<n && j<m){
                 if(arr1[i]==arr2[j]){
                     if(z==-1){
                         z++;
                         reslist.add(arr1[i]);
                         i++;
                         j++;
                     }
                     else{
                         int adj=reslist.get(z);
                         if(adj!=arr1[i]){
                             reslist.add(arr1[i]);
                             z++;
                             i++;
                             j++;
                         }
                     }
                 }
                 else if(arr1[i]<arr2[j]){
                     i++;
                 }
                 else{
                     j++;
                 }
             }
           
        
        return reslist; 
    }
    
}
