package factories;

import dao.AlumnoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Alumno;

public class MySQL_AlumnoDAO implements AlumnoDAO {

    private ResultSet tablaVirtual;
    private List<Alumno> list_ALumnos;
    MySQL_ConexionDAO c;

    public MySQL_AlumnoDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(Alumno a) {
        String query = "insert into alumno values(null, '" + a.getNombre() + "','" + a.getRut() + "','" + a.getAsignatura() + "')";
        c.ejecutar(query);

    }

    @Override
    public List<Alumno> read() {
        String query = "Select * from alumno";
        Alumno a;
        list_ALumnos = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));
                a.setAsignatura(tablaVirtual.getString(4));

                list_ALumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_ALumnos;
    }

    @Override
    public void update(Alumno a) {
        String query = "UPDATE alumno set nombre = " + a.getNombre() + ""
                + ", rut = " + a.getRut() + ""
                + ", asignatura_fk = " + a.getAsignatura() + " where id =" + a.getId();
        c.ejecutar(query);

    }

    @Override
    public void delete(String id) {
        String query = "delete from alumno where id = " + id;
        c.ejecutar(query);
    }

}