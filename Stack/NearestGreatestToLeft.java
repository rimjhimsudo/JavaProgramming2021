/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class NearestGreatestToLeft {
    public int[] Ngl(int arr[]){
        Stack<Integer> s=new Stack<Integer>();
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int element=arr[i];
            if(s.empty()){
                res[i]=-1;
                s.push(element);
            }
            else{
                if(s.peek()>element){
                    res[i]=s.peek();
                    s.push(element);
                }
                else{
                    while(!s.empty() && s.peek()<=element){
                        s.pop();
                    }
                    if(s.empty()){
                        res[i]=-1;
                    }
                    else{
                        res[i]=s.peek();
                    }
                    s.push(element);
                }
            }
        }
        return res;
    }
}
