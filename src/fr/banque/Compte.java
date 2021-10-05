package fr.banque;

public class Compte {

    // Static
    public static Integer nbCompte = 1;

    // Attributs

    Integer numero;
    double solde;

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

    //region Getter Setter

    public Integer getNumero() {
        return numero;
    }

    protected void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }
    //endregion

    //region static getter setter
    public static Integer getNbCompte() {
        return nbCompte;
    }

    public static void setNbCompte(Integer nbCompte) {
        Compte.nbCompte = nbCompte;
    }
    //endregion
}
