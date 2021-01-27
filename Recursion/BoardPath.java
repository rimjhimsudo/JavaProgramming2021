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
public class BoardPath {
    public static ArrayList<String> boardpath(int cur, int end){
        if(cur==end){
            ArrayList<String> s=new ArrayList<String>();
            s.add("");
            return s;
        }
        if(cur>end){
            ArrayList<String> s=new ArrayList<String>();
            return s;
        }
        ArrayList<String> myres=new ArrayList<String>(); //create your own result
        for(int dice=1;dice<=6;dice++){
            ArrayList<String> res=boardpath(cur+dice,end);
            for(String rrs: res){
                myres.add(dice+rrs);
            }
            
        }
        return myres;
    }
    public static void main(String args[] ){
        ArrayList<String> slist=boardpath(0,10);
        System.out.println(slist.size());
        for(int i=0;i<slist.size();i++){
            System.out.println(slist.get(i));
        }
    }
    
}
