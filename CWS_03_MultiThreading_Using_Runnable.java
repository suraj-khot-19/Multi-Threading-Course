
class MyClass implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<=200;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class CWS_03_MultiThreading_Using_Runnable {
    public static void main(String[] args) {

        MyClass ref=new MyClass();

        //ref.start(); /// error

        Thread thread=new Thread(ref);

        thread.start();

        for (int i=0;i<=200;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
