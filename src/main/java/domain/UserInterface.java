package domain;

/**
 * 사용자에게 보여지는 화면의 인터페이스를 담당
 *
 * @author 김성훈
 * @version 1.0
 */
public interface UserInterface {
    String[] getCarNames() throws IllegalArgumentException;     // 자동차 이름 입력

    int getRoundCount() throws IllegalArgumentException;       // 시도할 회수 입력

    void printResult();                                  // 실행 결과 출력

    void printWinners(String winners);                          // 우승자 출력
}
