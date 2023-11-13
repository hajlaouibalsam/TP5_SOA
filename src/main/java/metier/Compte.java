package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte
{
    private int code ;
    private double solde ;
    @XmlTransient
    private String dateDeCreation ;

    public Compte(int code , double solde , String dateDeCreation)
    {
        this.code=code;
        this.solde=solde;
        this.dateDeCreation=dateDeCreation;
    }

    public Compte()
    {
        code=0;
        solde=0;
        dateDeCreation="";
    }

    public double getSolde() {
        return solde;
    }

    public int getCode() {
        return code;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }
}