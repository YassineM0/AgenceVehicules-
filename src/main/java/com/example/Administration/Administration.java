package com.example.Administration;
import com.example.vehicules.*;
import java.util.LinkedList;

  interface   Administration<T extends Vehicule> {
    
    abstract LinkedList<T> RechercheParModele(String modele);
    abstract T RechercheParReference(String reference);
    abstract LinkedList<T>  RechercheParCouleur(String couleur);
    abstract boolean AjouterVehicule(T vehicule);
    abstract boolean SupprimerVehicule(T vehicule);
    abstract LinkedList<T>  getallVehicules();
     
}

    

