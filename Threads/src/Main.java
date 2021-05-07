public class Main {
    public static void main(String[] args) {
        MyThread th1=new MyThread("Thread 1");
        MyThread th2=new MyThread("Thread 2");

        System.out.println("HELLO FROM "+Thread.currentThread().getName());
        th1.start();
        System.out.println("Thread 1 Started");
        th2.start();
        System.out.println("Thread 2 Started");

    }
}
