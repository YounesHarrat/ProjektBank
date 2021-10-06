package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {
    //region Attributs
    /*
        Représente le pourcentage de rémunération du compte ( sa valeur est entre 0 et 1 )
     */
    private double taux;
    //endregion

    //region Constructeurs
    public CompteRemunere() {
        this(Compte.getNbCompte(), 1000, 0.1);
    }

    public CompteRemunere(Integer numero, double soldeInitial, double taux) {
        super(numero, soldeInitial);
        this.taux = taux;
    }
    //endregion

    //region Methods

    public double calculerInterets() {
        return this.getTaux() * this.getSolde();
    }

    public void verserInterets() {
        this.setSolde(this.getSolde() + this.calculerInterets());
    }

    @Override
    public String toString() {
        System.out.println();
        return this.getClass().getSimpleName()+":\n{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                ", taux=" + this.getTaux() +
                '}';
    }

    //endregion

    //region Getters and Setters

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        if (0 <= taux && taux <= 1) {
            this.taux = taux;
        } else {
            System.out.println("Le taux est une valeur entre 0 et 1 ");
        }
    }


    //endregion
}
