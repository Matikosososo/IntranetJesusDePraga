package factories;

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

}
