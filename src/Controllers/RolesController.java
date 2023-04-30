/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Configuracion.ConexionLocal;
import Models.Roles;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
/**
 * Clase que controla la lógica de negocios relacionada con los roles del
 * sistema.
 */
public class RolesController {

    private Connection cnn;
    private ConexionLocal connConsultar = new ConexionLocal();
    private Roles mostrarRoles = new Roles();

    /**
     * Método que devuelve una lista de todos los roles en el sistema.
     *
     * @return una lista de objetos Roles que contiene información sobre cada uno de
     *         los roles del sistema.
     */
    public List<Roles> traerRoles() {
        List<Roles> roles = new ArrayList<>();
        // Consulta SQL
        String sql = "SELECT nombre,id from Roles order by id ";

        try {
            connConsultar.conectar();
            PreparedStatement stmt = connConsultar.getConexion().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Roles rol = new Roles();
                rol.setId(rs.getInt("id"));
                rol.setNombre(rs.getString("nombre"));
                roles.add(rol);
            }
            return roles;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar: " + this.getClass().getName());
            return Collections.emptyList();
        }
    }

    /**
     * Método que devuelve una lista de todos los roles en el sistema.
     *
     * @return una lista de objetos Roles que contiene información sobre cada uno de
     *         los roles del sistema.
     */
    public List<Roles> obtenerRoles() {
        return traerRoles();
    }
}
