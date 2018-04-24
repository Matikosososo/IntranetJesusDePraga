package model;

public class Nota {
    private int id;
    private String asignatura;
    private String alumno;
    private float nota;
    private float ponderacion;

    public Nota() {
    }

    public Nota(String asignatura, String alumno, float nota, float ponderacion) {
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.nota = nota;
        this.ponderacion = ponderacion;
    }

    public Nota(int id, String asignatura, String alumno, float nota, float ponderacion) {
        this.id = id;
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.nota = nota;
        this.ponderacion = ponderacion;
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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(float ponderacion) {
        this.ponderacion = ponderacion;
    }
    
    
}
