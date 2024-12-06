package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println(list.getClass());
        System.out.println("list = " + list);
    }

    /**
     * 동시성 컬렉션의 종류
     * List
     *  - CopyOnWriteArrayList -> ArrayList의 대안
     * Set
     *  - CopyOnWriteArraySet -> HashSet의 대안
     *  - ConcurrentSkipListSet -> TreeSet의 대안
     * Map
     *  - ConcurrentHashMap -> HashMap의 대안
     *  - ConcurrentSkipListMap -> TreeMap의 대안
     * Queue
     *  - ConcurrentLinkedQueue -> LinkedList의 대안
     * Deque
     *  - ConcurrentLinkedDeque -> LinkedList의 대안
     * BlockingQueue
     *  - ArrayBlockingQueue : 크기 고정, fair 모드 사용 가능
     *  - LinkedBlockingQueue : 크기가 무한하거나 고정
     *  - PriorityBlockingQueue : 우선순위가 높은 요소를 먼저 처리
     *  - DelayQueue : 지연된 요소를 처리, 각 요소는 지정된 시간이 지나면 사용 가능, 스케줄링 작업에 이용
     *  - SynchronousQueue : 데이터를 저장하지 않음, 스레드간 데이터를 전달하는 용도
     */
}
