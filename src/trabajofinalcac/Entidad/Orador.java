
package trabajofinalcac.Entidad;

import java.time.LocalDate;


public class Orador {
    
    private int idOrador;
    private String nombre;
    private String apellido;
    private String mail;
    private String tema;
    private LocalDate fecha_alta;

    public Orador(int idOrador, String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
        this.idOrador = idOrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tema = tema;
        this.fecha_alta = fecha_alta;
    }

    public Orador(String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tema = tema;
        this.fecha_alta = fecha_alta;
    }

    public Orador() {
    }

    public int getIdOrador() {
        return idOrador;
    }

    public void setIdOrador(int idOrador) {
        this.idOrador = idOrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDate fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    @Override
    public String toString() {
                return "Orador: " + "\n" +
                "idOrador = " + idOrador + "\n" +
                "nombre = " + nombre + "\n" +
                "apellido = " + apellido + "\n" +
                "mail = " + mail + "\n" +
                "tema = " + tema + "\n" +
                "fecha_alta = " + fecha_alta;
    }
    
    
    
}
