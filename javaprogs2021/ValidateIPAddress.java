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
public class ValidateIPAddress {
     public static boolean isValid(String s) {
        /* if(s=="0.0.0.0"){
             return true;
         }
        */
        // Write your code here
        if(s.length()<7 || s.length()>15){
            return false;
        }
        int j=0;
        int i=0;
        boolean flag=true;
        boolean isNum=false;
        int count=0;
        while(i<4 && j<s.length()){
            if(s.charAt(j)=='.'){
                j++;
            }
            String num=new String();
            while(j<s.length() && s.charAt(j)!='.'){
                num+=s.charAt(j);
                j++;
            }
            if(i==3){
                while(j<s.length()){
                    num+=s.charAt(i);
                    j++;
                }
            }
         // System.out.println(num);
         
         if(num.length()>1 && num.charAt(0)=='0' ){
             return false;
         }
         
         for (int z=0; z < num.length(); z++)
         {
            char c = num.charAt(z);
            
            if (c < '0' || c > '9') {
                isNum= false;
                break;
            }
            else{
                isNum=true;
            }
        }
         int val=-1;
            if(isNum){
                 val=Integer.parseInt(num);}
                 
            else{
                flag=false;
                break;
            }
            //System.out.println(val);
            if(val>=0 && val<=255){
               // System.out.println("val"+val);
                i++;
                count++;
            }
            else{
                flag=false;
               // System.out.println("flag"+flag);
                break;
            }
            //System.out.println("count"+count);
            //System.out.println("i"+i);
        }
        i--;
        if(i==3 && flag==true && count==4){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args){
        char c='.';
         int x=c;
        // System.out.println(x);
         boolean d=isValid("........");
         System.out.println(d);        
     }
    
}
