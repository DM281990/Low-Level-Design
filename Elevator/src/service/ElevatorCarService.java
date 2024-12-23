package service;

import dto.ElevatorCar;
import dto.enums.Direction;

public class ElevatorCarService {
    public ElevatorCarService(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    ElevatorCar elevatorCar;

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = elevatorCar.currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                elevatorCar.currentFloor = startFloor;
                elevatorCar.setDisplay();
                elevatorCar.showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                elevatorCar.currentFloor = startFloor;
                elevatorCar.setDisplay();
                elevatorCar.showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }

}
