package service;

import controller.ElevatorController;
import dto.ElevatorCar;

import java.util.List;

public class InternalDispatcherService {

    List<ElevatorController> elevatorControllerList = ElevatorCreatorService.elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){

    }
}
