package model;

public class Asignatura {
    private int id;
    private String nombre;
    private int profesor;

    public Asignatura() {
        
        
    }

    public Asignatura(String nombre, int profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Asignatura(int id, String nombre, int profesor) {
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

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}

    