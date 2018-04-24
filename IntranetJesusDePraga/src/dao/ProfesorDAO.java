package dao;

import java.util.List;
import model.Profesor;

public interface ProfesorDAO {

    void create(Profesor p);

    List<Profesor> read();

    void update(Profesor p);

    void delete(String id);
}
