/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author lenovo
 */
import java.util.*;
public class GenericTree {
    private class  TreeNode{
        int data;
        ArrayList<TreeNode> children;
        TreeNode(int data){
            this.data=data;
            this.children=new ArrayList<>();
        }
        
    }
    private TreeNode root;
    int size;
    GenericTree(){
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null,0);
    }
    /* take input :
        1.constructor take first input which becomes root then 
        2.takeinput calls itself recursively and build tree
    
    */
    
    private TreeNode takeInput(Scanner s,TreeNode parent, int ithChild ){
        if(parent==null){
            System.out.println("enter data for root");
        }
        else{
            System.out.println("enter data for child"+ithChild+"of parent"+parent.data);   
        }
        int nodeData=s.nextInt();
        TreeNode node=new TreeNode(nodeData);
        this.size++;
        System.out.println("enter no of children for"+nodeData);
        int children=s.nextInt();
        //will be execute according to number of children
        //take input  construct the tree in this manner : 60 41 17 16 15 21 24 33 84 : that is it first goes till last leaf node
        for(int i=0;i<children;i++){
            TreeNode child=takeInput(s,node,i);
            node.children.add(child);
           
        }
        return node;
    }
    public void display(){
        //this is because root is private so we are internally passing root node in private display  and calling private display fxn 
        //achieved through fxn overloading
        this.display(this.root);
    }
    private void display(TreeNode tnode){
        /*
        60 -41,15, 24
        41- 17 16
        17
        16
        15 - 21
        21
        24- 33 84
        33
        84*/
        System.out.print(tnode.data+" -> ");
        if(tnode.children.size()>0){
            for(int i=0;i<tnode.children.size();i++){
                System.out.print(tnode.children.get(i).data+" "); 
            }
            System.out.println();
            for(int i=0;i<tnode.children.size();i++){
                display(tnode.children.get(i));
            }
            
        }
        else{
            //this is for leaf nodes since they wont get next line so 
         System.out.println();
        }
        
        
    }
    public static void main(String args[] ){
        GenericTree gt=new GenericTree();
       // TreeNode root=takeInput();
       gt.display();
    }
    
}
