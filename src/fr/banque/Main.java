package fr.banque;

public class Main {

    public static void main(String[] args) {

        // New Client
        Client yaharrat = new Client("Harrat", "Younes", 25, 111222333);
        // New Comptes
        CompteRemunere c1 = new CompteRemunere();
        Compte c2 = new CompteRemunere();
        Compte c3 = new CompteRemunere();
        Compte c4 = new CompteASeuil(Compte.getNbCompte(), 1200, 150);
        Compte c5 = new CompteASeuil(Compte.getNbCompte(), 120, 150);
        // Add Comptes to Client
        yaharrat.ajouterCompte(c1);
        yaharrat.ajouterCompte(c2);
        yaharrat.ajouterCompte(c3);
        yaharrat.ajouterCompte(c4);
        yaharrat.ajouterCompte(c5);

        // Tests
        System.out.println((char)27 + "[32m" + yaharrat.toString());
        System.out.println("\n ");
        c1.ajouter(200);
        c1.setTaux(2.5d);
        c1.setTaux(0.5d);
        c1.retirer(1000);
        c4.retirer(150);
        c5.retirer(150);

        System.out.println((char)27 + "[31m");
        System.out.println(yaharrat.toString());
        System.out.println("Compte Client => " + yaharrat.getCompte(1));
        System.out.println("Compte Client => " + yaharrat.getCompte(11));

        System.out.println("\n"+(char)27 + "[33m" +"Liste des Comptes: Classe des Comptes :");
        for (Compte c: yaharrat.getComptes()) {
            System.out.println( c + " est une instance de " + c.getClass());
            if (c instanceof CompteRemunere) {
                System.out.println(c + "va percevoir des interets, solde: "+ c.getSolde());
                ((CompteRemunere) c).verserInterets();
                System.out.println(c + " a perçu des interets, solde: "+ c.getSolde());
            }
        }
    }
}
