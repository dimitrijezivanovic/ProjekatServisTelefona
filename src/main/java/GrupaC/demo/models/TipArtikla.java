package GrupaC.demo.models;

import  javax.persistence.*;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Table(name="TipArtikla")

public class TipArtikla {
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="TelefonID")
//    private Set<Telefon> TelefonID;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ArtikalID;

    @OneToMany( mappedBy = "tip",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private Set<Oprema> opreme;

    @OneToMany( mappedBy = "tip",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private Set<Telefon> telefoni;




}
