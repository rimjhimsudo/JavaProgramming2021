/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static javaprogs2021.Matrix.Addition.sumMatrix;

/**
 *
 * @author lenovo
 */
public class Spiral {
    static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {   ArrayList<Integer> arlist=new ArrayList<Integer>();
        int i_start=0, i_end=r-1, j_start=0, j_end=c-1;
        int count=0; //r*c count of elelments
        while(count< r*c){
            //loop 1 for horizontal upar se rows ka traversal
            for(int j=j_start; j<=j_end;j++){
                arlist.add(m[i_start][j]);
                count++;
                if(count ==r*c){
                    break;
                }
            }
            //loop 2
            for(int i=i_start+1;i<=i_end;i++){
                arlist.add(m[i][j_end]);
                count++;
                if(count ==r*c){
                    break;
                }
            }
            //loop3
            for(int k=j_end-1;k>=j_start;k--){
                arlist.add(m[i_end][k]);
                count++;
                if(count ==r*c){
                    break;
                }
            }
            //loop4
            for(int l=i_end-1;l>i_start;l--){
                arlist.add(m[l][i_start]);
                count++;
                if(count +1==r*c){
                    break;
                }
            }
            i_start++;
            i_end--;
            j_start++;
            j_end--;
            
        }
        //System.out.print(count +"c");
        return arlist;
        
    }
    
     public static void main(String[] args){
        int a1[][]={{1,2,3,4,20},{5,6,7,8,30},{9,10,11,12,40},{13,14,15,16,50},{91,92,93,94,95}};
        int a[][]={{5,11,30},{5,19,19}};
        ArrayList<Integer> al=spirallyTraverse(a,2,3);
        for(int j=0; j<al.size();j++){
            System.out.print(al.get(j) + " ");
        }
    
    }
    
}
