// Write a program to implement Runnable Functional interface using lambda expression

interface Draw{
    public void run();
}

public class Example1{
    public static void main(String args[]){
        int width = 10;

        Draw d1=()->{
            System.out.println("Draw " + width);
        };
        d1.run();
    }
}