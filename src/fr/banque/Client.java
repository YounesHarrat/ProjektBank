package fr.banque;

import java.util.*;

public class Client {
    //region Attributs
    protected String nom, prenom;
    protected Integer age, numero;
//    protected Compte[] comptes = new Compte[5];
//    protected List<Compte> comptes = new ArrayList<Compte>();
    protected Map<Integer, Compte> comptes = new TreeMap<Integer, Compte>();
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
    public void ajouterCompte(Compte unCompte) throws BanqueException {

//        this.getComptes().add(unCompte); // for a List
        this.getComptes().put(unCompte.getNumero(), unCompte); // for a Map

//        for (int i = 0; i < this.getComptes().size(); i++) {
//            if (this.getComptes().get(i) == null) {
//                // System.out.println("il y a un emplacement de compte vide");
//                this.getComptes().add(unCompte);
//                // System.out.println("j'y place ce compte => " + this.comptes[i].toString());
//                return;
//            }
//        }
//        throw new BanqueException("Vous ne pouvez pas avoir plus de 5 comptes simultanément ! ");
    }

    public Compte getCompte(Integer numeroCompte) {
        for (int i = 0; i < this.getComptes().size(); i++) {
            Compte compte = this.getComptes().get(i);
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
        return "Client \n{" +
                "nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", age=" + this.getAge() +
                ", numero=" + this.getNumero() +
                ", comptes=" + this.comptesToString() +
                '}';
    }

    public String comptesToString() {
        String res = "";
        for (int i = 0; i < this.getComptes().size(); i++) {
            Compte c = this.getComptes().get(i);
            if ( null != c) {
                res += "\n" + c.toString();
            }
        }
        return res;
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

//    public Compte[] getComptes() {
//        return comptes;
//    }
//
//    public void setComptes(Compte[] comptes) {
//        this.comptes = comptes;
//    }

//    public List<Compte> getComptes() {
//        return comptes;
//    }
//
//    public void setComptes(List<Compte> comptes) {
//        this.comptes = comptes;
//    }

    public Map<Integer, Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Map<Integer, Compte> comptes) {
        this.comptes = comptes;
    }
    //endregion
}
