public class Oddeven {
    
    public static void main(String[] args){

        int a = 17;

        if (a <= 0){
            System.out.println("Neither odd nor even.");
        }
        else if (a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("ODD");
        }
    }
}
