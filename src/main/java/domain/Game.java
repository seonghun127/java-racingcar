/*
 * Game
 *
 * version 1.6
 *
 * 2019/04/02
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동차 경주를 진행할 수 있는 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/02  사용자로부터 자동차 이름, 이동 회수를 입력 받는 메소드 구현 / 입력받은 자동차 이름으로 객체 생성
 *          1.1 2019/04/02  입력받은 자동차 이름에 빈칸 제거 / 이름 길이에 오류가 난 경우 다시 입력 받게 처리
 *          1.2 2019/04/02  자동차들중에서 제일 큰 position 값을 구하는 메소드 구현 / 시도할 회수를 받는 메소드 재 구현
 *          1.3 2019/04/02  우승자를 계산하는 메소드 구현
 *          1.4 2019/04/02  경주중인 모든 자동차가 난수에 의해 이동하는 메소드 구현 / 우승자 출력 메소드 구현
 *          1.5 2019/04/02  이동 회수에 숫자 외의 값이 입력됐을 때 다시 입력을 받는 메소드 구현
 *          1.6 2019/04/15  Game이라는 클래스로 번경 -> 자동차 입력 / 시도 횟수 입력 / 난수 발생 / 자동차 이동 / 실행결과 출력 메소드 구현
 */
public class Game {
    private UserInterface userInterface;
    private RandomNumberGenerator randomNumberGenerator;

    Game(UserInterface userInterface, RandomNumberGenerator randomNumberGenerator) {
        this.userInterface = userInterface;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    void play() {
        WinnerCar winnerCar = new WinnerCar(movementOfAllCarsByRound(setCars(), setRoundCount()));
        userInterface.printWinners(winnerCar.getWinners(winnerCar.getMaxDistance()));
    }

    private List<Car> setCars() {
        try {
            List<Car> cars = new ArrayList<>();
            for (String carName : userInterface.getCarNames()) {
                cars.add(new Car(carName));
            }
            return cars;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return setCars();
        }
    }

    private int setRoundCount() {
        try {
            return userInterface.getRoundCount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return setRoundCount();
        }
    }

    private List<Car> movementOfAllCarsByRound(List<Car> cars, int roundCount) {
        System.out.println("실행결과\n");
        for (int i = 0; i < roundCount; i++) {
            printCarsPositionEachRound(movementOfAllCars(cars));
            System.out.println();
        }
        return cars;
    }

    private List<Car> movementOfAllCars(List<Car> cars) {
        for (Car car : cars) {
            car.moveCar(randomNumberGenerator.generateRandomNumber());
        }
        return cars;
    }

    private void printCarsPositionEachRound(List<Car> cars) {
        for (Car car : cars) {
            userInterface.printResult(car);
        }
    }
}
