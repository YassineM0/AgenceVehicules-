package com.example.vehicules;
public class Camionette extends Vehicule{
    private int chargeMax;

    public int getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(int chargeMax) {
        this.chargeMax = chargeMax;
    }

    public Camionette(String reference, String marque, String modele, String couleur, int chargeMax) {
        super(reference, marque, modele, couleur);
        this.chargeMax = chargeMax;
    }

    @Override
    public String toString() {
        return super.toString()+"Camionette [chargeMax=" + chargeMax + "]";
    }
    
}
