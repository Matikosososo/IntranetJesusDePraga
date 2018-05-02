package factories;

import dao.TipoUsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Tipo_usuario;

public class MySQL_TipoUsuarioDAO implements TipoUsuarioDAO {

    private ResultSet tablaVirtual;
    private List<Tipo_usuario> list_TipoUsuarios;
    MySQL_ConexionDAO c;

    public MySQL_TipoUsuarioDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Tipo_usuario t) {
        String query = "insert into tipo_de_usuario values(null,'" + t.getTipo() + "')";
        c.ejecutar(query);
    }

    @Override
    public List<Tipo_usuario> read() {
        String query = "Select * from tipo_de_usuario";
        Tipo_usuario tU;
        list_TipoUsuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                tU = new Tipo_usuario();

                tU.setId(tablaVirtual.getInt(1));
                tU.setTipo(tablaVirtual.getString(2));
                list_TipoUsuarios.add(tU);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_TipoUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_TipoUsuarios;
    }

    @Override
    public void update(Tipo_usuario t) {
        String query = "update tipo_de_usuario set nombre = " + t.getTipo() + " where id = " + t.getId() + " ";
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from tipo_de_usuario where id = " + id;
        c.ejecutar(query);
    }

    @Override
    public Tipo_usuario getByID(String id) {
        String query = "Select * from tipo_de_usuario id = " + id;
        Tipo_usuario tU;
        list_TipoUsuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                tU = new Tipo_usuario();

                tU.setId(tablaVirtual.getInt(1));
                tU.setTipo(tablaVirtual.getString(2));
                list_TipoUsuarios.add(tU);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_TipoUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_TipoUsuarios.get(0);
    }

    @Override
    public List<Tipo_usuario> search(String exp) {
        String query = "Select * from tipo_de_usuario LIKE '%"+exp+"%'";
        Tipo_usuario tU;
        list_TipoUsuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                tU = new Tipo_usuario();

                tU.setId(tablaVirtual.getInt(1));
                tU.setTipo(tablaVirtual.getString(2));
                list_TipoUsuarios.add(tU);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_TipoUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_TipoUsuarios;
    }
}
