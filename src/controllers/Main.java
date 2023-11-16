package controllers;

import core.services.Conexion;
import core.services.IProviderDB;
import core.services.LocalDBService;
import java.sql.*;
import views.ViewMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ViewMenuPrincipal viewMenuPrincipal = new ViewMenuPrincipal();// Crear objeto del JFrame principal
        viewMenuPrincipal.setExtendedState(ViewMenuPrincipal.MAXIMIZED_BOTH);
        viewMenuPrincipal.setVisible(true);// Visualizar frame

        Object[] parametrosSelect = {"ABW"};
        queryConsultar("SELECT * FROM country where code = ?", parametrosSelect);
        Object[] parametrosInsert = {"Peru", "per", "Lince", 1045};
        queryInsertar("insert into city (Name, CountryCode, District, Population) values (?,?,?,?)", parametrosInsert);
        Object[] parametrosUpdate = {"Arequipa", 1045};
        queryActualizar("update city set name = ? where id = ?", parametrosUpdate);
        Object[] parametrosDelete = {1045};
        queryEliminar("delete from city where id = ?", parametrosDelete);
    }

    public static void test() {
        IProviderDB proveedor = new LocalDBService();
        proveedor.cargarDB();
        String[] midata = {"alex"};
        proveedor.guardarDB(midata);
    }

    public static void queryConsultar(String sql, Object[] parametros) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            int tamano = parametros.length;
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement(sql);

            for (int i = 0; i < tamano; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                System.out.println("Code: " + code + " Name: " + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            Conexion.cerrarConsulta(stmt);
            Conexion.cerrarConexion(conn);
        }
    }

    public static int queryInsertar(String sql, Object[] parametros) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            int tamano = parametros.length;
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement(sql, tamano);

            for (int i = 0; i < tamano; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }

            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int code = rs.getInt(1);
                System.out.println("Code: " + code);
            }

            return stmt.executeUpdate();

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            Conexion.cerrarConsulta(stmt);
            Conexion.cerrarConexion(conn);
        }
    }

    public static int queryActualizar(String sql, Object[] parametros) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            int tamano = parametros.length;
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement(sql, tamano);

            for (int i = 0; i < tamano; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }

            return stmt.executeUpdate();

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            Conexion.cerrarConsulta(stmt);
            Conexion.cerrarConexion(conn);
        }
    }

    public static int queryEliminar(String sql, Object[] parametros) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            int tamano = parametros.length;
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement(sql);

            for (int i = 0; i < tamano; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }

            return stmt.executeUpdate();

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            Conexion.cerrarConsulta(stmt);
            Conexion.cerrarConexion(conn);
        }
    }

}
