package PrintHelloWorldUsingThreads;

public class PrintNumber implements Runnable{
    int noToPrint;
    PrintNumber(int x){
        this.noToPrint = x;
    }
    @Override
    public void run() {
        System.out.println("Printing " + this.noToPrint + " in thread : " + Thread.currentThread().getName());
    }
    public void startNumber{
        int a;
    }
}
