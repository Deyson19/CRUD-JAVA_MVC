/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

// CRUD Desarrollado por Deyson
/**
 * Español/Spanish
 * La clase Roles representa un objeto de roles en el sistema.
 * 
 * Ingles/English
 * The Roles class represents a role object in the system.
 */
public class Roles {
    private int Id;
    private String Nombre;

    /**
     * Español
     * Constructor por defecto de la clase Roles.
     * 
     * Ingles
     * Default constructor of the Roles class.
     */
    public Roles() {
    }

    /**
     * Español
     * Obtiene el ID del rol.
     *
     * @return El ID del rol.
     * 
     *         Ingles/English
     *         Gets the role ID.
     *
     * @return The role ID.
     */
    public int getId() {
        return Id;
    }

    /**
     * Establece el ID del rol.
     *
     * @param id El ID del rol.
     */
    public void setId(int id) {
        this.Id = id;
    }

    /**
     * Obtiene el nombre del rol.
     *
     * @return El nombre del rol.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del rol.
     *
     * @param nombre El nombre del rol.
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

}
