class A4 extends Thread{
    public A4(String name){
        super(name); /// this will change the name of thread
    }

    @Override
    public void run(){
       for (int i=0;i<4;i++){
           System.out.println(Thread.currentThread().getName());
       }
    }
}

public class CWS_09_Change_Name_Of_Thread {
    public static void main(String[] args) {
        A4 thread=new A4("CustomThreadName"); /// using constructor property

        thread.start();
    }
}
