/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author lenovo
 */
import java.util.*;
class Solution {
    
    public String reverse(String S){
        /*
        approach : 
        1. calculate string length 
        2. make character stack
        3.push from i==0 to i<n all elemnt to stack
        now access stack top (which is last elemnt ) and strore in new array
        4.reversed since stack is last in first out based 
        */
        int str_len=S.length();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str_len;i++){
            s.push(S.charAt(i));
        }
        String s_new=new String();
        for(int i=0;i<str_len;i++){
          char c= s.pop();
          s_new+=c;
        }
        return s_new;
        
        
        
    }

}
public class ReverseStack {
    public static void main(String args[]){
        Solution s=new Solution();
        System.out.println(s.reverse("helloStacks"));
    }
}
