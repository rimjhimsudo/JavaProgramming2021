/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import static Recursion.FindXarray.recurX;

/**
 *
 * @author lenovo
 */
public class ArraySorted {
    
    public static boolean sorted(int arr[], int si){
       
       if(si==arr.length-1){
           return true;
       }
       if(arr[si]>arr[si+1]){
           return false;
       }
       else{
           boolean restArrayans=sorted(arr,si+1);
           return restArrayans;
       }
        
    }
    public static int findXFirst(int arr[], int si,int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            int ans=findXFirst(arr,si+1,data);
            return ans;
        }
    }
    public static int findXLast(int arr[], int si,int data){
        //APPROACH 1 : IIN THIS APPROACH , WE ARE STORING ANS IN EACH FUNCTION CALL LOCALLY FOR THAT FUNCTION FRAME BUILD ON STACK AND WHEN REURNING WE ARE COMAPRING WHICH TO STORE AND RETRUN BACK MORE TO HE FUNCTION ALL FROM WHICH IT IS CALLED
        
        int ansLocal=-1;
        if(si==arr.length){
           return ansLocal;     
        }
        if(arr[si]==data){
            ansLocal=si;
        }
        int ans=findXLast(arr,si+1,data);
        if(ans>ansLocal){
            return ans;
        }
        else{
            return ansLocal;
        }
    }
    public static int findXLast2(int arr[], int si,int data){
        //APPROACH : IN THIS WE FIRST GO TO LAST BY CSLLING ECURSION FIRST WHICH BUULD STACK THEN WHEN WE REACH LAST WE START COMPARING AND RETURN AS SOONN AS WE FIND THE INDEX FIRSTLY FROM LAST.
        if(si==arr.length){
           return -1;       
        }
        
        int i=findXLast(arr,si+1,data);
        if(i==-1){
            if(arr[si]==data){
                return si;
            }
            else{
            return -1;
            }
        }
        else{
            return i;
        }
        
    }
    public static int[] findXAllIndices(int arr[], int si,int data,int count){
        //MY APPROACH
        //count will help to define index of array in which we gave to return indices
        int res[];
        int c=count;
        if(si==arr.length){
           res=new int[c];
           return res;
        }
        if(arr[si]==data){
            c++;
        }
        res=findXAllIndices(arr,si+1,data, c);
        if(arr[si]==data){
            res[c-1]=si;
        }
        return res;
    }
    public static int[] findXAllIndices2(int arr[], int si,int data,int count){
        //count will help to define index of array in which we gave to return indices
        //CODING BLOCK APPROACH
        
       // int c=count;
        if(si==arr.length){
           int base[]=new int[count];
           return base;
        }
        int res[]=null;
        if(arr[si]==data){
            res=findXAllIndices(arr,si+1,data,count+1);  
        }
        else{
            res=findXAllIndices(arr,si+1,data,count); 
        }
        if(arr[si]==data){
            res[count]=si;
        }
        return res;
        
       // return res;
    }
   public static void main(String[] args){
        int arr[]={0,2,3,0,9,0};
        //boolean ans=sorted(arr,0);
        //int ans=findXLast(arr,0,10);
        //int ans=findXLast2(arr,0,10);
        //System.out.println(ans);

        int ans[]=findXAllIndices2(arr,0,0,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    
}
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String args[] ) throws Exception {
        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
       // System.out.println(codeHere(inputData));
       codeHere(inputData);
    }
    public static void codeHere(String inputData) {
        // Use this function to write your solution;
        char arr[]=inputData.toCharArray();
        int len=arr.length;
        //System.out.println(len);
        ArrayList<Integer> alist=new ArrayList<Integer>();
        String n="";
        int i=0;
        while(i<len){
            //int n;
            while(arr[i]!='\n'){
                n+=arr[i];
                i++;
            }
            int num=Integer.parseInt(n);
            alist.add(num);
            i++;
        }
        //System.out.println(alist.get(0));
         ArrayList<Integer> alist=new ArrayList<Integer>();
        int j=0;
        while(j<alist.size()){
            if()
        }

        //return inputData;
    }
}
*/


/*
//q3
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String args[] ) throws Exception {
        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }
    public static String codeHere(String inputData) {
        String longs=inputData;
        String l="";
        int i=0;
        while(longs.charAt(i)!='\0'){
            l+=longs.charAt(i);
            i++;
        }

        //if(longs.contains())
        // Use this function to write your solution;
        return l;
    }
}
*/
