/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud.java_mvc;

import Configuracion.ComprobadorServidor;
import Configuracion.ConexionLocal;
import Vistas.Personas;

// CRUD Desarrollado por Deyson
public class CRUDJAVA_MVC {

    /**
     * Método principal de la aplicación que muestra la ventana de Personas.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en
     *             esta aplicación)
     */
    public static void main(String[] args) {
        // Crear una instancia de la ventana Personas
        Personas mostrarFormPersonas = new Personas();
        ComprobadorServidor comp = new ComprobadorServidor();
        // Se comprueba el estado de la conexion al servidor
        if (comp.comprobarConexion() == true) {
            // Establecer la ubicación de la ventana en el centro de la pantalla
            mostrarFormPersonas.setLocationRelativeTo(null);
            // Hacer visible la ventana
            mostrarFormPersonas.setVisible(true);
        } else {
            System.out.println("No se conecta");
            System.exit(0);

        }
    }

}
