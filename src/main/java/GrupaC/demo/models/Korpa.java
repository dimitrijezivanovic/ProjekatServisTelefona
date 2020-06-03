package GrupaC.demo.models;

import  javax.persistence.*;
import java.util.*;


@Entity
@Table(name="Korpa")



public class Korpa {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer korpaID;

    @Column(name = "brojArtikala")
    private Integer brojArtikala;
    @Column(name = "Cena")
    private Double Cena;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="KorisnikID")
//    private Set<Korisnik> IDKorisnika;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="TelefonID")
    private Set<Telefon> TelefonID;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OpremaID")
    private Set<Oprema> IDOpreme;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="DekodiranjeID")
    private Set<Telefon> DekodiranjeID;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="KorisnikID")
    private Set<Telefon> KorisnikID;





    public Korpa()
    {

    }

    public Korpa(int korpaID,int brojArtikala,double Cena)
    {
        this.korpaID=korpaID;
        this.brojArtikala=brojArtikala;
        this.Cena=Cena;
    }


    public Integer getKorpaID() {
        return korpaID;
    }

    public void setKorpaID(Integer korpaID) {
        this.korpaID = korpaID;
    }

    public Integer getBrojArtikala() {
        return brojArtikala;
    }

    public void setBrojArtikala(Integer brojArtikala) {
        this.brojArtikala = brojArtikala;
    }

    public Double getCena() {
        return Cena;
    }

    public void setCena(Double cena) {
        Cena = cena;
    }

}