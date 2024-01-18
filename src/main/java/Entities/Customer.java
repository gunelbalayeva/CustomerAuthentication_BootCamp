package Entities;

import Abstract.ICustomerService;
import org.w3c.dom.Entity;

import java.time.LocalDateTime;

public class Customer implements  ICustomerService {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private LocalDateTime dateOfBirth;

    public Customer(int id, String firstName, String lastName, String nationalityId, LocalDateTime dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void save(Customer customer) {

    }
}
