package service;

import dto.ElevatorCar;

public class InternalButtonsService {

    InternalDispatcherService dispatcher = new InternalDispatcherService();

    int[] availableButtons = {1,2,3,4,5,6,7,8,9,10};
    int buttonSelected;

    public void pressButton(int destination, ElevatorCar elevatorCar) {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }

}

