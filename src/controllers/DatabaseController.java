/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import models.Conexion;

/**
 *
 * @author alex
 */
public class DatabaseController {

    protected Conexion mysql = new Conexion();
    protected Connection connection = mysql.connected();
    protected String querySQL = "";

}
