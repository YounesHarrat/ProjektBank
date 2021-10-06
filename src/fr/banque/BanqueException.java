package fr.banque;

public class BanqueException extends Exception {
    final static long serialVersionUID = 1L;

    //region Constructeurs
    public BanqueException() {
    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(Throwable cause) {
        super(cause);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }
    //endregion

    // Getter
    private long getSerialVersionUID() {
        return serialVersionUID;
    }
}
