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
public class MazePath {
    //steps can be taken:
    //1. horizontal
    //2.vertical
    public static ArrayList<String> mazepath(int cr, int cc, int er,int ec){
        if(cc==ec && cr==er){
            ArrayList<String> s=new ArrayList<String>();
            s.add("");
            return s;
        }
        ArrayList<String> myres=new ArrayList<String>();
        
        if(cc<ec && cr <=er){
            ArrayList<String> res=mazepath(cr,cc+1,er,ec);
            for(String ssres : res){
                myres.add("V"+ssres);
            }
        }
        if(cc<=ec && cr<er){
            ArrayList<String> res=mazepath(cr+1,cc,er,ec);
            for(String ssres : res){
                myres.add("H"+ssres);
            }
        }
        return myres;
    }
    //steps can be taken:
    //1. horizontal
    //2.vertical
    public static ArrayList<String> mazepathDiagonal(int cr, int cc, int er,int ec){
        if(cc==ec && cr==er){
            ArrayList<String> s=new ArrayList<String>();
            s.add("");
            return s;
        }
        ArrayList<String> myres=new ArrayList<String>();
        
        if(cc<ec && cr <=er){
            ArrayList<String> res=mazepathDiagonal(cr,cc+1,er,ec);
            for(String ssres : res){
                myres.add("V"+ssres);
            }
        }
        if(cc<=ec && cr<er){
            ArrayList<String> res=mazepathDiagonal(cr+1,cc,er,ec);
            for(String ssres : res){
                myres.add("H"+ssres);
            }
        }
        if(cc<ec && cr<er){
            ArrayList<String> res=mazepathDiagonal(cr+1,cc+1,er,ec);
            for(String ssres : res){
                myres.add("D"+ssres);
            }
        }
        return myres;
    }
    
    
    public static void main(String args[] ){
        //ArrayList<String> slist=mazepath(0,0,2,2);
        ArrayList<String> slist=mazepathDiagonal(0,0,2,2);
        System.out.println(slist.size());
        for(int i=0;i<slist.size();i++){
            System.out.println(slist.get(i));
        }
    }
    
}
