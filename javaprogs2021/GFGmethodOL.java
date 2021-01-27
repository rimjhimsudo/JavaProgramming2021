/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

/**
 *
 * @author lenovo
 */
import java.io.*; 
   
class Addition{ 
       
    // adding two integer values. 
    public float add(int a, float b){ 
           
        float sum = a+b; 
        return sum; 
    } 
       
    // adding three integer values. 
    public float add(float a, int b){ 
           
        float sum = a+b; 
        return sum; 
    } 
       
} 
   
class GFGmethodOL { 
    public static void main (String[] args) { 
           
        Addition ob = new Addition(); 
           
        float sum1 = ob.add(1,2.0f); 
        System.out.println("sum of the two integer value :" + sum1); 
        float sum2 = ob.add(1.0f,2); 
        System.out.println("sum of the three integer value :" + sum2); 
           
    } 
}
