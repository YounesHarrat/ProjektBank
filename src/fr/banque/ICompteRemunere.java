package fr.banque;

public interface ICompteRemunere extends ICompte{

    double calculerInterets();
    void verserInterets();
    double getTaux();
    void setTaux(double unTaux);

}
