package metier.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTOS")
public class Moto implements Serializable {
    @Id
    @Column(name = "ID_MOTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMoto;
    
    @Column(name = "NOM_MOTO")
    private String nomMoto;
    
    private double prix;

    public Moto() {
        super();
    }

    public Moto(String nomMoto, double prix) {
        super();
        this.nomMoto = nomMoto;
        this.prix = prix;
    }

    public Long getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(Long idMoto) {
        this.idMoto = idMoto;
    }

    public String getNomMoto() {
        return nomMoto;
    }

    public void setNomMoto(String nomMoto) {
        this.nomMoto = nomMoto;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
