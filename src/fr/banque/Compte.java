package fr.banque;

public class Compte {
    //region Static Attributs
    public static Integer nbCompte = 1;
    //endregion

    //region Attributs
    private Integer numero;
    private double solde;
    //endregion

    //region Constructeurs
    public Compte() {
        this(Compte.getNbCompte(), 1000);
        // this.numero = Compte.getNbCompte();
        // this.solde = 1000;
    }

    public Compte(Integer numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        Compte.setNbCompte(Compte.getNbCompte() + 1);
    }
    //endregion

    //region Methods

    public void ajouter(double unMontant) {
        this.setSolde(this.getSolde() + unMontant);
    }

    public void retirer(double unMontant) {
        this.setSolde(this.getSolde() - unMontant);
    }


    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }
    //endregion

    //region Getters and Setters

    public Integer getNumero() {
        return numero;
    }

    protected void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    protected void setSolde(double solde) {
        this.solde = solde;
    }
    //endregion

    //region Static Getter Setter
    public static Integer getNbCompte() {
        return nbCompte;
    }

    public static void setNbCompte(Integer nbCompte) {
        Compte.nbCompte = nbCompte;
    }
    //endregion
}
