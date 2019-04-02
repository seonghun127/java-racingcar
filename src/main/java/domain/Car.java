/*
 * Car
 *
 * version 1.3
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
 */
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public int makeRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public void moveCar(int randomNumber) {
        if (4 <= randomNumber && randomNumber <= 9) {
            ++this.position;
        }
    }

    public void printTotalDistance() {
        System.out.print(this.name + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
