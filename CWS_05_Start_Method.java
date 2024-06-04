
class A1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class CWS_05_Start_Method {
    public static void main(String[] args) {
        A1 obj=new A1();
        /*
            Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
            The result is that two threads are running concurrently: the current thread (which returns from the call to the start method) and the other thread (which executes its run method).
            It is never legal to start a thread more than once. In particular, a thread may not be restarted once it has completed execution.
         */
        obj.start();
    }
}
