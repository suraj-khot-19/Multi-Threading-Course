class A5 extends Thread {

    /// constructor changing name
    public A5(String s) {
        super(s); /// name to s
    }

    ///  run
    @Override
    public void run() {
        String s = "";
        for (int i = 0; i < 1000; i++) {
            System.out.println("name: " + Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority() + ", i: " + i);
        }
    }
}

public class CWS_10_setPriority_method {
    public static void main(String[] args) {
        A5 t1 = new A5("thread1");
        A5 t2 = new A5("thread2");
        A5 t3 = new A5("thread3");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
