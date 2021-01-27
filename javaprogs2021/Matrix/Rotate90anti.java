/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021.Matrix;

/**
 *
 * @author lenovo
 */
public class Rotate90anti {
    
     public static void main(String[] args){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r=4, col=4;
        int b[][]=new int[r][col];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int k=col-1;
        for(int i=0;i<r;i++){
            int z=0;
            for(int j=0;j<col;j++){
                b[i][j]=a[j][k];
            }
            k--;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
