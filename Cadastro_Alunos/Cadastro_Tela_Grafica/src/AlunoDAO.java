import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AlunoDAO {

    String sSql;
    Connection con;
    PreparedStatement pstmt;
    
    Date data = new Date();
    SimpleDateFormat formatarData = new SimpleDateFormat("d/MM/y");

    public void adicionarAluno(Aluno a) {
        try {
            // 1° Abrir conexao
            // 2° Preparar a instrução SQL
            // 3° Setar parâmetros
            // 4° Executar a instrução SQL
            // 5° Fechar conexao

            con = Conexao.getConexao();
            pstmt = con.prepareStatement("INSERT INTO aluno(alu_ra,"
                    + " alu_cpf, alu_rg, alu_nome, alu_dtnascimento,"
                    + " alu_email, alu_email2, alu_dddtel, alu_telefone,"
                    + " alu_dddcel, alu_celular, alu_cep, alu_rua,"
                    + " alu_numero, alu_bairro, alu_cidade, alu_uf,"
                    + " alu_observ, alu_dtcadastro, alu_situacao)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, a.getRa());
            pstmt.setString(2, a.getCpf());
            pstmt.setString(3, a.getRg());
            pstmt.setString(4, a.getNome());
            pstmt.setString(5, a.getDtnasc());
            pstmt.setString(6, a.getEmail());
            pstmt.setString(7, a.getEmailalt());
            pstmt.setString(8, a.getDddtel());
            pstmt.setString(9, a.getTel());
            pstmt.setString(10, a.getDddcel());
            pstmt.setString(11, a.getCel());
            pstmt.setString(12, a.getCep());
            pstmt.setString(13, a.getRua());
            pstmt.setInt(14, a.getNumero());
            pstmt.setString(15, a.getBairro());
            pstmt.setString(16, a.getCidade());
            pstmt.setString(17, a.getUf());
            pstmt.setString(18, a.getObserv());
            pstmt.setString(19, formatarData.format(data));
            pstmt.setString(20, a.getSituacao());
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar aluno" + erro.getMessage());
            System.out.println("Erro ao cadastrar aluno" + erro.getMessage());
        }
    }

    // ---------------------------------------------------------------------------------
    public Aluno consultaAlunoPorRA(String ra) {
        ResultSet rs;
        Aluno a;
        a = new Aluno();
        con = null;

        sSql = "SELECT alu_ra, alu_nome, alu_email FROM aluno "
                + "WHERE alu_ra = ? ";
        //System.out.println(sSql);
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, ra);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                // a = new Aluno();
                a.setRa(rs.getString("alu_ra"));
                a.setNome(rs.getString("alu_nome"));
                a.setEmail(rs.getString("alu_email"));
            } else {
                //System.out.println("RA não cadastrado...");
                a = null;
            }
            pstmt.close();
            rs.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao consultar aluno - " + erro.getMessage());
        }
        return a;
    }
    // ---------------------------------------------------------------------------------

    public List<Aluno> listarAlunos() {
        List listadeAluno = new ArrayList();
        ResultSet rs;
        Aluno a;
        sSql = "SELECT alu_nome, alu_ra, alu_rg, alu_cpf, alu_dtnascimento, alu_dtcadastro FROM aluno ORDER BY alu_nome";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                a = new Aluno();
                a.setNome(rs.getString("alu_nome"));
                a.setRa(rs.getString("alu_ra"));
                a.setRg(rs.getString("alu_rg"));
                a.setCpf(rs.getString("alu_cpf"));
                a.setDtnasc(rs.getString("alu_dtnascimento"));
                a.setDtcadastro(rs.getString("alu_dtcadastro"));
                listadeAluno.add(a);
            }
        } catch (SQLException erro) {
            listadeAluno = null;
            //System.out.println("Erro ao consultar aluno - " + erro.getMessage());
        }
        return listadeAluno;
    }
// ---------------------------------------------------------------------------------

    public void excluirAluno(String ra) {
        sSql = "DELETE FROM aluno WHERE alu_ra = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, ra);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir aluno - " + erro.getMessage());
        }
    }
}
