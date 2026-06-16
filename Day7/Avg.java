public class Avg {
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};
        int Sum = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++){
            Sum += arr[i];
        }
        avg = Sum / arr.length;
        System.out.println(avg);
    }
}
