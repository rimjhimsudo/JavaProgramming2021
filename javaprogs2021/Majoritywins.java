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
public class Majoritywins {
    public static void main(String args[]){
        int x=4;
        int y=5;
        int x_index=0;
        int y_index=0;
        int n=11;
        int arr[]={1,1,2,2,3,3,4,4,4,4,5};
    
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                x_index=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==y){
                y_index=i;
                break;
            }
        }
        System.out.println("x :"+x_index+" y : "+y_index);
        int count_x=0;
        int count_y=0;
        while(x_index<n){
            if(arr[x_index]==x){
                count_x++;
            }
            x_index++;
        }
        while(y_index<n){
            if(arr[y_index]==y){
                count_y++;
            }
            y_index++;
        }
        if(count_x>count_y){
            System.out.println(x);
        }
        else if(count_x==count_y){
            int ans= ((x>y)? x:y);
            System.out.println(ans);            //max = (n1 > n2) ? n1 : n2;
        }
        else{
            System.out.println(y);
        }
        }
    
}
