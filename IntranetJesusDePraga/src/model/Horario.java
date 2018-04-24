package model;

public class Horario {
    private int id;
    private String asignatura;
    private String alumno;
    private String fecha;
    private String hora;

    public Horario() {
    }

    public Horario(String asignatura, String alumno, String fecha, String hora) {
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Horario(int id, String asignatura, String alumno, String fecha, String hora) {
        this.id = id;
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.fecha = fecha;
        this.hora = hora;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
}
