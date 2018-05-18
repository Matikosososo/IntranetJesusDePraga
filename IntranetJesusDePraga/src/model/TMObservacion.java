/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import factories.MySQL_AlumnoDAO;
import factories.MySQL_AsignaturaDAO;
import factories.MySQL_ConexionDAO;
import factories.MySQL_ObservacionDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author ahuerta
 */
public class TMObservacion implements TableModel {

    private List<Observacion> list;
    private MySQL_AsignaturaDAO as;
    private MySQL_AlumnoDAO al;

    public TMObservacion(List<Observacion> list) throws ClassNotFoundException, SQLException {
        this.list = list;
        as = new MySQL_AsignaturaDAO();
        al = new MySQL_AlumnoDAO();

    }

    public Observacion getObservacion(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
//            case 0:
//                return "Asignatura";
            default:
                return  "Observacion";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Observacion o = list.get(rowIndex);
        System.out.println(o.getAsignatura());
        switch(columnIndex){
            case 0:
                return o.getId();
//            case 0:
//                Asignatura a = as.getByID(o.getAsignatura());
//                System.out.println(a.getNombre()+" ASIGNA");
//                return a.getNombre();
            default:
              return o.getObservacion();
        }

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
