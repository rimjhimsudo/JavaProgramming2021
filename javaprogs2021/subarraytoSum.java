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
public class subarraytoSum {
    public static void main(String args[]){
        int arr[]={1,2,3,7,5};
        ArrayList<Integer> arrL=subarraySum(5,12 ,arr);   
        for(int i=0;i<arrL.size();i++){
            System.out.println(arrL.get(i));
        }
    }
    static ArrayList<Integer> subarraySum(int n, int s, int[] arr) {
        //bruteforce in O(n)
       ArrayList<Integer> arrL=new ArrayList<Integer>();
        int sumtilli=0;
        int j=0,i=0;
        // Your code here
        boolean flag=false;
        for( i=0;i<n;i++){
            sumtilli=0;
             j=i;
            while(sumtilli<=s && j<n){
            sumtilli+=arr[j];
            if(sumtilli==s){
                flag=true;
                break;
            }
            j++;
            }
            if(flag==true){
                break;
            }
        }
        if(flag==false){
            arrL.add(-1);
        }
        else{
        arrL.add(i+1);
        arrL.add(j+1);
        }
        return arrL;
        
    }
    
}
