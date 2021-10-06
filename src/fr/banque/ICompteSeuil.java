package fr.banque;

public interface ICompteSeuil extends ICompte {

    void retirer(double uneValeur) throws BanqueException;
    Double getSeuil();
    void setSeuil(Double unSeuil);

}
