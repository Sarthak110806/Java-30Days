public class banana {
    
    public static void main(String[] args){

        String Ban = "banana";
        int count = 0;
        
        for (int i = 0; i < Ban.length(); i++){
            if (Ban.charAt(i) == 'a'){
                count++;
            }
            
        }
        System.out.println("Count of a is " + count);
    }
}
