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
public class BinaryTree {
    class Btnode<T>{
    T data;
    Btnode left;
    Btnode right;
    Btnode(T d){
         data=d;
         left=null;
         right=null;
    }
    }
    
    public Btnode root=null;
    int size=0;
    
    public Btnode<Integer> takeInputDepthWise(Scanner s){
        System.out.println("enter root data");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        Btnode<Integer> root=new Btnode<Integer>(rootdata);
        root.left=takeInputDepthWise(s);
        root.right=takeInputDepthWise(s);
        return root;
    }
    public void printDepthWise(Btnode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ "-> ");
        if(root.left!=null){
           System.out.print(root.left.data+ " "); 
        }
        if(root.right!=null){
            System.out.print(root.right.data);
        }
        System.out.println();
        printDepthWise(root.left);
        printDepthWise(root.right);
        
    } 
    public Btnode<Integer> takeInputLevelWise(){
        Scanner s=new Scanner(System.in);
        Queue<Btnode> pendingNodes=new LinkedList<Btnode>();
        System.out.println("enter root data");
        int rootdata=s.nextInt();
        Btnode root=new Btnode<Integer>(rootdata);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            Btnode currnode=pendingNodes.remove();
            System.out.println("enter left data");
            int ldata=s.nextInt();
            if(ldata!=-1){
             Btnode left=new Btnode<Integer>(ldata);   
             pendingNodes.add(left);
             currnode.left=left;
             
            }
            System.out.println("enter right data");
            int rdata=s.nextInt();
            if(rdata!=-1){
             Btnode right=new Btnode<Integer>(rdata);   
             pendingNodes.add(right);
             currnode.right=right;
            }
        }
        return root;
    }
    public void printLevelWise(Btnode root){
        Queue<Btnode> q=new LinkedList<Btnode>();
        q.add(root);
       // System.out.println(root.data);
        while(!q.isEmpty()){
            Btnode curr=q.remove();
             System.out.println(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
       // Btnode<Integer> rootnode=tree.takeInputDepthWise(s);
        //System.out.println(n.data);
        //tree.printDepthWise(rootnode);

        Btnode<Integer> rootnode=tree.takeInputLevelWise();
        tree.printLevelWise(rootnode);
    }
    
    
}
    
