package com.example.Administration;

import java.sql.SQLException;
import java.util.LinkedList;

import com.example.dao.CamionetteUtil;
import com.example.vehicules.Camionette;

public class AdministrationCamionnette {
    public LinkedList<Camionette> RechercheParModele(String modele) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        CamionetteUtil vu = new CamionetteUtil();
        for(Camionette vo:vu.getCamionetteByModele(modele)) {
                voitures.add(vo);
        }
        System.out.println(voitures.size());
        return voitures;
    }
    public LinkedList<Camionette> RechercheParMarque(String marque) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        CamionetteUtil vu = new CamionetteUtil();
        for(Camionette vo:vu.getCamionetteByMarque(marque)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Camionette> RechercheParReference(String reference) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        CamionetteUtil vu = new CamionetteUtil();
        for(Camionette vo:vu.getCamionetteByReference(reference)) {
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Camionette> RechercheParCouleur(String couleur) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        CamionetteUtil vu = new CamionetteUtil();
        for(Camionette vo:vu.getCamionetteByCouleur(couleur)) {
                voitures.add(vo);
        }
        return voitures;
    }
    
  
    public boolean AjouterCamionette(Camionette v) throws SQLException {
        CamionetteUtil vu = new CamionetteUtil();
        return vu.addCammionette(v);
    }
    public boolean supprimerCamionette(Camionette v) throws SQLException {
        CamionetteUtil vu = new CamionetteUtil();
        return vu.deleteCamionette(v);
    }
}
