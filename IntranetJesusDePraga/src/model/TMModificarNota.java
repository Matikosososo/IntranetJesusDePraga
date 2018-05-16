/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import factories.MySQL_AlumnoDAO;
import factories.MySQL_NotaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author valvarado
 */
public class TMModificarNota implements TableModel {

    private List<Nota> lista;
    private MySQL_NotaDAO nota;
    private MySQL_AlumnoDAO al;

    public TMModificarNota(List<Nota> lista) throws ClassNotFoundException, SQLException {
        this.lista = lista;
        nota = new MySQL_NotaDAO();
        al = new MySQL_AlumnoDAO();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre alumno";
            case 1:
                return "Nota";
            default:
                return "Ponderación";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nota n = lista.get(rowIndex);
        switch(rowIndex){
            case 0:
                return n.getAlumno();
            case 1:
                return n.getNota();
            default:
                return n.getPonderacion();
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
