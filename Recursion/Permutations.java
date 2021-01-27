/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Permutations {
    
    public static ArrayList<String> perm(String str){
        if(str.length()<=0){
            ArrayList<String> alist=new ArrayList<String>(); 
            alist.add("");
            return alist;
        }
        String z=str.substring(0,1);
        ArrayList<String> list=perm(str.substring(1,str.length()));
        //after call work when list returns from base case and so on to upper call
        ArrayList<String> templist=new ArrayList<String>();
        //templist.addAll(list);
        //concat z with all string returned in list variable
        for(String bs : list){
            for(int i=0;i<=bs.length();i++){
                String s= bs.substring(0,i) + z + bs.substring(i,bs.length());
                templist.add(s);
            }
        }
        
        return templist;
    } 
    public static void main(String args[] ){
        String s=new String("abc");
        System.out.println(s.length());
        //String s1=s.split(s, 1);
        ArrayList<String> slist=perm(s);
        for(int i=0;i<slist.size();i++){
            System.out.println(slist.get(i));
        }
    }
    
}
