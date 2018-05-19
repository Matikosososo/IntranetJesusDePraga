/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Lilo
 */
public class TMAlumno implements TableModel {

    private List<Alumno> listALum;

    public TMAlumno(List<Alumno> listALum) {
        this.listALum = listALum;
    }

    public Alumno getAlumno(int index) {
        return listALum.get(index);
    }

    @Override
    public int getRowCount() {
        return listALum.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre";
            default:
                return "Rut";
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
        Alumno a = listALum.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getNombre();
            default:
                return a.getRut();

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
