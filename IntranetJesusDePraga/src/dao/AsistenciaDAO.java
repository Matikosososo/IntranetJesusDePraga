package dao;

import java.util.List;
import model.Asistencia;

public interface AsistenciaDAO {

    void create(Asistencia a);

    List<Asistencia> read();

    void update(Asistencia a);

    void delete(String id);
    
    Asistencia getByID(String id);
    
    List<Asistencia> search(String exp);
}
