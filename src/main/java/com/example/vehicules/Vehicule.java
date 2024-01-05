package com.example.vehicules;
public abstract class Vehicule {
    private String reference;
    private String marque;
    private String modele;
    private String couleur;
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public Vehicule(String reference, String marque, String modele, String couleur) {
        this.reference = reference;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Vehicule [reference=" + reference + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur
                + "]";
    }
    
}