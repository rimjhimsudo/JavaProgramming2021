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
public class Pangram {
    public static void main(String[] args){
     int arr[] =new int[26];
     for(int z=1;z<26;z++){
       // System.out.println(i);
        arr[z]=0;
        
     }
     String s=new String("qwertopasdfghjklzxcvbn");
     int i=0;
     while(i<s.length()){
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
         int x=s.charAt(i);
         System.out.println(x-97);
         arr[x-97]=1;
        }
        else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
            int x=s.charAt(i);
            arr[x+32-97]=1;
        }
        i++;
        
     }
     for(int k=0;k<26;k++){
       System.out.println(arr[k]);
       // arr[i]=0;
        
     }
     String s_new=new String();
     
     for(int j=0;j<26;j++){
       // System.out.println(i);
        if(arr[j]<1){
            //char c=(char)(j;
            String c=Character.toString((char)(j+97));
            System.out.println("c"+c);
            s_new+=c;
        }
        }
     System.out.println(s_new);
    }
   
    /*public static void main(String[] args){
     int arr[] =new int[26];
     for(int i=95;i<=122;i++){
       // System.out.println(i);
        arr[i]=0;
        
     }
     String s=new String("hjdsfe76r78248912yeuiqwdjawvs82638");
     int i=0;
     while(i<s.length()){
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
         int x=s.charAt(i);
         arr[x]=1;
        }
        else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
            int x=s.charAt(i);
            arr[x+32]=1;
        }
        i++;
        
     }
     for(int k=95;k<=122;i++){
       System.out.println(arr[k]);
       // arr[i]=0;
        
     }
     String s_new=new String();
     
     for(int j=95;j<=122;j++){
       // System.out.println(i);
        if(arr[j]<1){
            String c=Character.toString((char)j);
            s_new+=c;
        }
        }
     System.out.println(s_new);
    }
*/
    
}
