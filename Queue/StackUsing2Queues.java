/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author lenovo
 */
import java.util.*;
class StackUsing2Queues_class {
     Queue<Integer> q1 = new LinkedList<Integer>(); //primary
    Queue<Integer> q2 = new LinkedList<Integer>(); //secondary
   // Queue<Integer> primary=q1;
    //Queue<Integer>  secondary=q2;
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    int i=0;
	    while(!q1.isEmpty() && q1.size()!=1){
	        q2.add(q1.remove());
	        
	       // i++;
	        
	    }
	    if(!q1.isEmpty()){
	    int val=q1.remove();
	    Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q;
	    return val;
	    }
	    return -1;
	    
	    
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
	    
    }
}

public class StackUsing2Queues{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			StackUsing2Queues_class g = new StackUsing2Queues_class();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
         
                }
        }
}