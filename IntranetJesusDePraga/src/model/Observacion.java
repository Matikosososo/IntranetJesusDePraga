package model;

public class Observacion {
    private int id;
    private String profesor;
    private String alumno;
    private String observacion;

    public Observacion() {
    }

    public Observacion(String profesor, String alumno, String observacion) {
        this.profesor = profesor;
        this.alumno = alumno;
        this.observacion = observacion;
    }

    public Observacion(int id, String profesor, String alumno, String observacion) {
        this.id = id;
        this.profesor = profesor;
        this.alumno = alumno;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
