package fr.banque;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // New Client
        Client yaharrat = new Client("Harrat", "Younes", 25, 111222333);
        // New Comptes
        CompteRemunere c1 = new CompteRemunere();
        Compte c2 = new CompteASeuil();
        Compte c3 = new Compte();
        Compte c4 = new CompteASeuilRemunere();
        Compte c5 = new CompteASeuilRemunere();
        // Add Comptes to Client
        try {
            yaharrat.ajouterCompte(c1);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            yaharrat.ajouterCompte(c2);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            yaharrat.ajouterCompte(c3);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            yaharrat.ajouterCompte(c4);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            yaharrat.ajouterCompte(c5);
        } catch (BanqueException e) {
            e.printStackTrace();
        }

        // Tests
        System.out.println((char)27 + "[32m" + yaharrat.toString());
        System.out.println("\n ");
        c1.ajouter(200);
        c1.setTaux(2.5d);
        c1.setTaux(0.5d);
        c2.setSeuil(250d);
        try {
            c2.retirer(900);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            c3.retirer(500);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            c4.retirer(150);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        try {
            c5.retirer(150);
        } catch (BanqueException e) {
            e.printStackTrace();
        }

        System.out.println((char)27 + "[31m");
        System.out.println(yaharrat.toString());
        System.out.println("Compte Client => " + yaharrat.getCompte(1));
        System.out.println("Compte Client => " + yaharrat.getCompte(11));

        System.out.println("\n"+(char)27 + "[33m" +"Liste des Comptes: Classe des Comptes :");
        for (int i = 0; i < yaharrat.getComptes().size(); i++) {
            Compte c = yaharrat.getComptes().get(i);
            System.out.println( c + " est une instance de " + c.getClass());
            if (c instanceof CompteRemunere) {
                System.out.println(c + " va percevoir des interets, solde: "+ c.getSolde());
                ((CompteRemunere) c).verserInterets();
                System.out.println(c + " a perçu des interets, solde: "+ c.getSolde());
            }
        }


        System.out.println("\n"+ (char)27 + "[32m" + yaharrat.toString()+"\n");
//        Main.test();
    }

    public static void test() {
        // ne gère pas automatiquement les fuseaux horaires
        Calendar calendar = Calendar.getInstance();
        Date maintenant = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("YY MM DD");
        System.out.println(maintenant);

        // gère automatiquement les fuseaux horaires;
        LocalDateTime time = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        System.out.println(time.toString());
        System.out.println(date.toString());

        // Tableaux Dynamique Java = Collection | ArrayList
        List<String> noms = new ArrayList<>();
        noms.add("toto");
        noms.add("titi");
        noms.forEach((n) -> {
            System.out.println(n);
        });

        // Liste Chainée = LinkedList
        List<Integer> chiffres = new LinkedList<>();
        Integer obj = 2;
        chiffres.add(1);
        chiffres.add(obj);
        chiffres.add(3);
        System.out.println(chiffres.toString());
        chiffres.remove(obj);
        // ou avec l'index de l'objet
        // chiffres.remove(1);
        System.out.println(chiffres.toString());


        // SET ne contient pas de doublons et n'es pas indexé, l'ordre des éléments contenu n'est pas garenti
        Set<Integer> setExemple = new HashSet<>();
        setExemple.add(2);
        setExemple.add(3);
        setExemple.add(5);
        setExemple.add(8);
        setExemple.add(13);
        setExemple.add(21);
        setExemple.add(34);
        setExemple.add(55);
        setExemple.add(89);
        setExemple.add(144);
        setExemple.add(233);
        setExemple.forEach(s -> {
//            System.out.println(s);
        });

        Set<Integer> treesetExemple = new TreeSet<>();
        treesetExemple.add(2);
        treesetExemple.add(3);
        treesetExemple.add(5);
        treesetExemple.add(8);
        treesetExemple.add(13);
        treesetExemple.add(21);
        treesetExemple.add(34);
        treesetExemple.add(55);
        treesetExemple.add(89);
        treesetExemple.add(144);
        treesetExemple.add(233);
        treesetExemple.forEach(s -> {
//            System.out.println(s);
        });

        // MAP , key value pair
        //Map< keyType, valueType>
        Map<String, Integer> mappy = new HashMap<>();
        Map<String, Integer> mappy1 = new IdentityHashMap<>();
        Map<String, Integer> mappy2 = new LinkedHashMap<>();
        Map<String, Integer> mappy3 = new TreeMap<>();
        mappy.put("toto", 2);
        mappy.put("toti", 2);
        mappy.put("toti", 4);

        mappy1.put("toto", 2);
        mappy1.put("toti", 2);
        mappy1.put("toti", 4);

        mappy2.put("toto", 2);
        mappy2.put("toti", 2);
        mappy2.put("toti", 4);

        mappy3.put("toto", 2);
        mappy3.put("toti", 2);
        mappy3.put("toti", 4);
        System.out.println("mappy");
        for (Map.Entry<String, Integer> entry: mappy.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("mappy1");
        for (Map.Entry<String, Integer> entry: mappy1.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("mappy2");
        for (Map.Entry<String, Integer> entry: mappy2.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("mappy3");
        for (Map.Entry<String, Integer> entry: mappy3.entrySet()) {
            System.out.println(entry);
        }
    }

}
