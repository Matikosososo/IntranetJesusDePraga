package dao;

import java.util.List;
import model.Tipo_usuario;

public interface TipoUsuarioDAO {

    void create(Tipo_usuario t);

    List<Tipo_usuario> read();

    void update(Tipo_usuario t);

    void delete(String id);
    
    Tipo_usuario getByID(String id);
    
    List<Tipo_usuario>search(String exp);
}
