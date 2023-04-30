/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author Deyson Vente
 * @param <T>
 */

/**
 * La interfaz IGestorDatos define las operaciones básicas para gestionar datos
 * de un objeto.
 *
 * @param <T> El tipo de objeto que se manejará en el gestor de datos.
 */
public interface IGestorDatos<T> {

    /**
     * Crea un nuevo objeto en el gestor de datos.
     *
     * @param objeto El objeto que se creará en el gestor de datos.
     */
    void creacion(T objeto);

    /**
     * Lee un objeto existente del gestor de datos según el ID proporcionado.
     *
     * @param id El ID del objeto que se leerá del gestor de datos.
     * @return El objeto leído del gestor de datos.
     */
    T lectura(int id);

    /**
     * Actualiza un objeto existente en el gestor de datos según el ID
     * proporcionado.
     *
     * @param objeto El objeto actualizado que se guardará en el gestor de datos.
     * @param id     El ID del objeto que se actualizará en el gestor de datos.
     */
    void actualziar(T objeto, int id);

    /**
     * Elimina un objeto existente del gestor de datos según el ID proporcionado.
     *
     * @param id El ID del objeto que se eliminará del gestor de datos.
     */
    void eliminar(int id);
}
