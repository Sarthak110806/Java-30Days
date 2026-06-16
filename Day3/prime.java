import java.util.Scanner;

public class prime {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        
        for (int i = 2; i < num-1; i++){

            if (num % i == 0){

                System.out.println("Not a prime.");
                
            }else{
                System.out.println(num + "is a prime.");
            }

        }
    }
}
