package model;

public class Asignatura {
    private int id;
    private String nombre;
    private String profesor;

    public Asignatura() {
    }

    public Asignatura(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Asignatura(int id, String nombre, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
}