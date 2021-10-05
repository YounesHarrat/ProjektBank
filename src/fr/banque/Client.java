package fr.banque;

import java.util.Arrays;

public class Client {

    String nom, prenom;
    Integer age, numero;
    Compte[] comptes = new Compte[5];

    public Client() {

    }

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public void ajouterCompte( Compte unCompte) {
        int cpt = 0;
        for ( Compte compte: this.comptes ) {
            if (compte == null) {
                System.out.println("il y a un emplacement de compte vide");
                this.comptes[cpt] = unCompte;
                System.out.println("j'y place ce compte => "+ this.comptes[cpt].toString());
                return;
            }
            cpt++;
        }

    }

    public Compte getCompte(Integer numeroCompte) {
        for ( Compte compte: this.comptes ) {
            if (compte.numero == numeroCompte) {
                System.out.println("Compte:"+ numeroCompte+ " trouvé!");
                return compte;
            }
        }
        System.out.println("Aucun des comptes de ce Client ne correspond au numero de Compte:"+ numeroCompte);
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

    // Getter Setters

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
}
