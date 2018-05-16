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
        String query = "insert into alumno values(null, '" + a.getNombre() + "','" + a.getRut() + "', " + a.getUsuario() + ")";
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
                + " where id =" + a.getId();
        c.ejecutar(query);

    }

    @Override
    public void delete(String id) {
        String query = "delete from alumno where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Alumno getByID(String id) {
        String query = "Select * from alumno where id = " + id;
        Alumno a = null;
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return a;
    }

    @Override
    public List<Alumno> search(String exp) {
        String query = "Select * from alumno LIKE '%" + exp + "%'";
        Alumno a;
        list_ALumnos = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));

                list_ALumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_ALumnos;
    }

    @Override
    public List<Alumno> getByAsignatura(int i) {
        String query = "select alumno.id, alumno.nombre, alumno.rut "
                + "from nota, asignatura, alumno "
                + "where nota.alumno_fk = alumno.id and nota.asignatura = asignatura.id and "
                + "asignatura.id = " + i;
        Alumno a;
        list_ALumnos = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));

                list_ALumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_ALumnos;
    }

    @Override
    public Alumno getByIDUser(int idUser) {
        String query = "Select * from alumno where usuario = " + idUser;
        Alumno a = new Alumno();
        list_ALumnos = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return a;
    }

    @Override
    public List<Alumno> getByProfeAsignatura(int idProfe, int idAsig) {
        String query = "select alumno.id, alumno.nombre, alumno.rut, alumno.usuario "
                + "from profesor, asignatura, alumno, nota "
                + "where asignatura.profesor = profesor.id and nota.alumno_fk = alumno.id and nota.asignatura = asignatura.id "
                + "and profesor.id = " + idProfe + " and asignatura.id = " + idAsig;
        Alumno a;
        list_ALumnos = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));
                a.setUsuario(tablaVirtual.getInt(4));

                list_ALumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_ALumnos;
    }

    @Override
    public String getByRUT(String rut) {
        String query = "Select * from alumno where rut = '" + rut + "'";
        Alumno a;
        String rutExp = "";
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                a = new Alumno();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setRut(tablaVirtual.getString(3));
                a.setUsuario(tablaVirtual.getInt(4));

                rutExp = a.getRut();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return rutExp;
    }

}
