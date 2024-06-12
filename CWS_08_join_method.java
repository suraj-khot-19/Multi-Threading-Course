/*
    Waits for this thread to die.
    An invocation of this method behaves in exactly the same way as the invocation

    Throws:
    InterruptedException – if any thread has interrupted the current thread. The interrupted status of the current thread is cleared when this exception is thrown
 */

class A3 extends Thread {
    @Override
    public void run() {
            try {
                System.out.println("hello i am from thread run method i will start execution when start method called");

                /// sleep for 5 second
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
    }
}

public class CWS_08_join_method {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello i am from main method before join");

        A3 obj=new A3();

        obj.start();
        obj.join(); /// this joins A3 thread with Main(main method's thread)

        System.out.println("Hello i am from main method after join, i will wait till thread completely execute means die");
    }
}
