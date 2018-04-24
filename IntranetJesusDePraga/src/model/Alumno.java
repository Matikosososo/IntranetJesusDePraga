package model;

public class Alumno {
    private int id;
    private String nombre;
    private String rut;
    private String asignatura;

    public Alumno() {
    }

    public Alumno(String nombre, String rut, String asignatura) {
        this.nombre = nombre;
        this.rut = rut;
        this.asignatura = asignatura;
    }

    public Alumno(int id, String nombre, String rut, String asignatura) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.asignatura = asignatura;
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

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    
}
