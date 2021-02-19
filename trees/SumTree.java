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
public class SumTree {
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
    boolean isSumTree(Node node){
        int ans=recurSum(node);
        if (ans!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    int recurSum(Node node){
        int lsum=0;
        int rsum=0;
        if(node==null){
            return 0;
        }
        if(node.right==null && node.left==null){
            return node.data;
        }
        
        
        lsum+=recurSum(node.left);
        
        rsum+=recurSum(node.right);
        if(lsum==-1 || rsum==-1){
            return -1;
        }
        else if(node.data==lsum+rsum){
            return node.data+lsum+rsum;
        }
        return -1;
    }
    
    
    
    
    
    
	int isSumTreeRecur(Node node)
	{//utility function with return value int
	    if(node.left==null && node.right!=null){
	        return node.right.data;
	    }
	    if(node.left!=null && node.right==null){
	        return node.left.data;
	    }
        if(node.left==null && node.right==null){
            return node.data;
        }    
        int s1=0;
        int s2=0;
        s1+=isSumTreeRecur(node.left);
        s2+=isSumTreeRecur(node.right);
        if(node.data==s1+s2){
            return -1;
        }
    
            return -2;
        
	}
    
    
}
