package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteRemunere, ICompteSeuil {

    private Double seuil;

    public CompteASeuilRemunere() {
        this(Compte.getNbCompte(), 1000, 0.25, 50);
    }

    public CompteASeuilRemunere(Integer numero, double soldeInitial, double taux, double seuil) {
        super(numero, soldeInitial, taux);
        this.setSeuil(seuil);
    }

    @Override
    public Double getSeuil() {
        return this.seuil;
    }

    @Override
    public void setSeuil(Double unSeuil) {
        this.seuil = unSeuil;
    }
}
