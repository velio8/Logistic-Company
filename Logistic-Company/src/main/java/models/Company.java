package models;

import java.math.BigDecimal;

public class Company {
    
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private BigDecimal totalRevenue;

    public Company() {}

    public Company(int id, String name, String address, String phone, String email, BigDecimal totalRevenue) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.totalRevenue = totalRevenue;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public BigDecimal getTotalRevenue() { return totalRevenue; }
    public void setTotalRevenue(BigDecimal totalRevenue) { this.totalRevenue = totalRevenue; }
}


