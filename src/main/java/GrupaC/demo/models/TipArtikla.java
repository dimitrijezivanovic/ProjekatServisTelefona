package GrupaC.demo.models;

import  javax.persistence.*;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name="TipArtikla")

public class TipArtikla {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OpremaID")
    private Set<Oprema> notes;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="TelefonID")
    private Set<Telefon> notes1;




}
