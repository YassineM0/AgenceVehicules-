package com.example.vehicules;
public class Voiture extends Vehicule {
    public Voiture(String reference, String marque, String modele, String couleur) {
        super(reference, marque, modele, couleur);
    }

    @Override
    public String toString() {
        return super.toString()+"Voiture []";
    }
    
}

