package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockBad implements SpinLock {
    private volatile boolean lock = false;

    @Override
    public void lock() {
        log("락 획득 시도");
        while (true) {
            if (!lock) {
                sleep(100);
                lock = true;
                break;
            } else {
                log("락 획득 실패 - 스핀 대기");
            }
        }
        log("락 획득 성공");
    }

    @Override
    public void unlock() {
        lock = false;
        log("락 반납 완료");
    }
}
