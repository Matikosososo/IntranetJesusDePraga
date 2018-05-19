package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMProfesor implements TableModel{
    private List<Profesor> lisProfe;

    public TMProfesor(List<Profesor> lisProfe) {
        this.lisProfe = lisProfe;
    }
    
    public  Profesor getProfesor(int index){
    return lisProfe.get(index);
    }
    @Override
    public int getRowCount() {
        return lisProfe.size();
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
        Profesor p = lisProfe.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getNombre();
            default:
                return p.getRut();
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
