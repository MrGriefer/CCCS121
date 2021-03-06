package customer;

import vehicle.Vehicle;

public class Customer {

    private int customerId;
    private String name;
    private String phoneNumber;
    private Vehicle vehicle;

    public Customer() {}

    public Customer(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isRentingVehicle() {
        return vehicle != null;
    }

    public String toString() {
        return customerId + ", " + name + ", " + phoneNumber;
    }
}
