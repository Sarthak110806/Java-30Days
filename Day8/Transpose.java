import java.util.*;

public class Transpose {
    public static void main(String[] args){

        int[][] A = {{1,2},{2,3},{3,4}};
        

        int[][] Tr = new int[2][3];

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 2; j++){
                Tr[j][i] = A[i][j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(Tr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

