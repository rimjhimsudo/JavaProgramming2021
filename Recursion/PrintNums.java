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
public class PrintNums {
    public static void printrecurskip(int n){
        if(n==0)
            return;
        if(n%2!=0){
            System.out.println(n);   
        }
        printrecurskip(n-1);
        if(n%2==0){
            System.out.println(n);   
        }
    }
    public static void printrecur(int n){
        if(n==0)
            return;
        System.out.println(n);
        printrecur(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
       // printrecur(5);
       printrecurskip(5);
    }
}
