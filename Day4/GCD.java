public class GCD {

    static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        
        } 
        return gcd(a, b);
    }

    public static void main(String[] args){
            System.out.println(gcd(10,5));
        }
    
}