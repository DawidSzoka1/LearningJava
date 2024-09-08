package ThreadsJava;

public class MyThread extends Thread {
    @Override
    public void run() {
        if(this.isDaemon()){
            System.out.println("Daemon is running");
        }else{
            System.out.println("this thread is running");
        }
    }
}
