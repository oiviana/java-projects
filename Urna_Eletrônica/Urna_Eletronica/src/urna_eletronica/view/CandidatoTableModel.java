package urna_eletronica.view;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import urna_eletronica.data.Candidato;
/**
 *
 * @author viana
 */
public class CandidatoTableModel extends AbstractTableModel {
    private List<Candidato> dados = new ArrayList<>();
    private String [] colunas = {"Nome", "Número", "Partido", "Vice", "Votos"};
    
    @Override
    public String getColumnName(int column) {
       return colunas[column];
    }
    
    
    @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return dados.get(linha).getNome();
            case 1: return dados.get(linha).getNumero();
            case 2: return dados.get(linha).getPartido();
            case 3: return dados.get(linha).getVice();
            case 4: return dados.get(linha).getNumvotos();
        }
        return null;
    }
    
    public void addRow(Candidato c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }

    void clearRows() {
          dados.clear();
    }


 
}
