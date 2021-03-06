package domain;

/**
 * 랜덤 숫자를 발생시키는 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/15  범위(0 ~ 9)에 맞는 난수 발생시키는 메소드 구현
 */
public class RandomNumberGenerator {
    private static final int RANDOM_NUMBER_RANGE_MAX = 10;
    private static final int RANDOM_NUMBER_RANGE_MIN = 0;

    /* 난수 발생 메소드는 인스턴스화 호출이 필요없다고 판단되어 static 으로 선언 (바로 호출) */
    static int generateRandomNumber() {
        int randomNumber = (int) (Math.random() * RANDOM_NUMBER_RANGE_MAX);
        if (randomNumber < RANDOM_NUMBER_RANGE_MIN || randomNumber >= RANDOM_NUMBER_RANGE_MAX) {
            throw new IllegalArgumentException();
        }
        return randomNumber;
    }
}
