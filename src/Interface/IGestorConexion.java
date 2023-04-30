/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author Deyson Vente
 */
/**
 * La interfaz IGestorConexion define el comportamiento de los objetos
 * que gestionan la conexión a una base de datos.
 */
public interface IGestorConexion {

    /**
     * Conecta el gestor de conexión a la base de datos.
     */
    void conectar();

    /**
     * Desconecta el gestor de conexión de la base de datos.
     */
    void desconectar();

    /**
     * Prueba si el gestor de conexión está conectado a la base de datos.
     * 
     * @return true si la conexión está establecida, false de lo contrario.
     */
    boolean testearConexion();
}
