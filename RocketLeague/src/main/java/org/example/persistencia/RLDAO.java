package org.example.persistencia;

import org.example.modelo.RocketLeague;

import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RLDAO implements InterfazDao {
    public RLDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException, MalformedURLException {
        String sqlInsert = "INSERT INTO rocketleague (id, gamertag, club, auto, liga, url) VALUES(?,?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rocketleagueDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setInt(1, ((RocketLeague)obj).getId());
        pstm.setString(2, ((RocketLeague)obj).getGamertag());
        pstm.setString(3, ((RocketLeague)obj).getClub());
        pstm.setString(4, ((RocketLeague)obj).getAuto());
        pstm.setString(5, ((RocketLeague)obj).getLiga());
        pstm.setString(6, String.valueOf(((RocketLeague)obj).getImagen()));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException, MalformedURLException {
        String sqlUpdate = "UPDATE rocketleague SET gamertag = ?, club = ?, auto = ?, liga = ?, url = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rocketleagueDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((RocketLeague)obj).getGamertag());
        pstm.setString(2, ((RocketLeague)obj).getClub());
        pstm.setString(3, ((RocketLeague)obj).getAuto());
        pstm.setString(4, ((RocketLeague)obj).getLiga());
        pstm.setString(5, String.valueOf(((RocketLeague)obj).getImagen()));
        pstm.setInt(6, ((RocketLeague)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;    }

    @Override
    public boolean delete(String id) throws SQLException, MalformedURLException {
        String sqlDelete = "DELETE FROM rocketleague WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("rocketleagueDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM rocketleague";
        ArrayList<RocketLeague> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("rocketleagueDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new RocketLeague(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));

        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM rocketleague WHERE id = ? ;";
        RocketLeague rocketLeague = null;
            PreparedStatement pstm = ConexionSingleton.getInstance("rocketleagueDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                rocketLeague = new RocketLeague(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                return rocketLeague;
            }
        return null;
    }
}