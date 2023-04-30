package Configuracion;

import java.util.Random;

public class GeneradorCorreos {

    private static final String[] DOMINIOS_CORREOS = {"gmail.com", "hotmail.com", "yahoo.com", "outlook.com", "aol.com", "icloud.com", "protonmail.com", "live.com", "yandex.com", "outlook.com", "mail.com", "example.com",
        "yahoo.com"};
    int numeroGenerado = (int) (Math.random() * 99);
    private static final String[] caracteres = {".", "_", "47", "-", "85", "00"};

    private String correoGenerado;

    public void generarCorreo(String nombre, String apellidos) {
        Random rand = new Random();
        String caracterParaCorreo = caracteres[rand.nextInt(caracteres.length)];
        String dominio = DOMINIOS_CORREOS[rand.nextInt(DOMINIOS_CORREOS.length)];
        this.correoGenerado = nombre.split(" ")[0].toLowerCase() + "." + apellidos.split(" ")[0].toLowerCase() + caracterParaCorreo +numeroGenerado+ "@" + dominio;
    }

    public String getCorreoGenerado() {
        return correoGenerado;
    }
}
