package dao;

import java.util.List;
import model.Horario;

public interface HorarioDAO {

    void create(Horario h);

    List<Horario> read();

    void update(Horario h);

    void delete(String id);
}
