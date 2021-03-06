/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import factories.MySQL_AsignaturaDAO;
import factories.MySQL_ProfesorDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcos
 */
public class TMAsignatura implements TableModel{
    private List<Asignatura> listAsig;
    private  MySQL_ProfesorDAO pro;

    public TMAsignatura(List<Asignatura> listAsig) throws ClassNotFoundException, SQLException {
        this.listAsig = listAsig;
        pro = new MySQL_ProfesorDAO();
    }
    
    public Asignatura getAsignatura(int index){
    return listAsig.get(index);
    }
    
    @Override
    public int getRowCount() {
        return listAsig.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Nombre";
            default:
                return "Asignatura";
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
        Asignatura a = listAsig.get(rowIndex);
        switch(columnIndex){
           case 0:
               return a.getNombre();
           default:
               Profesor p = pro.getByID(String.valueOf(a.getProfesor()));
               return p.getNombre();
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
