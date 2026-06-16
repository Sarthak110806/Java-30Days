/*import java.util.Scanner;

public class practice {

    public static void main(String[] args){

        String str = "Sarthak";

        for (int i = str.length() - 1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}*/

/*public class practice{
    public static void main(String[] args){
StringBuilder sb = new StringBuilder("Solanki");
System.out.print(sb.reverse());}
}*/

/*public class practice{

    public static void main(String[] args){

        String str = "racecar";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}*/

/*public class practice{

    public static void main(String[] args){

        String str = "Sarthak";

        int count = 0;

        str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}*/

public class practice{

    public static void main(String[] args){

        String str = "Banana";

        char aim = 'a';

        str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if( aim == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}