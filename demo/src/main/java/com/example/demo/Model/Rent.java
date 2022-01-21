package com.example.demo.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Rent {

    Integer idRent;
    String beginRent;
    String endRent;
    Vehicule vehicule;
    Person person;


    public Rent() {
    }

    public Rent(String beginRent, String endRent, Vehicule vehicule, Person person) {
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.vehicule = vehicule;
        this.person = person;
    }

    public String getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(String beginRent) {
        this.beginRent = beginRent;
    }

    public String getEndRent() {
        return endRent;
    }

    public void setEndRent(String endRent) {
        this.endRent = endRent;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdRent() {
        return idRent;
    }

    public void setIdRent(Integer idRent) {
        this.idRent = idRent;
    }
}
