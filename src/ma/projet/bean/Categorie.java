package ma.projet.bean;

public class Categorie {
    private static int compteur = 0;
    private int id;
    private String libelle;
    private String code;

    // Constructeur d’initialisation
    public Categorie(String libelle, String code) {
        this.id = ++compteur;
        this.libelle = libelle;
        this.code = code;
    }

    // Getters / Setters
    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // toString
    @Override
    public String toString() {
        return "Categorie{id=" + id + ", libelle='" + libelle + "', code='" + code + "'}";
    }
}

