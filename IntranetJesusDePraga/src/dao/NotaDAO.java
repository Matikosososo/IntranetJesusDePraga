package dao;

import java.util.List;
import model.Nota;

public interface NotaDAO {

    void create(Nota n);

    List<Nota> read();

    void update(Nota n);

    void delete(String id);
    
    Nota getByID(String id);
    
    List<Nota> search(String exp);
    
    List<Nota> getNotaByAsig(int asig, int not);
    
}
