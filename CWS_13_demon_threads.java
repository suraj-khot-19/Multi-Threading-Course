/*
Marks this thread as either a daemon thread or a user thread. The Java Virtual Machine exits when the only threads running are all daemon threads.
This method must be invoked before the thread is started.
 */

class A9 extends Thread{
    @Override
    public void run(){
        /// infinite loop
        while (true){
            System.out.println("hello world!");
        }
        /// after using demon it will stop after some time
    }
}
public class CWS_13_demon_threads {
    public static void main(String[] args) {
        A9 obj=new A9();

        // This method must be invoked before the thread is started.
        obj.setDaemon(true); /// must be before start method call

        obj.start();

        System.out.println("Main thread done");
    }
}

////demon is only stop current thread if and ony if other threads are stop their execution or in background