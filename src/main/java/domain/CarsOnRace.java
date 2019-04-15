package domain;

import java.util.List;

/**
 * 자동차 경주에 참여하는 자동차들을 관리하는 클래스
 *
 * @author 김성훈
 * @version 1.0
 */
public class CarsOnRace {
    private List<Car> carsOnRace;
    private int roundCount;

    CarsOnRace(List<Car> carsOnRace, int roundCount) {
        this.carsOnRace = carsOnRace;
        this.roundCount = roundCount;
    }

    private void movementOfAllCars() {
        for (Car car : carsOnRace) {
            car.moveCar(RandomNumberGenerator.generateRandomNumber());
            car.printCarDistance();
        }
    }

    List<Car> movementOfAllCarsByRoundCount() {
        for (int i = 0; i < roundCount; i++) {
            movementOfAllCars();
            System.out.println();
        }
        return carsOnRace;
    }
}
