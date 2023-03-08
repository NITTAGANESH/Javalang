// Terminate all tasks using shutdownNow method using Executor Service

import java.util.concurrent.*;
import java.util.List;

class SumFirstNums implements Callable<Integer>{
    private int n;

    public SumFirstNums(int n){
        this.n = n;
    }

    public Integer call(){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            try{
                System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
                sum +=i;
                Thread.sleep(1001);
            }catch(InterruptedException e){
                System.out.println("Interrupting the thread while it was sleeping...");
                break;
            }
        }
        return sum;
    }
}

public class TerminateAllTasksInExecutorService{

    public static void main(String args[]) throws InterruptedException{

        System.out.println("Thread main started");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new SumFirstNums(400000));
        executorService.submit(new SumFirstNums(300000));
        executorService.submit(new SumFirstNums(200000));
        executorService.submit(new SumFirstNums(100000));
        executorService.submit(new SumFirstNums(100000));
        executorService.submit(new SumFirstNums(100000));
        executorService.submit(new SumFirstNums(100000));
        executorService.submit(new SumFirstNums(100000));

        Thread.sleep(10001);

        List<Runnable> queudTasks = executorService.shutdownNow();

        System.out.println("Tasks that hasn't started: " + queudTasks.size());
        System.out.println("Thread main ended.");
    }
}