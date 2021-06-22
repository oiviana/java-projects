package urna_eletronica.data;

/**
 *
 * @author viana
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EleitorDAO {
    String sSql;
    Connection con;
    PreparedStatement pstmt;
    
    public Eleitor acessaEleitor(String rg) {
        ResultSet rs;
        Eleitor e = new Eleitor();
        con = null;

        sSql = "SELECT ele_titulo, ele_rg, ele_nome, ele_votou" 
                + " FROM eleitor "
                + "WHERE ele_rg = ?";
      
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, rg);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                e.setNome(rs.getString("ele_nome"));
                e.setTitulo(rs.getString("ele_titulo"));
                e.setRg(rs.getString("ele_rg"));
                e.setVoto(rs.getString("ele_votou"));
            } else {
                e = null;
            }
            pstmt.close();
            rs.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao consultar aluno - " + erro.getMessage());
        }
        return e;
    }
    // ---------------------------------------------------------------------------------
    
    public void atualizaStatus(String rg) {
        sSql = "UPDATE eleitor SET ele_votou = 'S' WHERE ele_rg = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, rg);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
           
        } catch (SQLException erro) {
            System.out.println("Erro ao Atualizar - " + erro.getMessage());
        }
     
    }
    // ---------------------------------------------------------------------------------
            public void resetaVotos() {
        sSql = "UPDATE eleitor SET ele_votou = 'N'";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
           
        } catch (SQLException erro) {
            System.out.println("Erro ao Atualizar - " + erro.getMessage());
        }
     
    }       
    // ---------------------------------------------------------------------------------
        
}
