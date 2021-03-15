/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.*;

/**
 *
 * @author lenovo
 */
class Spiral
{
    class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
         data=d;
         left=null;
         right=null;
    }
    }
      ArrayList<Integer> findSpiral(Node root) 
      {
           ArrayList<Integer> list=new  ArrayList<Integer>();
           if(root==null){
               //list.add(null);
               return list;
           }
           if(root.right==null && root.left==null){
               list.add(root.data);
               return list;
           }
           //list.add(root.data);
           Stack<Node> s1=new Stack<Node>();
           Stack<Node> s2=new Stack<Node>();
           s1.push(root);
           boolean val=true; //when true then left se print karao
           
           while(!s1.empty()){
               while(!s1.empty()){
                   Node temp=s1.pop();
                   list.add(temp.data);
                   if(val){
                      if(temp.right!=null){
                        s2.push(temp.right);
                      }
                      if(temp.left!=null){
                        s2.push(temp.left);
                      }
                   }
                   else{
                       if(temp.left!=null){
                         s2.push(temp.left);
                       }
                       if(temp.right!=null){
                         s2.push(temp.right);
                       }
                   }
               }
               Stack<Node> s=s1;
               s1=s2;
               s2=s;
              
               val=!val;
           }
           
           return list;
      }
}
