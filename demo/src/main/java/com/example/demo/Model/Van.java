package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{

    @Column(name="maxWeight")
    private Integer maxWeight;

    public Van(String plateNumber, Integer maxWeight) {
        super(plateNumber);
        this.maxWeight = maxWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }
}
