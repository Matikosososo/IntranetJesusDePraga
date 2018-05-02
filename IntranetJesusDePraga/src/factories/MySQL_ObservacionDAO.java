package factories;

import dao.ObservacionDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Observacion;

public class MySQL_ObservacionDAO implements ObservacionDAO {

    private ResultSet tablaVirtual;
    private List<Observacion> list_Observ;
    MySQL_ConexionDAO c;

    public MySQL_ObservacionDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Observacion o) {
        String query = "insert into observacion values(null,'" + o.getAlumno() + "','" + o.getAsignatura() + "','" + o.getObservacion() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Observacion> read() {
        String query = "Select * from observacion";
        Observacion o;
        list_Observ = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                o = new Observacion();

                o.setId(tablaVirtual.getInt(1));
                o.setAlumno(tablaVirtual.getString(2));
                o.setAsignatura(tablaVirtual.getString(3));
                o.setObservacion(tablaVirtual.getString(4));
                list_Observ.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ObservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Observ;
    }

    @Override
    public void update(Observacion o) {
        String query = "update observacion set alumno_fk =" + o.getAlumno() + ", asignatura_fk = " + o.getAsignatura() + ",comentario = " + o.getObservacion() + " where id =" + o.getId();
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from observacion where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Observacion bgetByID(String id) {
        String query = "Select * from observacion where id = " + id;
        Observacion o;
        list_Observ = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                o = new Observacion();

                o.setId(tablaVirtual.getInt(1));
                o.setAlumno(tablaVirtual.getString(2));
                o.setAsignatura(tablaVirtual.getString(3));
                o.setObservacion(tablaVirtual.getString(4));
                list_Observ.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ObservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Observ.get(0);
    }

    @Override
    public List<Observacion> search(String exp) {
        String query = "Select * from observacion LIKE '%"+exp+"%'";
        Observacion o;
        list_Observ = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                o = new Observacion();

                o.setId(tablaVirtual.getInt(1));
                o.setAlumno(tablaVirtual.getString(2));
                o.setAsignatura(tablaVirtual.getString(3));
                o.setObservacion(tablaVirtual.getString(4));
                list_Observ.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ObservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Observ;
    }
}
