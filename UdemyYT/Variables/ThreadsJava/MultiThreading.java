package UdemyYT.Variables.ThreadsJava;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread2 = new Thread(myRunnable1);

        myThread1.setDaemon(true);
        thread2.setDaemon(true);
        myThread1.start();
//        myThread1.join(3000);//wait till specified thread is finished or delay in ms
        thread2.start();
        System.out.println(1/0);

    }
}
