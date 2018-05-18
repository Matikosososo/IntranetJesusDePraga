package factories;

import dao.NotaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Nota;

public class MySQL_NotaDAO implements NotaDAO {

    private ResultSet tablaVirtual;
    private List<Nota> list_Nota;
    MySQL_ConexionDAO c;

    public MySQL_NotaDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Nota n) {
        String query = "insert into nota values(null,'" + n.getAsignatura() + "','" + n.getAlumno() + "','" + n.getNota() + "','" + n.getPonderacion() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Nota> read() {
        String query = "Select * from nota";
        Nota n;
        list_Nota = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                n = new Nota();

                n.setId(tablaVirtual.getInt(1));
                n.setAsignatura(tablaVirtual.getString(2));
                n.setAlumno(tablaVirtual.getString(3));
                n.setNota(tablaVirtual.getFloat(4));
                n.setPonderacion(tablaVirtual.getFloat(5));
                list_Nota.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Nota;
    }

    @Override
    public void update(Nota n) {
        String query = "update nota set asignatura =" + n.getAsignatura() + ", alumno_fk = " + n.getAlumno() + ",nota = " + n.getNota() + ",ponderacion = " + n.getPonderacion() + " where id =" + n.getId();
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from nota where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Nota getByID(String id) {
        String query = "Select * from nota id = " + id;
        Nota n;
        list_Nota = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                n = new Nota();

                n.setId(tablaVirtual.getInt(1));
                n.setAsignatura(tablaVirtual.getString(2));
                n.setAlumno(tablaVirtual.getString(3));
                n.setNota(tablaVirtual.getFloat(4));
                n.setPonderacion(tablaVirtual.getFloat(5));
                list_Nota.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Nota.get(0);
    }

    @Override
    public List<Nota> search(String exp) {
        String query = "Select * from nota LIKE '%" + exp + "%'";
        Nota n;
        list_Nota = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                n = new Nota();

                n.setId(tablaVirtual.getInt(1));
                n.setAsignatura(tablaVirtual.getString(2));
                n.setAlumno(tablaVirtual.getString(3));
                n.setNota(tablaVirtual.getFloat(4));
                n.setPonderacion(tablaVirtual.getFloat(5));
                list_Nota.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Nota;
    }

    @Override
    public List<Nota> getNotaByAsig(String asig, int not) {
        String query = "select nota.id, nota.identificador, nota.asignatura, alumno.nombre, nota.nota, nota.ponderacion "
                       + "from asignatura, alumno, nota "
                       + "where nota.alumno_fk = alumno.id and nota.asignatura = asignatura.id "
                       + "and asignatura.nombre = '" + asig + "' and nota.identificador = " + not;
        Nota n;
        list_Nota = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);

        try {
            while (tablaVirtual.next()) {

                n = new Nota();

                n.setId(tablaVirtual.getInt(1));
                n.setIdentificador(tablaVirtual.getInt(2));
                n.setAsignatura(tablaVirtual.getString(3));
                n.setAlumno(tablaVirtual.getString(4));
                n.setNota(tablaVirtual.getFloat(5));
                n.setPonderacion(tablaVirtual.getInt(6));
                        
                list_Nota.add(n);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.desconectar();
        return list_Nota;
    }

    @Override
    public List<Nota> getIdentificador(String asig) {

        String query = "select DISTINCT nota.identificador "
                + "from nota, asignatura "
                + "where nota.asignatura = asignatura.id and asignatura.nombre = '" + asig + "'";

        Nota n;
        list_Nota = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);

        try {
            while (tablaVirtual.next()) {

                n = new Nota();

                n.setIdentificador(tablaVirtual.getInt(1));

                list_Nota.add(n);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();

        return list_Nota;
    }
}
