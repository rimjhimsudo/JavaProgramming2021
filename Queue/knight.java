/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class knight {
    public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N){
        if(KnightPos[0]==TargetPos[0] && KnightPos[1]==TargetPos[1] ){
            return 1;
        }
        if(KnightPos[0] >=N && TargetPos[0]>=N && KnightPos[1]>=N && TargetPos[1]>=N){
            return 0;
        }
        int myresmax; //create your own result
        
    }
    
}
