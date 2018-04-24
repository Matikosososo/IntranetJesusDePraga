package model;

public class Asistencia {
    private int id;
    private String alumno;
    private String asignatura;
    private String fecha;

    public Asistencia() {
    }

    public Asistencia(String alumno, String asignatura, String fecha) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.fecha = fecha;
    }

    public Asistencia(int id, String alumno, String asignatura, String fecha) {
        this.id = id;
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
