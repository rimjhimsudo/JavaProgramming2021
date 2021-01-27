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
public class Subsequences {
    public static ArrayList<String> subsequences(String str){
        if(str.length()<=0){
            ArrayList<String> alist=new ArrayList<String>(); 
            alist.add("");
            return alist;
        }
        String z=str.substring(0,1);
        ArrayList<String> list=subsequences(str.substring(1,str.length()));
        //after call work when list returns from base case and so on o upper call
        ArrayList<String> templist=new ArrayList<String>();
        templist.addAll(list);
        //concat z with all string returned in list variable
        int i=0;
        while(i<list.size()){
            String temp=z.concat(list.get(i));
            templist.add(temp);
            i++;
        }
        
        return templist;
    } 
    public static void main(String args[] ){
        String s=new String("");
        System.out.println(s.length());
        //ArrayList<String> slist=new ArrayList<String>();
       /* slist.add("");
        "z".concat(slist.get(0));
        System.out.println("z".concat(slist.get(0)));
        */
       ArrayList<String> slist=subsequences(s);
        for(int i=0;i<slist.size();i++){
            System.out.println(slist.get(i));
        }
        
       // System.out.println(s.substring(1,s.length())); ///outputs ntg but no error
    }
    
}
