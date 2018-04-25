package model;

public class Horario {
    private int id;
    private String asignatura;
    private String alumno;
    private String fecha;
    private float Cantidad_horas;

    public Horario() {
    }

    public Horario(String asignatura, String alumno, String fecha, float Cantidad_horas) {
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.fecha = fecha;
        this.Cantidad_horas = Cantidad_horas;
    }

    public Horario(int id, String asignatura, String alumno, String fecha, float Cantidad_horas) {
        this.id = id;
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.fecha = fecha;
        this.Cantidad_horas = Cantidad_horas;
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

    public float getCantidad_horas() {
        return Cantidad_horas;
    }

    public void setCantidad_horas(float Cantidad_horas) {
        this.Cantidad_horas = Cantidad_horas;
    }

    
}
