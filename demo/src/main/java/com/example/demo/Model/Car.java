package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {

    @Column(name="numberOfSeats")
    private Integer numberOfSeats;


    public Car(String plateNumber) {
        super(plateNumber);
    }

    public Car(String plateNumber, Integer numberOfSeats) {
        super(plateNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
