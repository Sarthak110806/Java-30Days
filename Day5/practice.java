/*public class practice {

    public static void main(String[] args){
        int[] Ages = {15,19,46,44};

        float avg = 0;
        int sum = 0;
        int len = Ages.length;

        for ( int Age : Ages){
            sum += Age;
        }

        avg = sum / len;

        System.out.println("Sum of ages is : " + sum);
        System.out.println("Average age is : " + avg);
    }    
}*/

/*import java.util.Scanner;

public class practice {

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        int[] Scores = new int[5];

        for (int i = 0; i < Scores.length; i++){
            System.out.println("Enter score : ");
            Scores[i] = sc.nextInt();
        }

        for (int Score = 0; Score < Scores.length; Score++){
            System.out.println(Scores[Score]);
        }
    }

}*/

/*public class practice {

    public static void main(String[] args){

            int[] arr = {19,28,37,95,33,42,45,10};
            int max = arr[0];

            for (int i = 0; i < arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }

            System.out.println("The largest element is : " + max);
            
    }
}*/

/*public class practice { 

    public static void main(String[] args){

        int[] num = {10,20,30,40,50};
        int sum = 0;
        float avg;

        for( int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        
        avg = sum / num.length;
        System.out.println("Average is " + avg);
    }
}*/

public class practice { 
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("Sum : "+ sum);

        

    }
}