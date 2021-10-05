package fr.banque;

import java.util.Arrays;

public class Client {
    //region Attributs
    protected String nom, prenom;
    protected Integer age, numero;
    protected Compte[] comptes = new Compte[5];
    //endregion

    //region Constructeurs
    public Client() {

    }

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }
    //endregion

    //region Methods
    public void ajouterCompte(Compte unCompte) {
        for (int i = 0; i < this.comptes.length; i++) {
            if (this.comptes[i] == null) {
                // System.out.println("il y a un emplacement de compte vide");
                this.comptes[i] = unCompte;
                // System.out.println("j'y place ce compte => " + this.comptes[i].toString());
                return;
            }
        }
        System.out.println("Vous ne pouvez pas avoir plus de 5 comptes simultanément ! ");
    }

    public Compte getCompte(Integer numeroCompte) {
        for (Compte compte : this.comptes) {
            if (compte.getNumero() == numeroCompte) {
                System.out.println("Compte:" + numeroCompte + " trouvé!");
                return compte;
            }
        }
        System.out.println("Aucun des comptes de ce Client ne correspond au numero de Compte:" + numeroCompte);
        return null;
    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
    //endregion

    //region Getters and Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
    //endregion
}
