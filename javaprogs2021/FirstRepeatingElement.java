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
import java.util.*;
public class FirstRepeatingElement {
    public static void main(String args[]){
        int final_ele=Integer.MAX_VALUE;
        int n = 7;
        int array[] = {1, 5, 30, 4, 3, 5, 3};
        
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arrlist.add(-1);
        }
        
        for(int i=0;i<n;i++){
            arrlist.set(array[i],0);
        }
        
        for(int i=0;i<n;i++){
            if(arrlist.get(array[i])==0){
                int val=1+arrlist.get(array[i]);
               arrlist.set(array[i],val);
           }
          
       }
    int i=0;
    int val=0;
    int repeating_ele;
    while(i<n){
        if(arrlist.get(i)>0){
            repeating_ele=i;
            for(int j=0;j<n;j++){
                if(repeating_ele==array[j]){
                    if(repeating_ele<final_ele){
                        final_ele=repeating_ele;
                    }
                    break;
                }
            }
        }
        i++;
    }
    
    for(int k=0;k<n;k++){
     System.out.println(arrlist.get(k));
    }
    System.out.println("K : " + (1+final_ele));
    
        /*
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
             arr.add(array[i]);
         }
         ArrayList<Integer> arrl=new ArrayList<Integer>(n);
         for(int i=0;i<n;i++){
             arrl.add(0);
         }
        for(int i=0;i<n;i++){
            int val=arr.get(i);
            if(arrl.size()!=0 && arrl.get(val)!=0 ){
                arrl.set(val,arrl.get(val)+1);
            }
            else{
                arrl.set(val,1);    
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arrl.get(i)>max){
                max=arr.get(i);
            }
            if(arrl.get(i)==max){
                int maxi=arrl.get(i);
            }
        }
        for(int i=0;i<arrl.size();i++){
             System.out.println(arrl.get(i));
        }
        System.out.println("max : "+arrl.indexOf(Collections.max(arrl)));
        System.out.println(arr.indexOf(arrl.indexOf(Collections.max(arrl))));
    
*/
    }
    
}
}
