public class MyThread extends Thread {
    private String threadName;
    public MyThread(String threadName) {
        this.threadName=threadName;
    }

    @Override
    public void run() {
        System.out.println("hello from "+ threadName);
    }
}
