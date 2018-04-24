package model;

public class Tipo_usuario {
    private int id;
    private String tipo;

    public Tipo_usuario() {
    }

    public Tipo_usuario(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Tipo_usuario(String tipo) {
        this.tipo = tipo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
