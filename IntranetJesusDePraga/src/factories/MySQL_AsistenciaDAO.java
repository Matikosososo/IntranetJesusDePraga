package factories;

import dao.AsistenciaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asistencia;

public class MySQL_AsistenciaDAO implements AsistenciaDAO {

    private ResultSet tablaVirtual;
    private List<Asistencia> list_Asistencia;
    MySQL_ConexionDAO c;

    public MySQL_AsistenciaDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Asistencia a) {
        String query = "insert into asistencia values(null,'" + a.getAlumno() + "','" + a.getAsignatura() + "','" + a.getFecha() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Asistencia> read() {
        String query = "Select * from asistencia";
        Asistencia a;
        list_Asistencia = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Asistencia();

                a.setId(tablaVirtual.getInt(1));
                a.setAlumno(tablaVirtual.getString(2));
                a.setAsignatura(tablaVirtual.getString(3));
                a.setFecha(tablaVirtual.getString(4));
                list_Asistencia.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsistenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Asistencia;
    }

    @Override
    public void update(Asistencia a) {
        String query = "update asistencia set alumno_fk =" + a.getAlumno() + ", asignatura_fk = " + a.getAsignatura() + ",dia = " + a.getFecha() + " where id =" + a.getId();
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from asistencia where id = " + id;
        c.ejecutar(query);
    }
}
