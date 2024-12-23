package dto;

import dto.enums.Direction;
import dto.enums.ElevatorState;
import service.ElevatorDoorService;
import service.InternalButtonsService;

public class ElevatorCar {

    public int id;
    ElevatorDisplay display;
    InternalButtonsService internalButtonsService;
    ElevatorState elevatorState;
    public int currentFloor;
    public Direction elevatorDirection;
    ElevatorDoorService elevatorDoorService;

    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButtonsService = new InternalButtonsService();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorDoorService = new ElevatorDoorService();

    }
    public void showDisplay() {
         display.showDisplay();
    }

    public void pressButton(int destination) {
        internalButtonsService.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, elevatorDirection);
    }


}

