package dto;

import dto.enums.Direction;
import service.ExternalDispatcherService;

public class Floor {
    int floorNumber;
    ExternalDispatcherService externalDispatcherService;


    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        externalDispatcherService = new ExternalDispatcherService();
    }
    public void pressButton(Direction direction) {

        externalDispatcherService.submitExternalRequest(floorNumber, direction);
    }
}
