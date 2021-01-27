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
import java.util.Arrays;
public class MaxOccurInstring {
    
    public static void main(String[] args){
        int v='Z';
        System.out.println(v);
        String n=new String("!-09854@geeksforr");
        char temparr[]=n.toCharArray();
        Arrays.sort(temparr);
        String s=new String(temparr);
        System.out.println(s);
        int i=0;
        int count=0;
        int max_count=0;
        char alph='a';
        char max_alph='a';
        while(i<s.length()-1){
            count=0;
            if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                boolean flag=true;
                while(i<s.length()-1){
                    if(s.charAt(i)==s.charAt(i+1)){
                       count++;
                       alph=s.charAt(i);
                       if(count>max_count){
                            max_count=count;
                            max_alph=alph;
                           // System.out.println(max_alph);
                        }
                       i++;
                    }
                    else{
                        i++;
                        break;
                    }
                }
            }
            else{
                i++;
             }
           }
       
        System.out.println(max_alph);
        
    }
    //not complete
    
}
