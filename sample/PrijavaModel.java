package sample;

import java.sql.*;

/**
 * Klasa koja sadrži metode za spajanje na bazu podataka, provjeru konekcije i provjeru korisničkog imena i lozinke
 */


public class PrijavaModel {

    /**
     * Instanca klase Connection iz paketa java.sql
     */
    Connection connection;
    /**
     * Metoda koja se spaja na bazu podataka
     * Poziva metodu connection
     */
    public PrijavaModel(){
        connection = SqliteConnection.connection();
        if (connection == null){
            System.exit(1);
        }
    }

    /**
     * Metoda koja provjerava da li je baza podataka dostupna ili nedostupna
     * @return vraća true ako je dostupna
     */
    public boolean isClosed() {
        try {
            return !connection.isClosed();
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Metoda koja provjerava korisničko ime i lozinku
     * @param korIme prosljeđuje se preko TextField - korisnik unosi
     * @param lozinka prosljeđuje se preko TextField - korisnik unosi
     * @return vraća true ako su korisničko ime i lozinka ispravni, false ako nisu
     * @throws SQLException
     */
    public boolean isLogin(String korIme, String lozinka) throws SQLException{
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String upit = "select * from Korisnik where KorisnickoIme = ? and Lozinka = ?";
        try {
            preparedStatement = connection.prepareStatement(upit);
            preparedStatement.setString(1, korIme);
            preparedStatement.setString(2, lozinka);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e){
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }


}
