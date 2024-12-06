package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockMain {

    public static void main(String[] args) {
//        SpinLock spinLock = new SpinLockBad();
        SpinLock spinLock = new SpinLockGood();

        Runnable task = () -> {
            spinLock.lock();
            try {
                log("비즈니스 로직 실행");
                sleep(1);
            } finally {
                spinLock.unlock();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }

}
