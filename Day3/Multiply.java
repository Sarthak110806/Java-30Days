import java.util.Scanner;

public class Multiply {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int prod = n*i;
            System.out.println(n + " x " + i + " = " + prod);
        }
        sc.close();

    }
}
