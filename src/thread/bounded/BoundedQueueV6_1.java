package thread.bounded;

import java.util.concurrent.BlockingQueue;

public class BoundedQueueV6_1 implements BoundedQueue {

    private BlockingQueue<String> queue;

    @Override
    public void put(String data) {

    }

    @Override
    public String take() {
        return "";
    }
}
