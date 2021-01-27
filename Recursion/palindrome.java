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
public class palindrome {
    
    public static boolean palin(String s, int i, int j){
        
        if(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
               return palin(s,i+1,j-1); 
            }
            
        }
            
        return true;
        
    }
    public static  void printNos(int N)
    {
        //Your code here
        if(N==0){
            return ;
        }
        printNos(N-1);
        System.out.print(N);
    }
    
    public static void main(String[] args){
        String s="max";
        boolean ans=palin(s,0,s.length()-1);
        System.out.println(ans);
        printNos(10);
    }
    
boolean isPalindrome(char str[], int s, int e) 
{ 
    // If there is only one character 
    if (s == e) 
        return true; 
  
    // If first and last 
    // characters do not match 
    if (str[s] != str[e]) 
        return false; 
  
    // If there are more than  
    // two characters, check if  
    // middle substring is also  
    // palindrome or not
    if (s < e) 
        return isPalindrome(str, s + 1, e - 1); 
  
    return true; 
}
}
