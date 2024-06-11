/*
Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers. The thread does not lose ownership of any monitors.
 */

class A2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class CWS_07_sleep_method {
    public static void main(String[] args) {
        A2 obj=new A2();
        obj.start();
    }
}
