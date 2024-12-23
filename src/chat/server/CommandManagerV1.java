package chat.server;

import java.io.IOException;

/**
 * 요구사항
 * 서버에 접속한 사용자는 모두 대화할 수 있어야 한다.
 * 다음과 같은 채팅 명령어가 있어야 한다.
 * 입장 `/join|{name}`
 * 처음 채팅 서버에 접속할 때 사용자의 이름을 입력해야 한다.
 * 메시지 `/message|{내용}`
 * 모든 사용자에게 메시지를 전달한다.
 * 이름 변경 `/change|{name}`
 * 사용자의 이름을 변경한다.
 * 전체 사용자 `/users`
 * 채팅 서버에 접속한 전체 사용자 목록을 출력한다.
 * 종료 `/exit`
 * 채팅 서버의 접속을 종료한다.
 */
public class CommandManagerV1 implements CommandManager {

    private final SessionManager sessionManager;

    public CommandManagerV1(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String totalMessage, Session session) throws IOException {
        if (totalMessage.startsWith("/exit")) {
            throw new IOException("exit");
        }

        sessionManager.sendAll(totalMessage);
    }
}
