/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Configuracion.ConexionLocal;
import Interface.IGestorDatos;
import Models.Persona;
import com.mysql.jdbc.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Deyson Vente
 */
/**
 * Clase controladora que implementa el gestor de datos para la clase Persona.
 * Utiliza una conexión a la base de datos local.
 */
public class PersonaController implements IGestorDatos<Persona> {

    private Connection cnn;
    private final ConexionLocal connNewAdmin = new ConexionLocal();

    /**
     * Crea una nueva persona en la base de datos.
     * 
     * @param persona Objeto Persona que se desea crear.
     */

    @Override
    /**
     * Crea un nuevo registro de Persona en la base de datos.
     * 
     * @param objecto el objeto Persona que se va a crear en la base de datos.
     */
    public void creacion(Persona objecto) {
        if (objecto.getRol_id()==0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Rol válido", "No se puede seleccionar este rol.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            connNewAdmin.conectar();
            String sql = "INSERT INTO Persona (nombre,apellidos,correo,fecha_nacimiento,pais,profesion,rol_id)"
                    + "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement st = connNewAdmin.getConexion().prepareStatement(sql);
            st.setString(1, objecto.getNombre());
            st.setString(2, objecto.getApellidos());
            st.setString(3, objecto.getCorreo());
            // Formatear fecha
            java.sql.Date fechaNacimiento = new java.sql.Date(objecto.getFecha_nacimiento().getTime());
            // pasar fecha
            st.setDate(4, fechaNacimiento);
            st.setString(5, objecto.getPais());
            st.setString(6, objecto.getProfesion());
            st.setInt(7, objecto.getRol_id());

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado un nuevo registro.", "Datos Guardados",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor comprueba los datos.", "Error al crear",
                    JOptionPane.ERROR_MESSAGE);

        } finally {
            connNewAdmin.desconectar();
        }
    }

    @Override
    /**
     * Realiza una lectura de la base de datos y devuelve la información de una
     * persona
     * a partir de su identificador.
     * 
     * @param id Identificador de la persona a buscar en la base de datos.
     * @return Objeto Persona con la información de la persona encontrada en la base
     *         de datos.
     */
    public Persona lectura(int id) {
        String sql = "SELECT nombre, apellidos, correo, fecha_nacimiento, pais, profesion, rol_id "
                + "FROM Persona WHERE id = '" + id + "'";
        Persona personaTraida = new Persona();

        try {
            connNewAdmin.conectar();
            PreparedStatement realizaConsula = connNewAdmin.getConexion().prepareStatement(sql);
            ResultSet resultado = realizaConsula.executeQuery();

            if (resultado.next()) {
                personaTraida.setNombre(resultado.getString("nombre"));
                personaTraida.setApellidos(resultado.getString("apellidos"));
                personaTraida.setCorreo(resultado.getString("correo"));
                personaTraida.setFecha_nacimiento(resultado.getDate("fecha_nacimiento"));
                personaTraida.setPais(resultado.getString("pais"));
                personaTraida.setProfesion(resultado.getString("profesion"));
                personaTraida.setRol_id(resultado.getInt("rol_id"));
            } else {
                // Inicializar el objeto en caso de que no se encuentre el usuario
                personaTraida = new Persona();
                JOptionPane.showMessageDialog(null, "No se encontraron datos.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros.", "Error al Recuperar",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase: " + this.getClass().getName());
        } finally {
            connNewAdmin.desconectar();
        }

        return personaTraida;
    }

    @Override
    /**
     * Actualiza los datos de una persona en la base de datos.
     * 
     * @param objetoActualizar La persona con los nuevos datos.
     * @param id               El id de la persona a actualizar.
     */
    public void actualziar(Persona objetoActualizar, int id) {
        if (objetoActualizar.getRol_id()==0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Rol válido", "No se puede seleccionar este rol.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sqlActualizar = "Update persona set nombre=?,apellidos=?,correo=?,fecha_nacimiento=?,pais=?,profesion=?,rol_id=? where id='"
                + id + "'";

        try {
            // Conectarse a la base de datos
            connNewAdmin.conectar();
            // Preparar la consulta para actualizar los datos de la persona
            PreparedStatement preparaConsultaEditar = connNewAdmin.getConexion().prepareStatement(sqlActualizar);
            preparaConsultaEditar.setString(1, objetoActualizar.getNombre());
            preparaConsultaEditar.setString(2, objetoActualizar.getApellidos());
            preparaConsultaEditar.setString(3, objetoActualizar.getCorreo());
            // Castear la fecha
            java.sql.Date fechaNacimiento = new java.sql.Date(objetoActualizar.getFecha_nacimiento().getTime());
            preparaConsultaEditar.setDate(4, fechaNacimiento);

            preparaConsultaEditar.setString(5, objetoActualizar.getPais());
            preparaConsultaEditar.setString(6, objetoActualizar.getProfesion());
            preparaConsultaEditar.setInt(7, objetoActualizar.getRol_id());

            // Ejecutar la consulta para actualizar los datos de la persona
            preparaConsultaEditar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados con éxito");
        } catch (SQLException e) {
            // Mostrar un mensaje de error si no se puede actualizar la persona
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro de la persona." + e,
                    "ERORR al ACTUALIZAR", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Desconectarse de la base de datos
            connNewAdmin.desconectar();
        }
    }

    @Override
    public void eliminar(int id) {
        // Sentencia SQL para eliminar un registro de la tabla Persona con el id
        // especificado
        String eliminar = "DELETE from PERSONA where id ='" + id + "'";

        try {
            connNewAdmin.conectar(); // Abrir conexión con la base de datos
            PreparedStatement elimacion = connNewAdmin.getConexion().prepareStatement(eliminar);
            int filasAfectadas = elimacion.executeUpdate(); // Ejecutar la sentencia SQL de eliminación y obtener el
                                                            // número de filas afectadas
            if (filasAfectadas > 0) {
                // Mostrar un mensaje de éxito si se eliminó al menos una fila
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            } else {
                // Mostrar un mensaje de error si no se encontró ningún registro con el id
                // especificado
                JOptionPane.showMessageDialog(null, "No se encontraron datos a eliminar");
            }
        } catch (SQLException e) {
            // Mostrar un mensaje de error si ocurre alguna excepción al intentar eliminar
            // el registro
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e);
        } finally {
            connNewAdmin.desconectar(); // Cerrar la conexión con la base de datos
        }
    }

}
