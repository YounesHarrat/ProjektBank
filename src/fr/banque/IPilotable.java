package fr.banque;

public interface IPilotable {
    static final int ALTITUDE_SECURITE = 18000;


    long getPuissance();
    void setPuissance(long puissanceCible);
    long getAltitude();
    void rentrerTrainAtterissage();
    void sortirTrainAtterissage();
    void inclinerVolets(long angle);
    void setPositionManche(long position);
    void virer(long angle);


    // depuis java 8, il est possible de définir une fonction dans une interface
    default void piquer() {
        
    }
}
