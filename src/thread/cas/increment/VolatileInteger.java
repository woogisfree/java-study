package thread.cas.increment;

/**
 * CPU의 캐시 메모리를 사용하지 않고 메인 메모리에 직접 접근
 */
public class VolatileInteger implements IncrementInteger {

    private volatile int value;

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int get() {
        return value;
    }
}
