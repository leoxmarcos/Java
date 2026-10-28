 class  thread1 extends Thread {

    public void run () {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}


    public class  threadEx{
    public static void main (String[] args) {
        thread1 t1 = new thread1();
        t1.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread"+ i);
        }
    }

    }