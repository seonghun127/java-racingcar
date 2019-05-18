/*
 * AppMain.java
 *
 * version 1.2
 *
 * 2019/04/02
 */

package domain;

/**
 * 자동차 경주 게임을 진행할 수 있는 main 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/02  main 클래스 생성
 *          1.1 2019/04/02  프로그래밍 요구사항에 맞게 구현될 수 있도록 메소드 호출
 *          1.2 2019/04/15  main 클래스 로케이션 변경 (domain package 안으로) / Game 객체로만 게임 실행
 */
public class AppMain {
    public static void main(String[] args) {
        Game game = new Game(new UserInterfaceImpl());
        game.play();
    }
}
