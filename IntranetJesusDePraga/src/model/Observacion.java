package model;

public class Observacion {
    private int id;
    private String asignatura;
    private String alumno;
    private String observacion;

    public Observacion() {
    }

    public Observacion(String asignatura, String alumno, String observacion) {
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.observacion = observacion;
    }

    public Observacion(int id, String asignatura, String alumno, String observacion) {
        this.id = id;
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
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

    @Override
    public String toString() {
        return observacion;
    }
    
    
    
    
}
