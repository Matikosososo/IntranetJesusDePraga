package factories;

import dao.AsignaturaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asignatura;

public class MySQL_AsignaturaDAO implements AsignaturaDAO {

    private ResultSet tablaVirtual;
    private List<Asignatura> list_Asignatura;
    MySQL_ConexionDAO c;

    public MySQL_AsignaturaDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(Asignatura a) {
        String query = "insert into asignatura values(null, '" + a.getNombre() + "','" + a.getProfesor() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Asignatura> read() {
        String query = "Select * from asignatura";
        Asignatura a;
        list_Asignatura = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Asignatura();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setProfesor(tablaVirtual.getInt(3));
                list_Asignatura.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Asignatura;
    }

    @Override
    public void update(Asignatura a) {

        String query = "update asignatura set nombre ='" + a.getNombre() + "', profesor = '" + a.getProfesor() + "' where id ='" + a.getId() + "'";
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from asignatura where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Asignatura getByID(String id) {
        String query = "select * from asignatura where id = '" + id + "'";
        Asignatura a = null;
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                a = new Asignatura();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setProfesor(tablaVirtual.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return a;
    }

    @Override
    public List<Asignatura> search(String exp) {
        String query = "Select * from asignatura where nombre LIKE '%" + exp + "%'";
        Asignatura a;
        list_Asignatura = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Asignatura();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setProfesor(tablaVirtual.getInt(3));
                list_Asignatura.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Asignatura;
    }

    @Override
    public List<Asignatura> getByProfe(int id) {
        String query = "select asignatura.id, asignatura.nombre, asignatura.profesor "
                + "from asignatura, profesor "
                + "where asignatura.profesor = profesor.id and usuario = " + id;
        Asignatura a;
        list_Asignatura = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Asignatura();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setProfesor(tablaVirtual.getInt(3));
                list_Asignatura.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Asignatura;
    }

    @Override
    public List<Asignatura> getByAlumno(int id) {
        String query = "select asignatura.id, asignatura.nombre, asignatura.profesor "
                + "from nota, asignatura, alumno "
                + "where nota.alumno_fk = alumno.id and nota.asignatura = asignatura.id and alumno.id = " + id;
        Asignatura a;
        list_Asignatura = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                a = new Asignatura();

                a.setId(tablaVirtual.getInt(1));
                a.setNombre(tablaVirtual.getString(2));
                a.setProfesor(tablaVirtual.getInt(3));
                list_Asignatura.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Asignatura;
    }

//    public Asignatura getASignatura(int id) throws SQLException {
//        Asignatura a = null;
//        String query = "select * from asignatura where id=" + id;
//
//        tablaVirtual = c.ejecutarSelect(query);
//
//        if (tablaVirtual.next()) {
//            a = new Asignatura();
//
//            a.setId(tablaVirtual.getInt(1));
//            a.setNombre(tablaVirtual.getString(2));
//            a.setProfesor(tablaVirtual.getInt(3));
//        }
//
//        c.desconectar();
//        return a;
//
//    }
    @Override
    public int getId(String nom) {
        String query = "select id from asignatura where nombre = '" + nom + "'";
        tablaVirtual = c.ejecutarSelect(query);
        int id = 0;
        try {
            while (tablaVirtual.next()) {

                id = tablaVirtual.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return id;
    }

}
