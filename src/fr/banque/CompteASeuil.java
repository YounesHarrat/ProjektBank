package fr.banque;

public class CompteASeuil extends Compte {
    //region Attributs
    /*
        représente le montant en dessous du quel le solde ne peut pas déscendre
    */
    private double seuil;
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
        return "CompteASeuil{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                ", seuil=" + this.getSeuil() +
                '}';
    }

    public void retirer(double uneValeur) {
        if ( this.getSeuil() < this.getSolde() - uneValeur) {
            this.setSolde(this.getSolde() - uneValeur);
            System.out.println("Vous venez de retirer "+ uneValeur + " depuis votre compte : "+ this.toString());
        } else {
            System.out.println("Vous ne pouvez pas retirer autant: seuil = "+ this.getSeuil() + " solde = "+ this.getSolde() + " vous souhaiter retirer : "+ uneValeur);
        }
    }
    //endregion

    //region Getters and Setters

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }


    //endregion
}
