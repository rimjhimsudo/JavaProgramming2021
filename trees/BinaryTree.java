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
    
    //public Btnode root=null;
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
        //including above if and not including both gives same answer beeacsue if yo include then it will give you ont 1 fom here which gets added and 1  orre call is not made and when ou dont include then 1 mode call is made in depth and from there one more 1 is added to answer. so both works same.
        return  1+ Math.max( height(root.left),height(root.right));
    }
    //2.HEIGHT OF TREE ITERATIVE
    public static int height_iter( Btnode root){
        Queue<Btnode> q=new LinkedList<>();
        if(root==null){
          return 0;
        }
        int node_count=0;
        q.add(root);
        int height=0;
        while(true){
            if(q.isEmpty()){
              return height+1; //1 is added here because for last rmoval heoght is returned and no height++ is carried out.
            }
            else{
              height++;
            }
            node_count=q.size();
            while(node_count>0){
              Btnode b=q.remove();
              if(b.left!=null){
                q.add(b.left);
              }
              if(b.right!=null){
                q.add(b.right);
              }
              node_count--;
            }
        }

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
        //ITERATIVE
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
     boolean areMirror(Btnode a, Btnode b) {
        // Your code here
        if(a==null && b==null){
            return true;
        }
        if(a.data!=b.data){
            return false;
        }
        boolean ans =areMirror(a.left,b.right);
        boolean ans1 =areMirror(a.right,b.left);
        if(ans ==false || ans1==false){
            return false;
        }
        return true;
    }
      public static Btnode deletionBT(Btnode root, int key){
        //Write your code here and return the root of the changed tree
         if (root == null)  
            return root;  
          
        if (root.left == null && root.right == null) 
        {  
             if((int)root.data == key)  
                {  root=null;
                   return root;  
                }
             else
                return root; 
        } 
        Btnode keynode=null, temp=null;
        Queue<Btnode> q=new LinkedList<Btnode>();
        q.add(root);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp!=null && (int)temp.data==key){
                keynode=temp;
            }
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        if(keynode!=null){
            int tempval=(int)temp.data;
            
            deleteLastnode(root,temp);
            keynode.data=tempval;
        }
        return root;
    }
    public static void deleteLastnode(Btnode root,Btnode last){
        Btnode temp=null;
        Queue<Btnode> q=new LinkedList<Btnode>();
        q.add(root);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp==last){
                temp=null;
                return;
            }
            if(temp.left!=null){
                if(temp.left==last){
                    temp.left=null;
                    return;
                }
                else{
                    q.add(temp.left);
                }
            }
            if(temp.right!=null){
                if(temp.right==last){
                    temp.right=null;
                    return;
                }
                else{
                    q.add(temp.right);
                }
            }
        }
        
    }
    
    public static void topView(Btnode root){
        HashMap<Integer,ArrayList<Integer>> hmap = new HashMap<>(); 
        Queue<Btnode> q=new LinkedList<>();
        Queue<Integer> dist=new LinkedList<>();
        q.add(root);
        dist.add(0);
        while(!q.isEmpty()){
            int distp=dist.remove();
            Btnode tempnode=q.peek();
            q.remove();
            ArrayList<Integer> get=hmap.get(distp);
            if(get == null){
                //System.out.println("334");
                get =new ArrayList<>();
                get.add((Integer) tempnode.data);
            }
            else{
                //System.out.println("339");
                get.add((Integer) tempnode.data);
            }
            hmap.put(distp, get);
            if(tempnode.left!=null){
                //System.out.println("344");
                q.add(tempnode.left);
                dist.add(distp-1);
            }
            if(tempnode.right!=null){
                //System.out.println("349");
                q.add(tempnode.right);
                dist.add(distp+1);
            }
        }
        for (Map.Entry<Integer,ArrayList<Integer>> e : hmap.entrySet()){
            System.out.println(e.getValue());
        } 
       /* ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,ArrayList<Integer>> e : hmap.entrySet()){
            list.add(e.getValue().get(0));
        } 
         return list;   
        */
        
    }
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
       // Btnode<Integer> rootnode=tree.takeInputDepthWise(s);
        //System.out.println(n.data);
        //tree.printDepthWise(rootnode);

        Btnode<Integer> rootnode=tree.takeInputLevelWise();
        
        tree.printPreorder(rootnode);
        //System.out.println();
        topView(rootnode);
        /*for(int i:list){
            System.out.println(i);
        }
        */
       // tree.printInorder(rootnode);
        //Btnode<Integer> root=deletionBT(rootnode,11);
         System.out.println();
        //tree.printInorder(root);
        System.out.println();
        //tree.printPostorder(rootnode);
        //tree.printLevelWise(rootnode);
        //int height=tree.height(rootnode);
        //System.out.println("h"+height);
        /*
        ArrayList<Integer> l=tree.inorderIterative(rootnode);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i)+" ");
        }
        */
       // System.out.println(tree.SumofLeafNodes(rootnode));
    }
    
    
}
    
