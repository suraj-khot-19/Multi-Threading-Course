/*
Interrupts this thread.
Unless the current thread is interrupting itself, which is always permitted, the checkAccess method of this thread is invoked, which may cause a SecurityException to be thrown.
If this thread is blocked in an invocation of the wait(), wait(long), or wait(long, int) methods of the Object class, or of the join(), join(long), join(long, int), sleep(long), or sleep(long, int) methods of this class, then its interrupt status will be cleared and it will receive an InterruptedException.
 */

class A6 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running ....");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread is started after 1.2 sec");
    }
}

public class CWS_11_Interrupter_Method {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.start();

        /// it will throw error of InterruptedException
        obj.interrupt(); // it will not allow wait or sleep it will run threads
    }
}
/*
Thread is running ....
java.lang.InterruptedException: sleep interrupted
Thread is started after 1.2 sec
 */