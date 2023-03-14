// Write a Functional Interface with method signature - String reverseString(String s) and implement interface using lambda expression

interface Signature{
    String stringUpperCase(String str);
}

public class Example2{

    public static void main(String args[]){

        Signature ref = (str) -> {
            String result = "";
            for(int i=str.length()-1; i>0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(ref.reverseString("NCODEIT"));
    }
}