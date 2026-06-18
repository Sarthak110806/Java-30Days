import java.util.*;

public class DiagonalSum {
    public static void main(String[] args){

        int[][] A = {{1,2,3},{2,3,4},{3,4,5}};
        int Sum = 0;
        

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++){
                if(i==j){
                    Sum += A[i][j];
                }
            }
        }
        System.out.println("Sum is : "+ Sum);
    }

}



