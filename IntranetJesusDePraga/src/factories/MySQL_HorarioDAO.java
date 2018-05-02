package factories;

import dao.HorarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Horario;

public class MySQL_HorarioDAO implements HorarioDAO {

    private ResultSet tablaVirtual;
    private List<Horario> list_Horario;
    MySQL_ConexionDAO c;

    public MySQL_HorarioDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Horario h) {
        String query = "insert into horario values(null,'" + h.getAsignatura() + "','" + h.getAlumno() + "','" + h.getFecha() + "','" + h.getCantidad_horas() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Horario> read() {
        String query = "Select * from horario";
        Horario h;
        list_Horario = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                h = new Horario();

                h.setId(tablaVirtual.getInt(1));
                h.setAlumno(tablaVirtual.getString(2));
                h.setAsignatura(tablaVirtual.getString(3));
                h.setFecha(tablaVirtual.getString(4));
                list_Horario.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Horario;
    }

    @Override
    public void update(Horario h) {
        String query = "update horario set asignatura_fk =" + h.getAsignatura() + ", alumno_fk = " + h.getAlumno() + ",fecha = " + h.getFecha() + ",cantidad_horas = " + h.getCantidad_horas() + " where id =" + h.getId();
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from horario where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Horario getByID(String id) {
        String query = "Select * from horario id = " + id;
        Horario h;
        list_Horario = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                h = new Horario();

                h.setId(tablaVirtual.getInt(1));
                h.setAlumno(tablaVirtual.getString(2));
                h.setAsignatura(tablaVirtual.getString(3));
                h.setFecha(tablaVirtual.getString(4));
                list_Horario.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Horario.get(0);
    }

    @Override
    public List<Horario> search(String exp) {
        String query = "Select * from horario LIKE '%"+exp+"%'";
        Horario h;
        list_Horario = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                h = new Horario();

                h.setId(tablaVirtual.getInt(1));
                h.setAlumno(tablaVirtual.getString(2));
                h.setAsignatura(tablaVirtual.getString(3));
                h.setFecha(tablaVirtual.getString(4));
                list_Horario.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Horario;
    }
}
