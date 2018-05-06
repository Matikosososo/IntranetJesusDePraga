package dao;

import java.util.List;
import model.Tipo_usuario;
import model.Usuario;

public interface UsuarioDAO {

    void create(Usuario u);

    List<Usuario> read();

    void update(Usuario u);

    void delete(String id);
    
    Usuario getByID(String id);
    
    List<Usuario> search(String exp);
    
    String getByRut(String rut);
    
    String getByPass(String pass);
}
