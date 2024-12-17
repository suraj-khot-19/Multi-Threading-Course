public class CWS_01_Main_Thread {

    /// so by default main thread will run when main method runs in our application

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("current Thread Name: "+Thread.currentThread().getName());
        System.out.println("current thread ID: "+Thread.currentThread().getId());
    }
}
