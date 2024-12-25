package entity.parking;

import eception.InvalidSlotNumberException;
import eception.NoEmptySlotAvailable;
import eception.VehicleNotFoundException;
import entity.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class Parking  {
  private static Parking parkingLot;
public int floorNumber;
public List<Slot> slots;


private Parking(int floorNumber) {
    this.floorNumber = floorNumber;
    this.slots = new ArrayList<>();
}

public static Parking getParkingFloor(int floorNumber) {
    if (parkingLot == null)
        parkingLot = new Parking(floorNumber);
    return parkingLot;
}

public static void clearAll() {
    parkingLot = null;
}

}