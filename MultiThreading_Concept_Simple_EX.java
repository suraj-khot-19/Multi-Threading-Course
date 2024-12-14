class Simple extends Thread{

    /// run method from Thread class which providing Threading
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class MultiThreading_Concept_Simple_EX {
    public static void main(String[] args) {

        Simple simple=new Simple();

        /// Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
        simple.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
