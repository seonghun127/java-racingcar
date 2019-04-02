/*
 * Racing
 *
 * version 1.0
 *
 * 2019/04/02
 *
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 자동차 경주를 진행할 수 있는 클래스
 *
 * @author 김성훈
 * @version 1.0 2019/04/02 사용자로부터 자동차 이름, 이동 횟수를 입력 받는 메소드 구현 / 입력받은 자동차 이름으로 객체 생성
 */
public class Racing {
    private static Scanner sc = new Scanner(System.in);

    public String[] inputCarName() {
        String[] carNames;

        do{
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            carNames= sc.nextLine().replaceAll(" ", "").split(",");
        }while(hasCarNameException(carNames));

        return carNames;
    }

    public boolean hasCarNameException (String[] carNames) {
        for(String carName : carNames){
            if(carName.length() == 0 || carName.length() > 5) {
                System.out.println("자동차 이름이 잘못된 형식으로 입력됐습니다");
                return true;
            }
        }
        return false;
    }

    public List<Car> createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public int inputCount() {
        return sc.nextInt();
    }
}
