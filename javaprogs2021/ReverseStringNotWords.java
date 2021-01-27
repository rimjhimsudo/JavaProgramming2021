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
public class ReverseStringNotWords {
    /*
      char temparr[]=s.toCharArray();
    //Arrays.sort(temparr);
    //String sa=new String(temparr);
    char temparr2[]=new char[s.length()];
    int i=s.length()-1;
    int j=0;
    while(i>=0){
        char c=s.charAt(i);
        temparr2[j]=c;
        i--;
        j++;
    }
    String sa=new String(temparr2);
    return sa;
    */
     public static String reverseWords(String s) {
        // code here 
        if(!s.contains(".")){
            return s;
        }
        if(s.length()==1){
            return s;
        }
        char arr[]=s.toCharArray(); //original
        int z=0;
        while(s.charAt(z)!='.'&& z<s.length()){
            z++;
        }
        //Arrays.sort(temparr);
        //String sa=new String(temparr);
        char arr2[]=new char[s.length()];
        int i=s.length()-1;
        int j=0;

        while(i>=0){
            char c=s.charAt(i);
            arr2[j]=c;
            i--;
            j++;
        }
        String fs=new String(arr2);
        //System.out.println(fs);
        int k=0;
        int start=-1, end=-1;
        //int dot=-1;
        while(k<arr2.length){
            if(arr2[k]!='.'){
                start=k;
                end=start;
                k++;
                while(k<arr2.length && arr2[k]!='.'){
                 end++;
                 k++;
                }
                while(start<end){
                    char f=arr2[start];
                    arr2[start]=arr2[end];
                    arr2[end]=f;
                    start++;
                    end--;
                }
            }
            else if(k==(arr.length-z)){
                while(k<arr.length){
                    start=k;
                    end=arr.length-1;
                    while(start<end){
                    char f=arr2[start];
                    arr2[start]=arr2[end];
                    arr2[end]=f;
                    start++;
                    end--;
                }
                }
                break;
            }
            else{
                k++;
                
            }
        }
        String sa=new String(arr2);
        return sa;
    }
    public static void main(String[] args){
        String s1="rimjhim.like.this";
        String s="...hello...rim.c.";
        System.out.println(s1);
        char temparr[]=s.toCharArray();
        String snew=reverseWords(s1);
        System.out.println(snew);
        
    }
    /*
    StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
    */
    
    
}
