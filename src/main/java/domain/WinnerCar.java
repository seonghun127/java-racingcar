package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 우승자 자동차를 계산하는 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/15  우승 자동차를 계산하는 메소드 구현
 */
public class WinnerCar {
    private List<Car> cars;

    WinnerCar(List<Car> cars) {
        this.cars = cars;
    }

    int getMaxDistance() {
        int maxDistance = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxDistance) {
                maxDistance = car.getPosition();
            }
        }
        return maxDistance;
    }

    String getWinners(int maxDistance) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isMaxPosition(maxDistance)) {
                winners.add(car.getName());
            }
        }
        return String.join(",", winners);
    }
}
