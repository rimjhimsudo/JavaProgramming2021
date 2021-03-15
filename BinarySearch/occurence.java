/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author lenovo
 */
import java.util.*;
class occurence {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n;
		int x;
		int arr[];
		while(t>0){
		    if(s.hasNextInt()){
    		    n=s.nextInt();
    		    x=s.nextInt();
    		    arr=new int[n];
    		    for(int i=0;i<n;i++){
    		        arr[i]=s.nextInt();
    		    }
		        int first=binaryfirst(arr,x);
    		    int last=binarylast(arr,x);
    		    System.out.print(first +" "+ last);
    		    System.out.println();
		    }
		    
		    
		    
		}
	}
	public static int binaryfirst(int arr[],int x){
	    
	    int s=0;
	    int end=arr.length-1;
	    int ifirst=-1;
	    while(s<=end){
	        int mid=s + (end-s)/2;
	        if(arr[mid]==x){
	           ifirst=mid; 
	           end=mid-1;
	        }
	        else if(x<arr[mid]){
	            end=mid-1;
	        } 
	        else{
	            s=mid+1;
	        }
	        
	    }
	    return ifirst;
	}
	public static int binarylast(int arr[],int x){
	    
	    int s=0;
	    int end=arr.length-1;
	    int ilast=-1;
	    while(s<=end){
	        int mid=s + (end-s)/2;
	        if(arr[mid]==x){
	           ilast=mid; 
	           s=mid+1;
	        }
	        else if(x<arr[mid]){
	            end=mid-1;
	        } 
	        else{
	            s=mid+1;
	        }
	        
	    }
	    return ilast;
	}
}