package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * UserInterface 인터페이스 구현 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/15  사용자 화면에 보여질 화면 인터페이스 구현
 */
public class UserInterfaceImpl implements UserInterface {
    private static final int ROUND_COUNT_LIMIT = 0;
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분, 길이는 5이하만)");
        return SCANNER.nextLine().replaceAll(" ", "").trim().split(",");
    }

    @Override
    public int getRoundCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int roundCount = Integer.parseInt(SCANNER.nextLine());
        if (roundCount <= ROUND_COUNT_LIMIT) {
            throw new IllegalArgumentException("양수를 입력하세요.");
        }
        return roundCount;
    }

    @Override
    public void printResult() {
        System.out.println("실행결과\n");
    }

    @Override
    public void printWinners(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
