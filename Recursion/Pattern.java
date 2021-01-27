/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author lenovo
 */
public class Pattern {
    
    public static void pattern(int n, int r, int c){
        
        if(n==0){
            return ;
        }
        for(int i=0;i<c;i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1,r+1, c+1);
    }
    public static void main(String args[] ){
        pattern2(5,1,1);
    }
    public static void pattern2(int n, int r, int c){
        if(r>n){
            return;
        }
        if(c>r){
         System.out.println();
         pattern2(n,r+1,1);
         return; //this return; is important because when it will print anf keep calling function agan and again and when
         //it reaches base case of(r>n) then it will come to this line 35 so now to end proggram we need t return from 
         //here too i.e.why return is importnt.
        }
        System.out.print("* ");
        pattern2(n,r,c+1);
    }
}
