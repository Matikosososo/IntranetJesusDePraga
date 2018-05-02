package dao;

import java.util.List;
import model.Observacion;

public interface ObservacionDAO {
    
    void create(Observacion o);

    List<Observacion> read();

    void update(Observacion o);

    void delete(String id);
    
    Observacion bgetByID(String id);
    
    List<Observacion> search(String exp);
}
