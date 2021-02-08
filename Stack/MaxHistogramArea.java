/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.util.Stack;
/**
 *
 * @author lenovo
 */
public class MAH{
    public static void main(String args[]){
        Solution s=new Solution();
        System.out.println();
    }
}
class Solution{
    /*
    approach :
    1.fill array1 with nearest smallest elemnt to left for each value 
    2.fill array1 with nearest smallest elemnt to right for each value
    3.multiply current value with the span value and span=nearestSmalltoRight[i]-nearestSmalltoLeft[i]-1;
    for each histogram bar then find area corresponding each other and print max.
    */
   public  static long getMaxArea(long hist[], long n)  {
        // your code here
        Long l= new Long(n);
        int size=l.intValue();
        //int size=Integer.parseInt(n);
        int[] nearestSmalltoRight=new int[size];
        //System.out.println("l"+n+"   s"+size);
        nearestSmalltoRight=NearestSmallestRight(hist);
        /*for(int j=0;j<size;j++){
            System.out.print(nearestSmalltoRight[j]+" ");
        }*/
       // System.out.println();
        int nearestSmalltoLeft[]=new int[size];
        nearestSmalltoLeft=NearestSmallestLeft(hist);
        /*for(int j=0;j<size;j++){
           System.out.print(nearestSmalltoLeft[j]+" ");
        }*/
        long maxArea=0L;
        long span=0L;
        for(int i=0;i<n;i++){
            span=nearestSmalltoRight[i]-nearestSmalltoLeft[i]-1;
            long area=span*hist[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;            
    }
     public static int[] NearestSmallestRight(long arr[]){
        Stack<Pair<Long,Integer>> s=new Stack<Pair<Long,Integer>>();
        long n=arr.length;
        int[] res=new int[(int)n];
        for(int i=(int)n-1;i>=0;i--){
            long element=arr[i];
            if(s.empty()){
                res[i]=(int)n;
            }
            else{
                if((long)s.peek().first<element){
                    res[i]=(int)s.peek().second;
                }
                else{
                    while(!s.empty() && (long)s.peek().first>=element){
                        s.pop();
                    }
                    if(s.empty()){
                        res[i]=(int)n;
                    }
                    else{
                        res[i]=(int)s.peek().second;
                    }
                }
            }
           Pair<Long,Integer> p=new Pair<Long,Integer>(element,i);
           s.push(p); 
        }
        
        return res;
    }
    public static int[] NearestSmallestLeft(long arr[]){
        Stack<Pair<Long,Integer>> s=new Stack<Pair<Long,Integer>>();
        long n=arr.length;
        int[] res=new int[(int)n];
        for(int i=0;i<(int)n;i++){
            long element=arr[i];
            if(s.empty()){
                res[i]=-1;
            }
            else{
                if(s.peek().first<element){
                    res[i]=s.peek().second;
                }
                else{
                    while(!s.empty() && s.peek().first>=element){
                        s.pop();
                    }
                    if(s.empty()){
                        res[i]=-1;
                    }
                    else{
                        res[i]=s.peek().second;
                    }
                }
            }
            Pair<Long,Integer> p=new Pair<Long,Integer>(element,i);
            s.push(p);
        }
        return res;
    }
        
}
class Pair<U, V>
{
   
    public  U first;       // first field of a Pair
    public  V second;      // second field of a Pair
 
    // Constructs a new Pair with specified values
    public Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        // calls private constructor
        return new Pair<>(a, b);
    }
    
}