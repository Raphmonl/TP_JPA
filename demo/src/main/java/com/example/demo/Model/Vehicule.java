package com.example.demo.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicule {

    @Id
    @Column(name="plateNumber")
    private Integer idVehicule;
    private String plateNumber;
    List<Rent> rents = new ArrayList<Rent>();


    public Vehicule(String plateNumber) {

    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @OneToMany(mappedBy = "vehicule")
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Integer idVehicule) {
        this.idVehicule = idVehicule;
    }
}
