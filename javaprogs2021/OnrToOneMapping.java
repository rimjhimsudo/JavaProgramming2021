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
public class OnrToOneMapping {
    /*
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        //String r=new String();
        String r = String.valueOf(s2);
       // System.out.println(r);

         int i=0;
         while(i<s1.length()){
             String _q=Character.toString(s1.charAt(i));
             String _w=Character.toString(r.charAt(i));
         s1=s1.replaceAll(_q,_w);
       
        //int j=-1;
        while(i<s1.length()){
            if(s2.charAt(i)!=r.charAt(i)){
              //  j=i; 
                break;
            }
            i++;
        } 
        if()
       // i--;
        
        }
        // System.out.println(r);
        if(r.compareTo(s2)==0){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    */
    
    
    public static boolean areIsomorphic(String s1,String s2){
        char ary[]=new char[256];
        //boolean ary2[]=new boolean[256];
        char ary2[]=new char[256];
        int i=0;
        boolean flag=true;
        while(i<s1.length()){
            
            int valascii=s1.charAt(i);
            if(ary[valascii]==0 && ary2[(int)s2.charAt(i)]==0){
                //int b_valascii
                ary2[(int)s2.charAt(i)]=s1.charAt(i);
                ary[valascii]=s2.charAt(i);
                i++;
                
            }
            else if(ary2[(int)s2.charAt(i)]!=0){
                if(ary2[(int)s2.charAt(i)]==valascii){
                    i++;
                }
                else{
                    flag=false;
                    break;
                }
            }
            
            else
            {
            if(ary[valascii]==s2.charAt(i)){
                    i++;
                }
                else{
                    flag=false;
                    break;
                }        
            }    
       }
        return flag;
    }

    public static void main(String[] args){
        /*char ary[]=new char[256];
        for (char c:ary) {
        System.out.println(c);
        }
        */
        String s="aqwery";
        System.out.println((int)s.charAt(0));
       boolean c=areIsomorphic("pijthbsfy","fvladzpbf");
       System.out.println(c);
    }
    
}

/*
char ary[]=new char[256];
        int i=0;
        boolean flag=true;
        while(i<s1.length()){
            int valascii=s1.charAt(i);
            if(ary[valascii]==0){
                ary[valascii]=s2.charAt(i);
                i++;
            }
            else{
                if(ary[valascii]==s2.charAt(i)){
                    i++;
                }
                else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
        
*/
