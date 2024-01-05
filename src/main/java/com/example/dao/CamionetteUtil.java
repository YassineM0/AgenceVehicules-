package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import com.example.vehicules.Camionette;

public class CamionetteUtil {
    Connection con;

    public CamionetteUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agence", "root", "nvmssg12");
    }

    public LinkedList<Camionette> getCamionetteByModele(String modele) throws SQLException {
        LinkedList<Camionette> camionettes = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from camionnette where modele='" + modele + "'");
        while (rs.next()) {
            Camionette c = new Camionette(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("chargeMax"));
            camionettes.add(c);
        }
        System.out.println(camionettes.size());
        return camionettes;
    }
    public LinkedList<Camionette> getCamionetteByMarque(String marque) throws SQLException {
        LinkedList<Camionette> camionettes = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from camionnette where marque='" + marque + "'");
        while (rs.next()) {
            Camionette c = new Camionette(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("chargeMax"));
            camionettes.add(c);
        }
        return camionettes;
    }

    public Boolean addCammionette(Camionette v) throws SQLException {
        Statement st = con.createStatement();
        String query = "insert into camionnette (marque, modele, reference, couleur)" +
                "values ('" + v.getMarque() + "', '" + v.getModele() + "', '" + v.getReference() + "', '"
                + v.getCouleur() + "',' "+v.getChargeMax()+ "');";
        int nbUpdate = st.executeUpdate(query);
        return nbUpdate > 0;
    }

    public LinkedList<Camionette> getCamionetteByReference(String reference) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from camionnette where reference='" + reference + "'");
        while (rs.next()) {
            Camionette v = new Camionette(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("chargeMax"));
            voitures.add(v);
        }
        return voitures;
    }

    public LinkedList<Camionette> getCamionetteByCouleur(String couleur) throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from camionnette where couleur='" + couleur + "'");
        while (rs.next()) {
            Camionette v = new Camionette(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("chargeMax"));
            voitures.add(v);
        }
        return voitures;
    }


    public LinkedList<Camionette> getAllCamionettes() throws SQLException {
        LinkedList<Camionette> voitures = new LinkedList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from camionnette");
        while (rs.next()) {
            Camionette v = new Camionette(rs.getString("marque"), rs.getString("modele"), rs.getString("reference"),
                    rs.getString("couleur"),rs.getInt("chargeMax"));
            voitures.add(v);
        }
        return voitures;
    }

    public boolean deleteCamionette(Camionette v) throws SQLException {
        Statement st = con.createStatement();
        int rs = st.executeUpdate("delete from camionnette where reference = '" + v.getReference() + "' and marque = '"
                + v.getMarque() + "' and modele = '" + v.getModele() + "' and couleur = '" + v.getCouleur() + "' "+v.getChargeMax()+"';");
        return rs > 0;
    }
}
