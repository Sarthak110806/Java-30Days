import java.util.Scanner;

class Operators{

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Name : ");
    String Name = scan.nextLine();

    System.out.println("Enter RollNo : ");
    int RollNo = scan.nextInt();

    System.out.println("Enter Maths marks : ");
    int Maths = scan.nextInt();

    System.out.println("Enter Sci marks : ");
    int Sci = scan.nextInt();

    System.out.println("Enter Bio : ");
    int Bio = scan.nextInt();

    int Total = Maths + Sci + Bio;
    System.out.println("Total = " + Total);

    float Avg = Total/3.0f;
    System.out.println("Avg : "+ Avg);

    float Percentage = (Total / 300.0f) * 100;
    System.out.println("Percentage : " + Percentage);

    if (Percentage >= 40){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

    if (Percentage >= 90){
        System.out.println("A");
    }
    else if (Percentage >= 75 && Percentage < 90){
        System.out.println("B");
    }
    else if (Percentage >= 60 && Percentage < 75){
        System.out.println("C");
    }
    else if (Percentage >= 40 && Percentage < 60){
        System.out.println("D");
    }
    else{
        System.out.println("F");
    }

    //ODD or Even

    if (RollNo % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    }
}