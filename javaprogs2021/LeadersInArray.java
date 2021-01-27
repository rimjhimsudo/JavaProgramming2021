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
public class LeadersInArray {
    //this is done in O(n)
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrL=new ArrayList<Integer>();
        arrL.add(arr[n-1]);
        int leader=arr[n-1];
        for(int i=n-2;i>=0;i--){
            boolean flag=false;
          //  int j=i-1;
            int k=arr[i];
            
                if(k>=leader){
                    flag=true;
                    leader=k;
                }
                
            
            if(flag==true){
                arrL.add(k);
            }
        }
        Collections.reverse(arrL);
        return arrL;
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrL=new ArrayList<Integer>();
        arrL.add(arr[n-1]);
        for(int i=n-1;i>0;i--){
            boolean flag=false;
            int j=i-1;
            int k=arr[j];
            while(j<n-1){
                if(k>=arr[++j]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                arrL.add(k);
            }
        }
        Collections.reverse(arrL);
        return arrL;
        
    }
    
    //correct
    
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrL=new ArrayList<Integer>();
        //arrL.add(arr[n-1]);
        for(int i=0;i<n;i++){
            boolean flag=false;
            //int j=i+1;
            int k=arr[i];
            int j=i;
            while(j<n-1){
                if(k>=arr[++j]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                arrL.add(k);
            }
        }
        arrL.add(arr[n-1]);
        //Collections.reverse(arrL);
        return arrL;
        
    }
    //correct
    
}
