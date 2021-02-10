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
public class CircularArrayQueue{
    int countsize;
    int maxsize;
    int cirarr[];
    int front;
    int rear;
    public static int DEFAULT_CAPACITY=10;
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY); //calling next constructor only just making it user save if user doesnt pass any capacity
    }
    CircularArrayQueue(int capacity){
        this.cirarr=new int[capacity];
        this.countsize=0;
        this.maxsize=capacity;
        this.front=0;
        this.rear=capacity-1; //why this because we are incrementing rear before using it
    }
    public boolean isFull(){
        return (countsize==maxsize) ? true : false; //ternary operator
    }
    public boolean isEmpty(){
        return this.countsize==0;
         
    }
    public void enqueue(int data){
        if(!this.isFull()){
            this.rear=(this.rear+1)%this.cirarr.length;
            this.cirarr[this.rear]=data;
            this.countsize=this.countsize+1;
        }
        //return 0;
    }
    public int dequeue(){
        if(!this.isEmpty()){
            int data=this.cirarr[front];
            this.front=(this.front+1)%this.cirarr.length;
            this.countsize=this.countsize-1;
            return data;
        }
        return -1;
    }
    public int getFront(){
        return cirarr[this.front];
    }
    public static void main(String args[]){
        CircularArrayQueue cqueue=new CircularArrayQueue(5);
        cqueue.enqueue(1);
        cqueue.enqueue(2);
        System.out.println(cqueue.dequeue());
    }
   
}

