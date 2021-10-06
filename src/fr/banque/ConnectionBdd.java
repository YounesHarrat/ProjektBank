package fr.banque;

public class ConnectionBdd {

    private static ConnectionBdd instance = null;

    private ConnectionBdd() {
    }

    public static ConnectionBdd getInstance() {
        if ( ConnectionBdd.instance == null) {
            ConnectionBdd.instance = new ConnectionBdd();

        }
        return ConnectionBdd.instance;
    }
}
