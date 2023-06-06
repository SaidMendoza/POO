package org.example.persistencia;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDao {
    public abstract boolean insertar(Object obj) throws SQLException, MalformedURLException;
    public abstract boolean update(Object obj) throws SQLException, MalformedURLException;
    public abstract boolean delete(String id) throws SQLException, MalformedURLException;
    public abstract ArrayList obtenerTodo()throws SQLException;
    public abstract Object buscarPorId(String id)throws SQLException;
}
