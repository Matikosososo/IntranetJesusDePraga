package model;

public class Alumno {
    private int id;
    private String nombre;
    private String rut;
    private int usuario;
    

    public Alumno() {
    }

    public Alumno(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        
    }

    public Alumno(String nombre, String rut, int usuario) {
        this.nombre = nombre;
        this.rut = rut;
        this.usuario = usuario;
    }
    
    public Alumno(int id, String nombre, String rut) {
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

    @Override
    public String toString() {
        return nombre;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    
    
}
