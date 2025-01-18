/*
A hint to the scheduler that the current thread is willing to yield its current use of a processor. The scheduler is free to ignore this hint.
Yield is a heuristic attempt to improve relative progression between threads that would otherwise over-utilise a CPU. Its use should be combined with detailed profiling and benchmarking to ensure that it actually has the desired effect.
It is rarely appropriate to use this method. It may be useful for debugging or testing purposes, where it may help to reproduce bugs due to race conditions. It may also be useful when designing concurrency control constructs such as the ones in the java. util. concurrent. locks package.
 */

class A7 extends Thread{
    public A7(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("name: "+Thread.currentThread().getName());

            Thread.yield();
        }
    }
}

public class CWS_12_yield_method {
    public static void main(String[] args) {
        A7 obj1=new A7("t1");
        A7 obj2=new A7("t2");

        obj1.start();
        obj2.start();
    }
}

/*
without yield:

name: t2
name: t2
name: t1
name: t1
name: t1
name: t1
name: t2
name: t2
name: t1
name: t1
name: t2
name: t2

Process finished with exit code 0

 */

/*
with yield

name: t2
name: t2
name: t2
name: t1
name: t2
name: t1
name: t1
name: t1
name: t2
name: t1
name: t2
name: t1
 */