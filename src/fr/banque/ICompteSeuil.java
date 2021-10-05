package fr.banque;

public interface ICompteSeuil extends ICompte{

    void retirer(double uneValeur);
    Double getSeuil();
    void setSeuil(Double unSeuil);

}
