package GrupaC.demo.models;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import java.io.*;
import  java.text.*;
//import javax.jws.WebParam;
import  javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Telefon")

public class Telefon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TelefonID;
    @Column(name = "Marka")
    private String Marka;
    @Column(name = "Model")
    private String Model;
    @Column(name = "OperativniSistem")
    private String OperativniSistem;
    @ManyToOne
    private TipArtikla tip;

    public  Telefon()
    {

    }

    public Telefon(Integer telefonID, String marka, String model, String operativniSistem) {
        TelefonID = telefonID;
        Marka = marka;
        Model = model;
        OperativniSistem = operativniSistem;
    }


    public Integer getTelefonID() {
        return TelefonID;
    }

    public void setTelefonID(Integer telefonID) {
        TelefonID = telefonID;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getOperativniSistem() {
        return OperativniSistem;
    }

    public void setOperativniSistem(String operativniSistem) {
        OperativniSistem = operativniSistem;
    }


}