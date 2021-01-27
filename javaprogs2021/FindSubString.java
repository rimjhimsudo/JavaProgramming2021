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
public class FindSubString {
    public static void main(String[] args){
            int k=-1;
            boolean flag=false;
            String s=new String("Rimjhim");
            String f=new String("jhim");
            int i=0;
            while(i<s.length()){
                int j=0;
                if(s.charAt(i)==f.charAt(j)){
                    k=i;
                    i++;
                    j++;
                    while(j<f.length()){
                        if(s.charAt(i)==f.charAt(j)){
                            flag=true;
                            i++;
                            j++;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }
                    
                }
                else{
                    i++;
                }
                if(flag==true){
                        System.out.println(k);
                    }
            }
        }
    
}
