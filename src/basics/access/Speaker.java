package basics.access;

/**
 * 접근 제어자의 종류
 * private: 모든 외부 호출을 막는다.
 * default(package-private): 같은 패키지 안에서의 호출은 허용한다.
 * protected: 같은 패키지 안에서의 호출은 허용한다. 패키지가 다르더라도 상속 관계의 호출은 허용한다.
 * public: 모든 외부 호출을 허용한다.
 */
public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 용량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량:" + volume);

    }
}
