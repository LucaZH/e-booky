package com.ebooky.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static String url = "jdbc:sqlite:booky.db";
    private static Connection con;

    public static Connection getConnexion() {
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Connexion établie avec succès à la base de données.");
        } catch (SQLException e) {
            System.out.println("Impossible d'établir une connexion à la base de données.");
            e.printStackTrace();
        }
		return con;
    }
    
    public void close() {
        try {
            con.close();
            System.out.println("Connexion fermée avec succès.");
        } catch (SQLException e) {
            System.out.println("Impossible de fermer la connexion.");
            e.printStackTrace();
        }
    }
}
