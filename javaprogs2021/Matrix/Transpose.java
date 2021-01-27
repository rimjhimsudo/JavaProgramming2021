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
public class Transpose {
    
    public static void main(String[] args){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r=4, col=4;
        //print
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        
        //logic of TRANSPOSE
        for(int i=0;i<r;i++){
            for(int j=col-1;j>=i;j--){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        //logic of swap last row with first and so on in middle
        int k=col-1;
        for(int i=0;i<r/2;i++){
            
            for(int j=0;j<col;j++){
                int temp=a[i][j];
                a[i][j]=a[k][j];
                a[k][j]=temp;
            }
            k--;
        }
        
        
        //print changed rotated anti 90 clockwise matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}
