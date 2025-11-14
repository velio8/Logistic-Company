package models;

import java.time.LocalDate;

public class Transport {

    private int id;
    private String startPoint;
    private String endPoint;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String cargoDescription;
    private double totalWeight;
    private double price;
    private int clientId;
    private int vehicleId;
    private int driverId;
    private boolean hasPaid;

    public Transport() {}

    public Transport (int id, String startPoint, String endPoint, LocalDate departureDate, LocalDate arrivalDate, String cargoDescription, double totalWeight, double price, int clientId, int vehicleId, int driverId, boolean hasPaid) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.cargoDescription = String.valueOf(cargoDescription);
        this.totalWeight = totalWeight;
        this.price = price;
        this.clientId = clientId;
        this.vehicleId = vehicleId;
        this.driverId = driverId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getStartPoint() { return startPoint; }
    public void setStartPoint(String startPoint) { this.startPoint = startPoint; }

    public String getEndPoint() { return endPoint; }
    public void setEndPoint(String endPoint) { this.endPoint = endPoint; }

    public java.time.LocalDate getDepartureDate() { return departureDate; }
    public void setDepartureDate(java.time.LocalDate departureDate) { this.departureDate = departureDate; }

    public java.time.LocalDate getArrivalDate() { return arrivalDate; }
    public void setArrivalDate(java.time.LocalDate arrivalDate) { this.arrivalDate = arrivalDate; }

    public String getCargoDescription() { return cargoDescription; }
    public void setCargoDescription(String cargoDescription) { this.cargoDescription = cargoDescription; }

    public double getTotalWeight() { return totalWeight; }
    public void setTotalWeight(double totalWeight) { this.totalWeight = totalWeight; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public int getDriverId() { return driverId; }
    public void setDriverId(int driverId) { this.driverId = driverId; }

    public boolean isPaid() {return hasPaid; }
    public void setPaid(boolean paid) { this.hasPaid = paid; }
}

