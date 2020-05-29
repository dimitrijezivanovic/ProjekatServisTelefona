package GrupaC.demo.models;
import  javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Korisnik")

public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer KorisnikID;
    @Column(name = "Mail")
    private String Mail;
    @Column(name = "Sifra")
    private String Sifra;
    @Column(name = "Ime")
    private String Ime;
    @Column(name = "Prezime")
    private String Prezime;
    @Column(name = "Adresa")
    private String Adresa;
    @Column(name = "DatumRodjenja")
    private Date DatumRodjenja;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="KorpaID")
    private Set<Korpa> notes;



    public Korisnik()
    {

    }


    public Korisnik(Integer korisnikID, String mail, String sifra, String ime, String prezime, String adresa, Date datumRodjenja) {
        KorisnikID = korisnikID;
        Mail = mail;
        Sifra = sifra;
        Ime = ime;
        Prezime = prezime;
        Adresa = adresa;
        DatumRodjenja = datumRodjenja;
    }

    public Integer getKorisnikID() {
        return KorisnikID;
    }

    public void setKorisnikID(Integer korisnikID) {
        KorisnikID = korisnikID;
    }
    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        Mail = Mail;
    }
    public Date getDatum(){
        return DatumRodjenja;
    }
    public void setDatum(Date DatumRodjenja){
        DatumRodjenja = DatumRodjenja;
    }


    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getSifra() {
        return Sifra;
    }

    public void setSifra(String sifra) {
        Sifra = sifra;
    }

}
