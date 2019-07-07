package sample;

import java.sql.*;

/**
 * Klasa koja služi za spajanje na bazu podataka
 */

public class SqliteConnection {

    /**
     * Metoda koja spaja projekt sa bazom podataka
     * @return vraća konekciju na bazu
     */

    public static Connection connection(){

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
