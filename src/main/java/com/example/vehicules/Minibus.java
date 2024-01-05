package com.example.vehicules;
public class Minibus extends Vehicule {
    private int nbPlaces;

    public Minibus(String reference, String marque, String modele, String couleur, int nbPlaces) {
        super(reference, marque, modele, couleur);
        this.nbPlaces = nbPlaces;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    @Override
    public String toString() {
        return super.toString()+"Minibus [nbPlaces=" + nbPlaces + "]";
    }
    
}
