package GrupaC.demo;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import java.io.*;
import  java.text.*;
import  javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Prodavnica")
public class Korpa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int korpaID;

    @Column(name = "brojArtikala")
    private int brojArtikala;

    @Column(name = "Cena")
    private double Cena;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="KorisnikID")
    private Set<KorisnikID> notes;


    public Korpa()
    {

    }
    public Korpa(int korpaID,int brojArtikala,double Cena)
    {
        this.korpaID=korpaID;
        this.brojArtikala=brojArtikala;
        this.Cena=Cena;
    }



}