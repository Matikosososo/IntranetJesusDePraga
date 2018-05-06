package dao;

import java.util.List;
import model.Asignatura;

public interface AsignaturaDAO {

    void create(Asignatura a);

    List<Asignatura> read();

    void update(Asignatura a);

    void delete(String id);
    
    Asignatura getByID(String id);
    
    List<Asignatura> search(String exp);
    
    List<Asignatura> getByProfe(int id);
}
