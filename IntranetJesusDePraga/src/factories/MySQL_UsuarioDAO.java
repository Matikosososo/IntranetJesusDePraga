package factories;

import dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class MySQL_UsuarioDAO implements UsuarioDAO {

    private ResultSet tablaVirtual;
    private List<Usuario> list_Usuarios;
    MySQL_ConexionDAO c;

    public MySQL_UsuarioDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);
    }

    @Override
    public void create(Usuario u) {
        String query = "insert into usuario values(null,'" + u.getRut_usuario() + "','" + u.getTipo() + "',md5('" + u.getContrasenia() + "'))";
        c.ejecutar(query);
    }

    @Override
    public List<Usuario> read() {
        String query = "Select * from usuario";
        Usuario u;
        list_Usuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                u = new Usuario();

                u.setId(tablaVirtual.getInt(1));
                u.setRut_usuario(tablaVirtual.getString(2));
                u.setTipo(tablaVirtual.getInt(3));
                u.setContrasenia(tablaVirtual.getString(4));
                list_Usuarios.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Usuarios;
    }

    @Override
    public void update(Usuario u) {
        String query = "update usuario set rut =" + u.getRut_usuario() + ", tipo_de_usuario = " + u.getTipo() + ",contraseña = " + u.getContrasenia() + " where id =" + u.getId();
        c.ejecutar(query);
    }

    @Override
    public void delete(String id) {
        String query = "delete from usuario where id = '" + id+"'";
        c.ejecutar(query);
    }

    @Override
    public Usuario getByID(String id) {
        String query = "Select * from usuario where id = " + id;
        Usuario u;
        list_Usuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                u = new Usuario();

                u.setId(tablaVirtual.getInt(1));
                u.setRut_usuario(tablaVirtual.getString(2));
                u.setTipo(tablaVirtual.getInt(3));
                u.setContrasenia(tablaVirtual.getString(4));
                list_Usuarios.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Usuarios.get(0);
    }

    @Override
    public List<Usuario> search(String exp) {
        String query = "Select * from usuario where rut LIKE '%"+exp+"%'";
        Usuario u;
        list_Usuarios = new ArrayList<>();
        tablaVirtual = c.ejecutarSelect(query);
        try {
            while (tablaVirtual.next()) {
                u = new Usuario();

                u.setId(tablaVirtual.getInt(1));
                u.setRut_usuario(tablaVirtual.getString(2));
                u.setTipo(tablaVirtual.getInt(3));
                u.setContrasenia(tablaVirtual.getString(4));
                list_Usuarios.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return list_Usuarios;
    }

    @Override
    public String getByRut(String rut) {
        String query = "Select * from usuario where rut = '"+rut+"'";
        Usuario u;
        String rutExp = "";
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                u = new Usuario();

                u.setId(tablaVirtual.getInt(1));
                u.setRut_usuario(tablaVirtual.getString(2));
                u.setTipo(tablaVirtual.getInt(3));
                u.setContrasenia(tablaVirtual.getString(4));
                
                rutExp = u.getRut_usuario();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return rutExp;
    }

    @Override
    public String getByPass(String pass) {
        String query = "Select * from usuario where contraseña = '"+pass+"'";
        Usuario u;
        String passExp = "";
        tablaVirtual = c.ejecutarSelect(query);
        try {
            if (tablaVirtual.next()) {
                u = new Usuario();

                u.setId(tablaVirtual.getInt(1));
                u.setRut_usuario(tablaVirtual.getString(2));
                u.setTipo(tablaVirtual.getInt(3));
                u.setContrasenia(tablaVirtual.getString(4));
                
                passExp = u.getContrasenia();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.desconectar();
        return passExp;
    }

   
}
