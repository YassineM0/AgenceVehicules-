package com.example.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.example.vehicules.Voiture;

public class VoitureUtil {
    Connection con;

    public VoitureUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agence", "root", "nvmssg12");
    }

    public LinkedList<Voiture> getVoitureByModele(String modele) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where modele like '" + modele + "'");
        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"));
            voitures.add(v);
        }
        return voitures;
    }

    public Boolean addCar(Voiture v) throws SQLException {
        Statement st = con.createStatement();
        String query = "insert into voiture (marque, modele, reference, couleur)" +
                "values ('" + v.getMarque() + "', '" + v.getModele() + "', '" + v.getReference() + "', '"
                + v.getCouleur() + "');";
        int nbUpdate = st.executeUpdate(query);
        return nbUpdate > 0;
    }

    public LinkedList<Voiture> getVoiturebyReference(String reference) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where reference='" + reference + "'");
        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"));
            voitures.add(v);
        }
        System.out.println(voitures.size());
        return voitures;
    }

    public LinkedList<Voiture> getVoitureByCouleur(String couleur) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where couleur='" + couleur + "'");
        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"));
            voitures.add(v);
        }
        return voitures;
    }
    public LinkedList<Voiture> getVoitureByMarque(String marque) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture where marque='" + marque + "'");
        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"));
            voitures.add(v);
        }
        return voitures;
    }

    public LinkedList<Voiture> getAllCars() throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from voiture");
        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"));
            voitures.add(v);
        }
        return voitures;
    }

    public boolean deleteCar(Voiture v) throws SQLException {
        Statement st = con.createStatement();
        int rs = st.executeUpdate("delete from voiture where reference = '" + v.getReference() + "' and marque = '"
                + v.getMarque() + "' and modele = '" + v.getModele() + "' and couleur = '" + v.getCouleur() + "';");
        return rs > 0;
    }

    public static void main(String[] args) throws SQLException {
        VoitureUtil vu = new VoitureUtil();
        Voiture v = new Voiture("aa", "za", "bbbb", "zzzytttd");
        vu.addCar(v);
    }

}
