public class CWS_06_Run_method extends Thread{

    /*
        Thread If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns.
        Subclasses of Thread should override this method.
     */

    @Override
    public void run(){
        System.out.println("Run method");
    }
}
