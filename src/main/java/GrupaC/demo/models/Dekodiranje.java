package GrupaC.demo.models;

import  javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Dekodiranje")

public class Dekodiranje {
    @Column(name = "Marka")
    private String Marka;
    @Column(name = "Model")
    private  String Model;
    @Column(name = "IMEI")
    private Integer IMEI;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="KorpaID")
    private Set<Korpa> notes;

    public Dekodiranje()
    {

    }
    public Dekodiranje(String marka, String model, Integer imei) {
        Marka = marka;
        Model = model;
        IMEI = imei;

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

    public Integer getIMEI() {
        return IMEI;
    }

    public void setIMEI(Integer IMEI) {
        this.IMEI = IMEI;
    }
}
