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
/*
1) Use two index variables i and j, initial values i = 0, j = 0 
2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i. 
3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j. 
4) If both are same then print any of them and increment both i and j. 
5) Print remaining elements of the larger array.
*/
public class UnionSortedArrays {
    public static void main(String[] args){
        int arr1[]={12,28,28,29,29,30,30};
        int arr2[]={3, 4 ,5 ,28,28,28,28};
        ArrayList<Integer> a=new ArrayList<Integer>();
        a=findUnionimprove(arr1, arr2, 7, 7);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static ArrayList<Integer> findUnionimprove(int arr1[], int arr2[], int n, int m)
    {   int i=0, j=0;
        int z=-1;
        ArrayList<Integer> reslist=new ArrayList<Integer>();
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
                    else{
                        i++;
                        j++;
                    }
                }
            }
            else if(arr1[i]<arr2[j]){
                if(z==-1){
                    z++;
                    reslist.add(arr1[i]);
                }
                else{
                    int adj=reslist.get(z);
                    if(adj!=arr1[i]){
                        reslist.add(arr1[i]);
                        z++;
                    } 
                }
                i++;
            }
            else{
                if(z==-1){
                    z++;
                    reslist.add(arr2[j]);
                }
                else{
                    int adj=reslist.get(z);
                    if(adj!=arr2[j]){
                        reslist.add(arr2[j]);
                        z++;
                    } 
                }
                j++;
            }
        }
        if(i==n && j<m){
            for(int x=j;x<m;x++){
                int adj=reslist.get(z);
                    if(adj!=arr2[x]){
                        reslist.add(arr2[x]);
                        z++;
                    } 
            }
        }
        else if(i<n && j==m){
            for(int x=i;x<n;x++){
                 int adj=reslist.get(z);
                    if(adj!=arr1[x]){
                        reslist.add(arr1[x]);
                        z++;
                    } 
            }
        }
        return reslist;
}
     public static ArrayList<Integer> findUnionNew(int arr1[], int arr2[], int n, int m)
    {
        // handle duplicate in same array
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(arr1[0]);
        for(int i=1;i<n;i++){
            //creating new distinct elemnt array
            if(arr1[i]!=arr1[i-1]){
                a1.add(arr1[i]);
            }
            
        }
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(arr2[0]);
        for(int i=1;i<m;i++){
            //creating new distinct elemnt array
            if(arr2[i]!=arr2[i-1]){
                a2.add(arr2[i]);
            }
            
        }
        
       ArrayList<Integer> al=new ArrayList<Integer>();
        
        int j=0;
        int i=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)==a2.get(j)){
                al.add(a2.get(j));
                i++;
                j++;
            }
            else if(a1.get(i)<a2.get(j)){
                al.add(a1.get(i));
                i++;
                
            }
            else{
                al.add(a2.get(j));
                j++;
            }
        }
        
        if(i==a1.size() && j<a2.size()){
            for(int x=j;x<a2.size();x++){
                al.add(a2.get(x));
            }
        }
        else if(i<a1.size() && j==a2.size()){
            for(int x=i;x<a1.size();x++){
                al.add(a1.get(x));
            }
        }
       
        return al;
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // doesnt handle duplicate in same array
        ArrayList<Integer> al=new ArrayList<Integer>();
        int j=0;
        int i=0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                al.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                al.add(arr1[i]);
                i++;
                
            }
            else{
                al.add(arr2[j]);
                j++;
            }
        }
        
        if(i==n && j<m){
            for(int x=j;x<m;x++){
                al.add(arr2[x]);
            }
        }
        else if(i<n && j==m){
            for(int x=i;x<n;x++){
                al.add(arr1[x]);
            }
        }
       
        return al;
    }
    public static int linear_serach(ArrayList<Integer> al, int unknown){
        for(int i=0;i<al.size();i++){
            if(al.get(i)==unknown){
                return i;
            }
        }
        return -1;
    }
    /*
    2 8
12 42
3 4 5 28 37 42 43 46
    */
    
    
}
