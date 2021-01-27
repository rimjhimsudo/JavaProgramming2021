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
public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int power(int n, int raise){
        if(raise==1){
            return n;
        }
        return n* power(n,raise-1);
    }
    
    
    public static void main(String[] args){
       // System.out.print(factorial(5));
        System.out.print(power(2,10));
    }
}
