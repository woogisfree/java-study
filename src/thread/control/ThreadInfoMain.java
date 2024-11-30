package thread.control;

import thread.start.HelloRunnable;

/**
 * [Thread.State]
 * NEW : 스레드가 생성되었으나 아직 시작되지 않은 상태
 * RUNNABLE : 스레드가 실행 중이거나 실행될 준비가 된 상태
 * BLOCKED : 스레드가 동기화 락을 기다리는 상태
 * WAITING : 스레드가 무기한으로 다른 스레드의 작업을 기다리는 상태
 * TIMED_WAITING : 스레드가 일정 시간 동안 다른 스레드의 작업을 기다리는 상
 * TERMINATED : 스레드의 실행이 완료된 상태
 */
public class ThreadInfoMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread = " + mainThread);
        System.out.println("mainThread.threadId() = " + mainThread.threadId());
        System.out.println("mainThread.getName() = " + mainThread.getName());
        System.out.println("mainThread.getPriority() = " + mainThread.getPriority());
        System.out.println("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        System.out.println("mainThread.getState() = " + mainThread.getState());

        // myThread
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        System.out.println("myThread = " + myThread);
        System.out.println("myThread.threadId() = " + myThread.threadId());
        System.out.println("myThread.getName() = " + myThread.getName());
        System.out.println("myThread.getPriority() = " + myThread.getPriority());
        System.out.println("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        System.out.println("myThread.getState() = " + myThread.getState());
    }
}
