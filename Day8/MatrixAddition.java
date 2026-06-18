import java.util.*;

public class MatrixAddition {
    public static void main(String[] args){

        int[][] A = {{1,2,3},{2,3,4}};
        int[][] B = {{9,8,7},{10,20,30}};

        int[][] C = new int[2][3];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}