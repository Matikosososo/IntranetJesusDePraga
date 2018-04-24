package model;

public class Profesor {
    private int id;
    private String nombre;
    private String rut;

    public Profesor() {
    }

    public Profesor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
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
    
    
}
