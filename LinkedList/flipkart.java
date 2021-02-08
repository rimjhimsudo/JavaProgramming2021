import java.util.*;
import java.io.*;
//import javafx.util.Pair;
public class flipkart{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("t");
        int T = sc.nextInt(); //input
        while(T>0)
        {
            System.out.println("N");
             long N = sc.nextLong();
             long a[] = new long[(int)N];
             System.out.println("k");
             long k=sc.nextLong();
             System.out.println("nums");
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Sol s = new Sol();
             long ans = s.game_func(a,k);
            
            
            System.out.println(ans);
            //System.out.println();
            T--;
        }
    }
}
class Sol{
    public  long game_func( long arr[] , long k){
        //index,element
        // Pair<Integer,Long> pmax=new Pair<Integer,Long>();
         //Pair<Integer,Long> pmin=new Pair<Integer,Long>();
         Pair<Integer,Long> pmax=Max_fxn(arr);
         Pair<Integer,Long> pmin=Min_fxn(arr);
         long diff=pmax.second-pmin.second;
         
         long step=0;
         
        if(diff==k || diff==0){
            return 0;
        }
        //System.out.println("max i "+pmax.first +"   min i: "+pmin.first);
       //System.out.println("max "+pmax.second +"   min : "+pmin.second);
       boolean side=false;
        while(diff!=k){
            //diff=
            if(k>=pmax.second && diff<k){
                //pmax.second+=1;
                arr[pmax.first]+=1;
                System.out.println("1");
            }
            else if(k<diff && k>=pmin.second && k<=pmax.second){
                //max+=-1; 
                //min+=1;
                arr[pmax.first]+=-1;
                arr[pmin.first]+=1;
                step++;
                System.out.println("2");
            }
            else if(k<=pmin.second  && diff>k){
                //min+=1;
                //if(side==false){
                arr[pmin.first]+=1;
                
                arr[pmax.first]+=-1;
                
                step++;
                System.out.println("3");
            }
            else if(k<=pmin.second  && diff<k){
             //    max+=1;
                arr[pmax.first]+=1;
                System.out.println("4");
            }
            side=!side;
            pmax=Max_fxn(arr);
            pmin=Min_fxn(arr);
            diff=pmax.second-pmin.second;
          //  System.out.println("max i"+pmax.first +"   min :i "+pmin.first);
            //System.out.println("max "+pmax.second +"   min : "+pmin.second);
            step++;
        }
        return step;
    }


    public Pair<Integer,Long> Max_fxn(long arr[]){
        int i; 
           
         // Initialize maximum element 
         long max = arr[0]; 
          int maxi=0;  
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++){
             if (arr[i] > max){ 
                 max = arr[i]; 
                 maxi=i;
             }
         }
         return new Pair<Integer,Long>(maxi,max);
    }
    public  Pair<Integer,Long> Min_fxn( long inputArray[]){
         long minValue = inputArray[0]; 
         int mini=0;
        for(int i=1;i<inputArray.length;i++){ 
        if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
            mini=i;
        } 
        } 
        return new Pair<Integer,Long>(mini,minValue);
    }
}
class Pair<U, V>
{
    public final U first;       // first field of a Pair
    public final V second;      // second field of a Pair
 
    // Constructs a new Pair with specified values
    public Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        // calls private constructor
        return new Pair<>(a, b);
    }
}
/*
public  long game_func( long arr[] , long k){
        //index,element
        // Pair<Integer,Long> pmax=new Pair<Integer,Long>();
         //Pair<Integer,Long> pmin=new Pair<Integer,Long>();
         Pair<Integer,Long> pmax=Max_fxn(arr);
         Pair<Integer,Long> pmin=Min_fxn(arr);
         long diff=pmax.second-pmin.second;
         
         long step=0;
         
        if(diff==k || diff==0){
            return 0;
        }
        //System.out.println("max i "+pmax.first +"   min i: "+pmin.first);
       //System.out.println("max "+pmax.second +"   min : "+pmin.second);
        while(diff!=k){
            //diff=
            if(k>=pmax.second && diff<k){
                //pmax.second+=1;
                arr[pmax.first]+=1;
                System.out.println("1");
            }
            else if(k<diff && k>=pmin.second && k<=pmax.second){
                //max+=-1; 
                //min+=1;
                arr[pmax.first]+=-1;
                arr[pmin.first]+=1;
                step++;
                System.out.println("2");
            }
            else if(k<=pmin.second  && diff>k){
                //min+=1;
                arr[pmin.first]+=1;
                arr[pmax.first]+=-1;
                step++;
                System.out.println("3");
            }
            else if(k<=pmin.second  && diff<k){
             //    max+=1;
                arr[pmax.first]+=1;
                System.out.println("4");
            }

            pmax=Max_fxn(arr);
            pmin=Min_fxn(arr);
            diff=pmax.second-pmin.second;
          //  System.out.println("max i"+pmax.first +"   min :i "+pmin.first);
            //System.out.println("max "+pmax.second +"   min : "+pmin.second);
            step++;
        }
        return step;
    }
*/