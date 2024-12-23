package entity.location;

import dto.enums.VehicleType;
import entity.booking.Reservation;
import entity.inventory.VehicleInventoryManagement;
import entity.user.User;
import entity.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();


    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventoryManagement.getVehicles();
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation

}
