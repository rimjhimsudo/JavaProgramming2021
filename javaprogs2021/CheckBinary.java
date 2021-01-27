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
public class CheckBinary {
    static boolean isBinary(String str)
	{
	  //Your code here
	  int i=0;
	  while(i<(str.length()-1)){
	      if(str.charAt(i)!='0' && str.charAt(i)!='1'){
	          return false;
	      }
	      i++;
	     
	  }
	   return true;
	}
    
    public static void main(String[] args)
    {
        boolean ans=isBinary("101");
        System.out.println(ans);
    }
    
}
