package model;

public class Profesor {
    private int id;
    private String nombre;
    private String rut;
    private int usuario;

    public Profesor() {
    }

    public Profesor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public Profesor(String nombre, String rut, int usuario) {
        this.nombre = nombre;
        this.rut = rut;
        this.usuario = usuario;
    }

    
    public Profesor(int id, String nombre, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
