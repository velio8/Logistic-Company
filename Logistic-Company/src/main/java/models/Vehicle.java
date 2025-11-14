package models;

public class Vehicle {
    private int id;
    private String type;
    private String model;
    private String registerNumber;
    private double capacity;
    private String status;
    private int companyId;

    public Vehicle() {}

    public Vehicle(int id, String type, String model, String registerNumber, double capacity, String status, int companyId) {
        this.id = id;
        this.type = type;
        this.registerNumber = registerNumber;
        this.model = model;
        this.capacity = capacity;
        this.status = status;
        this.companyId = companyId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getRegisterNumber() { return registerNumber; }
    public void setRegisterNumber(String registerNumber) { this.registerNumber = registerNumber; }

    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }

    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

