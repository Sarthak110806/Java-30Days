public class Palindrome {

    public static void main(String[] args){

        String str = "MoM";
        String rev = " ";

        for (int i = str.length(); i < 0; i--){
            rev = rev + str.charAt(i);  
        }
        if (str.equals(rev)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}
