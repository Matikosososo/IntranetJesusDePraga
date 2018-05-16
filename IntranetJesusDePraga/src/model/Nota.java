package model;

public class Nota {
    private int id;
    private int identificador;
    private String asignatura;
    private String alumno;
    private float nota;
    private float ponderacion;

    public Nota() {
    }

    public Nota(int id, int identificador, String asignatura, String alumno, float nota, float ponderacion) {
        this.id = id;
        this.identificador = identificador;
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.nota = nota;
        this.ponderacion = ponderacion;
    }

    public Nota(int identificador, String asignatura, String alumno, float nota, float ponderacion) {
        this.identificador = identificador;
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
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
