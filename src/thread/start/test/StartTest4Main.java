package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpl("A", 1000), "Thread-A");
        Thread thread2 = new Thread(new RunnableImpl("B", 500), "Thread-B");
        thread1.start();
        thread2.start();
    }

    static class RunnableImpl implements Runnable {

        private String content;
        private int sleepMs;

        public RunnableImpl(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
