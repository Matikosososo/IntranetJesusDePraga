package factories;

import dao.ProfesorDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Profesor;

public class MySQL_ProfesorDAO implements ProfesorDAO {

    private ResultSet tablaVirtual;
    private List<Profesor> list_Profesores;
    MySQL_ConexionDAO c;

    public MySQL_ProfesorDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Profesor p) {
        String query = "insert into profesor values(null,'" + p.getNombre() + "','" + p.getRut() + "','" + p.getUsuario() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Profesor> read() {
        String query = "Select * from profesor";
        Profesor p;
        list_Profesores = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                p = new Profesor();

                p.setId(tablaVirtual.getInt(1));
                p.setNombre(tablaVirtual.getString(2));
                p.setRut(tablaVirtual.getString(3));

                list_Profesores.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ProfesorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Profesores;
    }

    @Override
    public void update(Profesor p) {
        String query = "update profesor set "
                + "id = '" + p.getId() + "'"
                + ", nombre = '" + p.getNombre() + "' "
                + ",rut = '" + p.getRut() + "' where id = '" + p.getId() + "'";
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from profesor where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Profesor getByID(String id) {
        String query = "Select * from profesor where id = " + id;
        Profesor p;
        list_Profesores = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                p = new Profesor();

                p.setId(tablaVirtual.getInt(1));
                p.setNombre(tablaVirtual.getString(2));
                p.setRut(tablaVirtual.getString(3));

                list_Profesores.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ProfesorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Profesores.get(0);
    }

    @Override
    public List<Profesor> search(String exp) {
        String query = "Select nombre,rut from profesor where nombre LIKE '%" + exp + "%'";
        Profesor p;
        list_Profesores = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                p = new Profesor();

                p.setNombre(tablaVirtual.getString(1));
                p.setRut(tablaVirtual.getString(2));

                list_Profesores.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ProfesorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Profesores;
    }
}
