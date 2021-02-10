/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author lenovo
 */
public class Stackclass {
static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stackclass

    boolean isEmpty()
    {
        return (top < 0);
    }
    Stackclass()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX-1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
}

// Driver code
class Main
{
    public static void main(String args[])
    {
        /*
        Stackclass s = new Stackclass();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        */
        //int arr[]={68, 735, 101, 770, 525 ,279 ,559 ,563 ,465 ,106 ,146, 82 ,28 ,362 ,492 ,596 ,743 ,28 ,637 ,392, 205, 703 ,154 ,293, 383 ,622, 317, 519, 696 ,648 ,127 ,372, 339, 270 ,713 ,68 ,700 ,236 ,295 ,704 ,612 ,123};
        int arr[]={7 ,2 ,8, 9 ,1 ,3 ,6, 5};
        NearestGreatestToLeft obj= new NearestGreatestToLeft();
        NearestSmallestToLR obj1=new NearestSmallestToLR();
        //System.out.println(area);
        //int res[]=obj.Ngl(arr);
        //int res[]=obj1.NearestSmallestLeft(arr);
       /*
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
       */
    }
}

