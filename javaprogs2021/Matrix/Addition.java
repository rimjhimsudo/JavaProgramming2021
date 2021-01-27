/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021.Matrix;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author lenovo
 */
public class Addition {
    static int[][] sumMatrix(int a[][], int b[][])
    {
       // code here
       //
       
       int rowa=a.length;
       int cola=0;
       int colb=0;
       if(rowa>0){
           cola=a[0].length;
       }
       int rowb=b.length;
       if(rowb>0){
          colb=b[0].length;
        }

       if(rowa==rowb && cola==colb){
           int[][] r=new int[rowa][cola];
           for(int i=0;i<rowa;i++){
              for(int j=0;j<cola;j++){
                r[i][j]=a[i][j]+b[i][j];
                
              }
           
               
           }
           return r;
       }
       else{
           int empty[][]={};
           return empty;
       }
       
    }
    public static void main(String[] args){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sumMatrix(a,a);
        Integer b[]=new Integer[4];
        int max = Collections.max(Arrays.asList(b));
        
    
    }
    
    
    /*
    static int[][] sumMatrix(int a[][], int b[][])
    {
       // code here
       int[][] r=new int[][];
       
       
       
    }
    */
    
}
