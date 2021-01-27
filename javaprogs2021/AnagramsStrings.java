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
public class AnagramsStrings {
    //correct
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char temparr[]=a.toCharArray();
        Arrays.sort(temparr);
        String sa=new String(temparr);
        
        char temparr1[]=b.toCharArray();
        Arrays.sort(temparr1);
        String sb=new String(temparr1);
        if(sa.compareTo(sb)==0){
            return true;
        }
        else{
            return false;
        }

        }
     public static void main(String[] args){
         
     }
    /*
     public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char temparr[]=a.toCharArray();
    Arrays.sort(temparr);
    String sa=new String(temparr);
    char temparr1[]=b.toCharArray();
    Arrays.sort(temparr);
    String sb=new String(temparr1);
    if(sa.compareTo(sb)==0){
        return true;
    }
    else{
        return false;
    }
        
    }
    */
    
}
