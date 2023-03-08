// Cacel the task while calculating the sum of n numbers using Executor Service
import java.util.concurrent.*;

public class TerminateTaskUsingFuture{

    public static void main(String args[]) throws InterruptedException, ExecutionException{
        System.out.println("Thread main Start");
        
        ExecutorService executorService = Executors.newCachedThreadPool();

        SumFirstnums sumTask = new SumFirstnums(5000);
        Future<Integer> result = executorService.submit(sumTask);

        Thread.sleep(5);
        result.cancel(true);
        executorService.shutdown();

        System.out.println("Thread main Completed."); 

    }
}

class SumFirstnums implements Callable<Integer>{
    private int n;

    public SumFirstnums(int n){
        this.n = n;
    }

    public Integer call(){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
            sum +=i;

            if(Thread.interrupted()){
                System.out.println("Cancelling the task....");
                return -1;
            }
        }
        return sum;
    }
}
