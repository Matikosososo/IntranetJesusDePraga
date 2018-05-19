package model;

public class Usuario {
    private int id;
    private String rut_usuario;
    private int tipo;
    private String contrasenia;

    public Usuario() {
    }
    
    
    
    public Usuario(String rut_usuario, int tipo, String contrasenia) {
        this.rut_usuario = rut_usuario;
        this.tipo = tipo;
        this.contrasenia = contrasenia;
    }

    public Usuario(int id, String rut_usuario, int tipo, String contrasenia) {
        this.id = id;
        this.rut_usuario = rut_usuario;
        this.tipo = tipo;
        this.contrasenia = contrasenia;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut_usuario() {
        return rut_usuario;
    }

    public void setRut_usuario(String rut_usuario) {
        this.rut_usuario = rut_usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
