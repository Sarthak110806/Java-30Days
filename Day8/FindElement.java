import java.util.*;

public class FindElement {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i<rows; i++){
            System.out.println("Enter " + i + " row : ");
            for (int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println ("Enter the number to search : ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (arr[i][j] == x){
                    System.out.println("We have found the number " + x + " at " + i + " " + j);
                }
            }
        }
    }

}
