package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import com.example.vehicules.Minibus;
import com.example.vehicules.Voiture;

public class MinibusUtil {
    Connection con;

    public MinibusUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agence", "root", "nvmssg12");
    }

    public LinkedList<Minibus> getMinibusByNbPlaces(int nbPlaces) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele='" + nbPlaces + "'");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"), rs.getInt("nbPlaces"));
            voitures.add(v);
        }
        return voitures;
    }

    public LinkedList<Minibus> getMinibusByModele(String modele) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele='" + modele + "'");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("nbPlaces"));
            voitures.add(v);
        }
        return voitures;
    }

    public Boolean addMinibus(Minibus v) throws SQLException {
        Statement st = con.createStatement();
        String query = "insert into voiture (marque, modele, reference, couleur)" +
                "values ('" + v.getMarque() + "', '" + v.getModele() + "', '" + v.getReference() + "', '"
                + v.getCouleur() +"', '"+v.getNbPlaces()+ "');";
        int nbUpdate = st.executeUpdate(query);
        return nbUpdate > 0;
    }

    public LinkedList<Minibus> getMinibusbyReference(String reference) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele='" + reference + "'");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"), rs.getInt("nbPlaces"));
            voitures.add(v);
        }
        return voitures;
    }

    public LinkedList<Minibus> getMinibusByCouleur(String couleur) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele='" + couleur + "'");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("nbPlaces"));
            voitures.add(v);
        }
        return voitures;
    }
    public LinkedList<Minibus> getMinibusByMarque(String marque) throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele='" + marque + "'");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("nbPlaces"));
            voitures.add(v);
        }
     
        return voitures;
    }

    public LinkedList<Minibus> getAllMinibus() throws SQLException {
        LinkedList<Minibus> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture");
        while (rs.next()) {
            Minibus v = new Minibus(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("nbPlaces"));
            voitures.add(v);
        }
        return voitures;
    }

    public boolean deleteMinibus(Minibus v) throws SQLException {
        Statement st = con.createStatement();
        int rs = st.executeUpdate("delete from voiture where reference = '" + v.getReference() + "' and marque = '"
                + v.getMarque() + "' and modele = '" + v.getModele() + "' and couleur = '" + v.getCouleur() + "' and modele = '"+ v.getNbPlaces()+"';");
        return rs > 0;
    }

    public static void main(String[] args) throws SQLException {
        VoitureUtil vu = new VoitureUtil();
        Voiture v = new Voiture("dacia", "azd", "dacia", "red");
        vu.deleteCar(v);
    }
}