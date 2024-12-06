package thread.cas.spinlock;

import java.util.concurrent.atomic.AtomicBoolean;

import static util.MyLogger.log;

public class SpinLockGood implements SpinLock {
    private final AtomicBoolean lock = new AtomicBoolean(false);

    @Override
    public void lock() {
        log("락 획득 시도");
        while (!lock.compareAndSet(false, true)) {
            log("락 획득 실패 - 스핀 대기");
        }
        log("락 획득 성공");
    }

    @Override
    public void unlock() {
        lock.set(false);
        log("락 반납 완료");
    }
}
