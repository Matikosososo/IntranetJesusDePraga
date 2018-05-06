package dao;

import java.util.List;
import model.Alumno;

public interface AlumnoDAO {

    void create(Alumno a);

    List<Alumno> read();

    void update(Alumno a);

    void delete(String id);
    
    Alumno getByID(String id);
    
    List<Alumno> search(String exp);
    
    List<Alumno> getByAsignatura(int i);
}
