package com.example.Administration;
import java.sql.SQLException;
import java.util.LinkedList;

import com.example.dao.VoitureUtil;
import com.example.vehicules.Voiture;

public class AdministrationVoiture {
    public LinkedList<Voiture> RechercheParModele(String modele) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        VoitureUtil vu = new VoitureUtil();
        for(Voiture vo:vu.getVoitureByModele(modele)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Voiture> RechercheParMarque(String marque) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        VoitureUtil vu = new VoitureUtil();
        for(Voiture vo:vu.getVoitureByMarque(marque)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Voiture> RechercheParReference(String reference) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        VoitureUtil vu = new VoitureUtil();
        for(Voiture vo:vu.getVoiturebyReference(reference)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Voiture> RechercheParCouleur(String couleur) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        VoitureUtil vu = new VoitureUtil();
        for(Voiture vo:vu.getVoitureByCouleur(couleur)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public boolean AjouterVehicule(Voiture v) throws SQLException {
        VoitureUtil vu = new VoitureUtil();
        return vu.addCar(v);
    }
    public boolean supprimerVehicule(Voiture v) throws SQLException {
        VoitureUtil vu = new VoitureUtil();
        return vu.deleteCar(v);
    }
    public static void main(String[] args) throws SQLException {
        AdministrationVoiture vu = new AdministrationVoiture();
        System.out.println("zafaz,");
        Voiture vv = new Voiture("nn","nn","nn","nn");
        vu.AjouterVehicule(vv);
        for(Voiture v : vu.RechercheParModele("bbbb")) {
            System.out.println(v.getMarque() + v.getModele()+v.getReference());
        }
    }
}
