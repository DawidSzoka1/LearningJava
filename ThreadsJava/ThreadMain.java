package ThreadsJava;


public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Thread Name");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());//higher number higher priority from 1 to 10
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

//        for(int i = 3; i > 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("you are done!");
        MyThread myThread = new MyThread();
        myThread.setDaemon(false);
        System.out.println("daemon ----------------- "+myThread.isDaemon());
        myThread.start();
        System.out.println(myThread.isAlive());
        myThread.setName("myThread");
        System.out.println(myThread.getName());
        myThread.setPriority(1);
        System.out.println(myThread.getPriority());//default is 5 by now it takes the priority of main thread (10)
        System.out.println(Thread.activeCount());
    }
}
