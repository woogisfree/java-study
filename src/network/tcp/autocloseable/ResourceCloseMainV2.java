package network.tcp.autocloseable;

/**
 * close() 시점에 실수로 예외를 던지면, 이후 다른 자원을 닫을 수 없는 문제 발생
 * finally 블럭 안에서 자원을 닫을 때 예외가 발생하면, 핵심 예외가 `finally` 에서 발생한 부가 예외로 바뀌
 * 어 버린다. 그리고 핵심 예외가 사라진다.
 */
public class ResourceCloseMainV2 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            e.printStackTrace();
        }
    }

    private static void logic() throws CloseException, CallException {
        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;

        try {
            resource1 = new ResourceV1("resource1");
            resource2 = new ResourceV1("resource2");

            resource1.call();
            resource2.callEx();
        } catch (CallException e) {
            System.out.println("ex " + e);
            throw e;
        } finally {
            if (resource2 != null) {
                resource2.closeEx(); // CloseException 발생
            }
            if (resource1 != null) {
                resource1.closeEx(); // 호출 안됨
            }
        }
    }
}
