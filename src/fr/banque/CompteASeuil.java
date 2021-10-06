package fr.banque;

import java.util.Optional;

public class CompteASeuil extends Compte implements ICompteSeuil{
    //region Attributs
    /*
        représente le montant en dessous du quel le solde ne peut pas déscendre
    */
    private Double seuil;
    //endregion

    //region Constructeurs

    public CompteASeuil() {
        this(Compte.getNbCompte(), 1000, 100);
    }

    public CompteASeuil(Integer numero, double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    //endregion

    //region Methods

    @Override
    public String toString() {
        return "CompteASeuil \n{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                ", seuil=" + this.getSeuil() +
                '}';
    }

    public void retirer(double uneValeur) throws BanqueException {
        if ( this.getSeuil() <= this.getSolde() - uneValeur) {
            this.setSolde(this.getSolde() - uneValeur);
            System.out.println("Vous venez de retirer "+ uneValeur + " depuis votre compte : "+ this.toString());
        } else {
            throw new BanqueException("Vous ne pouvez pas retirer autant: seuil = "+ this.getSeuil() + " solde = "+ this.getSolde() + " vous souhaiter retirer : "+ uneValeur);
        }
    }
    //endregion

    //region Getters and Setters

    public Double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(Double unSeuil) {
        this.seuil = unSeuil;
    }



    //endregion
}
