
package Configuracion;

import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ComprobadorServidor {
    public boolean comprobarConexion() {
        try {
            // Cambia la dirección IP y el número de puerto por los de tu servidor
            Socket socket = new Socket("localhost", 3306);

            // Si la conexión se establece correctamente, cierra el socket y devuelve true
            socket.close();
            JOptionPane.showMessageDialog(null, "Bienvenido,estas conectado");
            return true;
        } catch (IOException e) {
            // Si la conexión falla, devuelve false
            JOptionPane.showMessageDialog(null, "No hay servidor conectado", "Debes Encender el Servidor Local",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
