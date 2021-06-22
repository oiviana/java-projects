
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author viana
 */
public class AlunoTableModel extends AbstractTableModel {
    private List<Aluno> dados = new ArrayList<>();
    private String [] colunas = {"Nome", "RA", "RG", "CPF", "Data de Nascimento", "Data do cadastro"};
    
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
            case 1: return dados.get(linha).getRa();
            case 2: return dados.get(linha).getRg();
            case 3: return dados.get(linha).getCpf();
            case 4: return dados.get(linha).getDtnasc();
            case 5: return dados.get(linha).getDtcadastro();
        }
        return null;
    }
    
    public void addRow(Aluno a){
        this.dados.add(a);
        this.fireTableDataChanged();
    }

    void clearRows() {
          dados.clear();
    }


 
}
