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
import java.util.*;
//BRUTEFORCE
public class MaximumEleKsizeWindow{
    public static ArrayList<Integer> MaximumEleKsizeWindow(int ar[],int k){
        //int max=-1;
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        for(int i=0;i<=ar.length-k; i++){
            int max=ar[i];
            for(int j=i+1;j<i+k;j++){ // why i did i+k becasue it is less than but not less than equal to so it itself run for 1 less time
                if(ar[j]>max){
                    max=ar[j];
                }
            }
            list.add(max);
        }
        return list;
    }
    
    public static void main(String args[]){
        int arr[]={1000,10,3,100,5,50000,3,2};
        ArrayList<Integer> l=MaximumEleKsizeWindow(arr,3);
        for(int i=0;i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}
