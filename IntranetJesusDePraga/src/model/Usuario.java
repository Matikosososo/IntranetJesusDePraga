package model;

public class Usuario {
    private int id;
    private String nom_usuario;
    private int tipo;
    private String contrasenia;

    public Usuario() {
    }
    
    

    public Usuario(String nom_usuario, int tipo, String contrasenia) {
        this.nom_usuario = nom_usuario;
        this.tipo = tipo;
        this.contrasenia = contrasenia;
    }

    public Usuario(int id, String nom_usuario, int tipo, String contrasenia) {
        this.id = id;
        this.nom_usuario = nom_usuario;
        this.tipo = tipo;
        this.contrasenia = contrasenia;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
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
