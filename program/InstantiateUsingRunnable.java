import java.lang.*;

class Task2 implements Runnable{
    public void run(){
        for(int i=0; i<= 10; i++){
            System.out.println("[" + Thread.currentThread().getName() + "]" + i);
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class InstantiateUsingRunnable{
    
    public static void main(String args[]){
        System.out.println("Thread main Started");

        Thread t1 = new Thread(new Task2());
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();

        System.out.println("Thread main ended");
    }
}