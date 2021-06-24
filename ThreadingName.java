//60. Program to get the name of a running thread.
public class ThreadingName extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }
    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }
    public static void main(String[] args) {
        ThreadingName tt = new ThreadingName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}