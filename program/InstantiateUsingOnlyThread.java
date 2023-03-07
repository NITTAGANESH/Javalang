//  Create threads t1 and t2 using class which extends Thread class and execute the task to loop and print integers from 1 to 10
import java.lang.Thread;

class Task1 extends Thread{
    public Task1(){

    }

    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("[" + Thread.currentThread().getName() + "]" + i);
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class InstantiateUsingOnlyThread{

    public static void main(String args[]){

        System.out.println("Thread main started");

        Thread t1 = new Task1();
        Thread t2 = new Task1();
        t1.start();
        t2.start();

        System.out.println("thread main finished");
    }
}
