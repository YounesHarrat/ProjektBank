package fr.banque;

public class Compte implements ICompte{
    //region Static Attributs
    public static Integer nbCompte = 0;
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

    public void retirer(double unMontant) throws BanqueException {
        System.out.println("Compte::retirer::"+ this.getClass().getSimpleName() +" seuil: "+ this.getSeuil());

        if ( null != this.getSeuil()) {
            if (this.getSeuil() < this.getSolde() - unMontant) {
                this.setSolde(this.getSolde() - unMontant);
            } else {
                throw new BanqueException("Vous dépassé votre seuil de : "+ this.getSeuil());
            }
        } else {
            this.setSolde(this.getSolde() - unMontant);
            if (this.getSolde() < 0) {
                System.out.println("Attention Vous Passez en Négatif!");
            }
        }
    }


    @Override
    public String toString() {
        return "Compte : \n{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                '}';
    }
    //endregion

    //region Getters and Setters

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public Double getSeuil() {
        return null;
    }

    @Override
    public void setSeuil(Double unSolde) {

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
