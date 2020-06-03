package GrupaC.demo.models;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import java.io.*;
import  java.text.*;
import  javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Oprema")

public class Oprema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer OpremaID;
    @Column(name = "Cena")
    private Integer Cena;
    @Column(name = "TipArtikla")
    private String TipArtikla;

    public Oprema()
    {

    }
    public Oprema(Integer opremaID, Integer cena, String tipArtikla) {
        OpremaID = opremaID;
        Cena = cena;
        TipArtikla = tipArtikla;

    }

    public String getTipArtikla() {
        return TipArtikla;
    }

    public void setTipArtikla(String tipArtikla) {
        TipArtikla = tipArtikla;
    }

    public Integer getCena() {
        return Cena;
    }

    public void setCena(Integer cena) {
        Cena = cena;
    }

    public Integer getOpremaID() {
        return OpremaID;
    }

    public void setOpremaID(Integer opremaID) {
        OpremaID = opremaID;
    }

}
