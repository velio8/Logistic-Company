package models;

import java.time.LocalDate;

public class Employee {

    private int id;
    private String name;
    private String qualification;
    private double salary;
    private LocalDate hireDate;
    private int companyId;

    public Employee() {}

    public Employee(int id, String name, String qualification, double salary, LocalDate hireDate, int companyId) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;
        this.hireDate = hireDate;
        this.companyId = companyId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }
}

