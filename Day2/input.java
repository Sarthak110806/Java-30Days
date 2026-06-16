import java.util.Scanner;

public class input{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What's ur name dawg? ");
        String Name = scan.nextLine();
        System.out.println("Hey " + Name);

        System.out.println("What's your age? ");
        int Age = scan.nextInt();
        System.out.println("My age is : " + Age);

    }
}