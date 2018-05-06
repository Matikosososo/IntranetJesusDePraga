package factories;

import dao.AlumnoDAO;
import dao.AsignaturaDAO;
import dao.AsistenciaDAO;
import dao.HorarioDAO;
import dao.NotaDAO;
import dao.ObservacionDAO;
import dao.ProfesorDAO;
import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import exception.MotorNoSoportadoException;
import java.sql.SQLException;

public class DAOFactory {

    private static DAOFactory daoFactory;

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }

        return daoFactory;
    }

    public enum Motor {
        MY_SQL, ORACLE, MS_SQL
    }
    
    public AlumnoDAO getAlumnoDAO(Motor motor) throws MotorNoSoportadoException, SQLException, ClassNotFoundException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AlumnoDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public AsignaturaDAO getAsignaturaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AsignaturaDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public AsistenciaDAO getAsistenciaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AsistenciaDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public HorarioDAO getHorarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_HorarioDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public NotaDAO getNotaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_NotaDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public ObservacionDAO getObservDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_ObservacionDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public ProfesorDAO getProfesorDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_ProfesorDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public TipoUsuarioDAO getTipoUsuarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_TipoUsuarioDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    public UsuarioDAO getUsuarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException{
        switch(motor){
            case MY_SQL:
                return new MySQL_UsuarioDAO();
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
}
