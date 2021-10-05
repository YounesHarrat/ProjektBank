package fr.banque;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Compte c1 = new Compte();
        Compte c2 = new Compte();
        Compte c3 = new Compte();
        Compte c4 = new Compte();
        Compte c5 = new Compte();



        Client yaharrat = new Client("Harrat", "Younes", 25 , 111222333);
        yaharrat.ajouterCompte(c1);
        yaharrat.ajouterCompte(c2);
        yaharrat.ajouterCompte(c3);
        yaharrat.ajouterCompte(c4);
        yaharrat.ajouterCompte(c5);

        System.out.println(yaharrat.toString());

        c1.ajouter(200);
        c3.retirer(150);

        System.out.println(yaharrat.toString());
        System.out.println("Compte Client => " + yaharrat.getCompte(1) );

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());


    }
}
