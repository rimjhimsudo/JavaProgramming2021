/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogs2021;

/**
 *
 * @author lenovo
 */
public class StringsRotationOfEachOther {
    
    //WRONG  APPROACH********************************************
    
    
    public static boolean areRotations(String s1, String s2 )
            
    {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        boolean flag=false;
        int j=0, start_i=-1, start_j=-1, end_i=-1, end_j=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(j)){
                start_i=i;
                start_j=j;
                if(i==0 && j>0){
                    String fake=s2.substring(j,s2.length());
                    String fake1=s1.substring(i, fake.length());
                    if(fake.compareTo(fake1)==0){
                        flag=true;
                        end_i=fake.length()-1;
                        end_j=s2.length();
                        fake=s1.substring(end_i,s1.length());
                        fake1=s2.substring(0,end_j);
                        if(fake.compareTo(fake1)==0){
                        flag=true;
                        }
                        else{
                            flag=false;
                        }
                    }
                    else{
                        flag=false;
                    }
                }
                else if(i>0 && j==0){
                    String fake=s1.substring(i,s1.length());
                    String fake1=s2.substring(j, fake.length());
                    if(fake.compareTo(fake1)==0){
                        flag=true;
                        end_i=start_i;
                        start_j=fake.length();
                        fake=s1.substring(0,end_i);
                        fake1=s2.substring(start_j,s2.length());
                        if(fake.compareTo(fake1)==0){
                        flag=true;
                        }
                        else{
                            flag=false;
                        }
                    }
                    else{
                        flag=false;
                    }
                }
                
                
            }
            if(flag==true){
                
            }
        }
        return flag;
    }
    public static void main(String[] args){
        String s1="rvvsvczyczqjojiovkpokdbaeggkqbchwxzucasgzlpquzeplvfvygxepdofftmdsnxunscpdthxslpdgub";
        
        System.out.println(s1.length());
        boolean s=areRotations("rvvsvczyczqjojiovkpokdbaeggkqbchwxzucasgzlpquzeplvfvygxepdofftmdsnxunscpdthxslpdgub", "vsvczyczqjojiovkpokdbaeggkqbchwxzucasgzlpquzeplvfvygxepdofftmdsnxunscpdthxslpdgubrv");
        System.out.println(s);
    }
    
}
