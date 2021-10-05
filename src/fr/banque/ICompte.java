package fr.banque;

public interface ICompte {

    //region Methods
    // Prototypes

    void ajouter(double unMontant);
    void retirer(double unMontant);
    //endregion


    //region Getter Setter
    //

    Integer getNumero();
    void setNumero(Integer numero);
    double getSolde();
    void setSolde(double unSolde);

    Double getSeuil();
    void setSeuil(Double unSolde);


    //endregion

}
