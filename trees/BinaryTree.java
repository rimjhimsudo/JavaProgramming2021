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
             System.out.print(curr.data +" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public int height(Btnode root){
        if(root==null){
            return 0;
        }
        if(root.left==null  && root.right==null){
            return 1;
        }
        return  1+ Math.max( height(root.left),height(root.right));
    }
    // Method to print preorder traversal
    void printPreorder(Btnode node)
    {
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        printPreorder(node.left);
        printPreorder(node.right);
        return;
    }
    void printPostorder(Btnode node)
    {   if(node==null){
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data+" ");
        return;
        
    }
    void printInorder(Btnode node){
        if(node==null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
        return;
    }
    public ArrayList<Integer> inorderIterative(Btnode node){
        Stack<Btnode> s=new Stack<Btnode>();
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }
            else{
                if(!s.empty()){
                    node =s.pop();
                    list.add((Integer) node.data);
                    node=node.right;
                }
                else{
                    break;
                }
            }
        }
        return list;
    }
    public int SumofLeafNodes(Btnode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return (int) root.data;
        }
        return SumofLeafNodes(root.left) + SumofLeafNodes(root.right);
    }
    
    public int diameter(Btnode root){
        if(root==null){
            return 0;
        }
        int casewithRoot= height(root.left)+ height(root.right)+1;
        int caseLeft=diameter(root.left);
        int caseRight=diameter(root.right);
        return Math.max(casewithRoot ,Math.max(caseLeft,caseRight));
        
    }
    ArrayList<Integer> rightView(Btnode root) {
        //add code here.
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<Btnode> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                //this makes 1 level
                Btnode temp=q.poll();
                if(i==n){
                    list.add((Integer) temp.data);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return list;
    }
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
       // Btnode<Integer> rootnode=tree.takeInputDepthWise(s);
        //System.out.println(n.data);
        //tree.printDepthWise(rootnode);

        Btnode<Integer> rootnode=tree.takeInputLevelWise();
        //tree.printPreorder(rootnode);
        //System.out.println();
        //tree.printInorder(rootnode);
        System.out.println();
        //tree.printPostorder(rootnode);
        //tree.printLevelWise(rootnode);
        int height=tree.height(rootnode);
        System.out.println("h"+height);
        /*
        ArrayList<Integer> l=tree.inorderIterative(rootnode);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i)+" ");
        }
        */
       // System.out.println(tree.SumofLeafNodes(rootnode));
    }
    
    
}
    
