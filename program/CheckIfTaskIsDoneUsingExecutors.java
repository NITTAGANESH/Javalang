// Create a task to sum all n numbers using Executor Service, check if task is finished and if finished print the result
import java.util.concurrent.*;
public class CheckIfTaskIsDoneUsingExecutors{

    public static void main(String args[]) throws InterruptedException,ExecutionException{
        System.out.println("Thread main Started");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(new SumFirstNum(50));

        while(!result.isDone()){
            System.out.println("Task is still processing");
            Thread.sleep(5001);
        }

        System.out.println("Task is finished: " + result.isDone());
        System.out.println("Task result is: "+ result.get());

        executorService.shutdown();
        System.out.println("Thread main finished");
    }

} 

class SumFirstNum implements Callable<Integer>{
    private int n;

    public SumFirstNum(int n){
        this.n = n;
    }

    public Integer call(){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
            sum += i;
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return sum;
    }
}
