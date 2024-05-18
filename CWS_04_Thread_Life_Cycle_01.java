public class CWS_04_Thread_Life_Cycle_01 extends Thread {
    @Override
    public void run() {
        System.out.println("I am a thread in same class");
    }

    public static void main(String[] args) {
        CWS_04_Thread_Life_Cycle_01 obj=new CWS_04_Thread_Life_Cycle_01();

        //1. NEW state just created object/reference to thread
        System.out.println(obj.getState());

        //2 RUNNABLE state because we called start/run method from thread class
        obj.start();
        System.out.println(obj.getState());

    }
}
