public class Largest {

    public static void main(String[] args){

        int[] arr = {10,25,7,18,9};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            
            if (arr[i] > max){
                max = arr[i];
            }    
        }
        System.out.println("Largest element is :" + max);

    }
}