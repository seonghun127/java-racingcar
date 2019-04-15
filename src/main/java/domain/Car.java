/*
 * Car
 *
 * version 1.4
 *
 * 2019/04/02
 */

package domain;

/**
 * 자동차를 만들고 이동할 수 있는 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/02  자동차의 이동 여부를 결정하는 난수 발생 메소드 구현 / 난수값을 확인 후 자동차 이동 처리
 *          1.1 2019/04/02  자동차의 이동한 거리를 출력하는 메소드 구현
 *          1.2 2019/04/02  Car 클래스의 position을 외부에서 얻을 수 있는 get 메소드 구현
 *          1.3 2019/04/02  Car 클래스의 name을 외부에서 얻을 수 있는 get 메소드 구현
 *          1.4 2019/04/15  Car 클래스 생성자에 자동차 이름 길이에 대한 예외사항 처리 기능 추가 / 최대 이동 거리인지 여부를 확인하는 메소드 추가
 */
public class Car {
    private static final int CAR_NAME_LENGTH_MAX = 5;
    private static final int CAR_NAME_LENGTH_MIN = 0;
    private static final int MOVEMENT_CRITERIA = 4;

    private final String name;
    private int position = 0;

    Car(String name) {
        if (name.length() <= CAR_NAME_LENGTH_MIN || name.length() > CAR_NAME_LENGTH_MAX) {
            throw new IllegalArgumentException("범위에서 벗어난 이름이 있습니다.");
        }
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    int getPosition() {
        return this.position;
    }

    void moveCar(int randomNumber) {
        if (randomNumber >= MOVEMENT_CRITERIA) {
            ++this.position;
        }
    }

    boolean isMaxPosition(int maxDistance) {
        return this.position == maxDistance;
    }

    void printCarDistance() {
        System.out.print(this.name + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
