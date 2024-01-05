package com.example.Administration;

import java.sql.SQLException;
import java.util.LinkedList;

import com.example.dao.MinibusUtil;
import com.example.vehicules.Minibus;

public class AdministrationMinibus {
        public LinkedList<Minibus> RechercheParModele(String modele) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        MinibusUtil vu = new MinibusUtil();
        for(Minibus vo:vu.getMinibusByModele(modele)) {
            if(vo.getModele().equals(modele))
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Minibus> RechercheParMarque(String marque) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        MinibusUtil vu = new MinibusUtil();
        for(Minibus vo:vu.getMinibusByMarque(marque)) {
            if(vo.getMarque().equals(marque))
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Minibus> RechercheParReference(String reference) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        MinibusUtil vu = new MinibusUtil();
        for(Minibus vo:vu.getMinibusbyReference(reference)) {
            if(vo.getReference().equals(reference))
                voitures.add(vo);
        }
        return voitures;
    }
    public LinkedList<Minibus> RechercheParCouleur(String couleur) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        MinibusUtil vu = new MinibusUtil();
        for(Minibus vo:vu.getMinibusByCouleur(couleur)) {
            if(vo.getModele().equals(couleur))
                voitures.add(vo);
        }
        return voitures;
    }
    public boolean AjouterVehicule(Minibus v) throws SQLException {
        MinibusUtil vu = new MinibusUtil();
        return vu.addMinibus(v);
    }
    public boolean supprimerVehicule(Minibus v) throws SQLException {
        MinibusUtil vu = new MinibusUtil();
        return vu.deleteMinibus(v);
    }
}
