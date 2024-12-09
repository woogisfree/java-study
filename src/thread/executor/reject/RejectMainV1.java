package thread.executor.reject;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static util.MyLogger.log;

/**
 * Executor 예외 정책 - AbortPolicy : 요청을 처리할 수 없을 때 예외를 발생시키는 정책
 */
public class RejectMainV1 {

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(
                1, 1, 0, TimeUnit.SECONDS,
                new SynchronousQueue<>(), new ThreadPoolExecutor.AbortPolicy());

        executor.submit(new RunnableTask("task1"));

        try {
            executor.submit(new RunnableTask("task2"));
        } catch (RejectedExecutionException e) {
            log("요청 초과");
            log(e);
        }
        executor.close();
    }
}
