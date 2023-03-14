// Write a Functional Interface with method signature - String convertToUppercase(String lowercase) and implement interface using lambda expression

interface StringUpperCase{
    public void signature();
}

public class Example3{
    public static void main(String args[]){
        String str = "ncodeit";
        String strUpperCase = str.toUpperCase();

        StringUpperCase s1=() ->{
            System.out.println("Java String to upper case "+ strUpperCase);
        };
        s1.signature();
    }
}