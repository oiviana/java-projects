/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna_eletronica.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viana
 */
public class CandidatoDAO {
    String sSql;
    Connection con;
    PreparedStatement pstmt;
    
    
        // ---------------------------------------------------------------------------------
    public Candidato consultaCandidato(String numero) {
        ResultSet rs;
        Candidato c = new Candidato();
        con = null;

        sSql = "SELECT can_numero, can_nome, can_vice, can_partido," 
                + " can_foto, can_fotovice, can_votos FROM candidato "
                + "WHERE can_numero = ? ";
      
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, numero);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                c.setNome(rs.getString("can_nome"));
                c.setVice(rs.getString("can_vice"));
                c.setPartido(rs.getString("can_partido"));
                c.setFoto(rs.getString("can_foto"));
                c.setFotovice(rs.getString("can_fotovice"));
            } else {
                c = null;
            }
            pstmt.close();
            rs.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao consultar aluno - " + erro.getMessage());
        }
        return c;
    }
    // ---------------------------------------------------------------------------------

        public void atualizaVoto(String numero) {
        sSql = "UPDATE candidato SET can_votos = can_votos + 1 WHERE can_numero = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, numero);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
           
        } catch (SQLException erro) {
            System.out.println("Erro ao Atualizar - " + erro.getMessage());
        }
     
    }
        
    // ---------------------------------------------------------------------------------


            public List<Candidato> listarCandidatos() {
        List listadeCandidatos = new ArrayList();
        ResultSet rs;
        Candidato c;
        sSql = "SELECT can_nome, can_numero, can_partido, can_vice, can_votos FROM candidato ORDER BY can_votos DESC";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                c = new Candidato();
                c.setNome(rs.getString("can_nome"));
                c.setNumero(rs.getInt("can_numero"));
                c.setPartido(rs.getString("can_partido"));
                c.setVice(rs.getString("can_vice"));
                c.setNumvotos(rs.getInt("can_votos"));
                listadeCandidatos.add(c);
            }
        } catch (SQLException erro) {
            listadeCandidatos = null;
            //System.out.println("Erro ao consultar aluno - " + erro.getMessage());
        }
        return listadeCandidatos;
    }
// ---------------------------------------------------------------------------------
        
            public void resetaNumVotos() {
        sSql = "UPDATE candidato SET can_votos = 0";
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
                 
            public void votoNulo() {
        sSql = "UPDATE candidato SET can_votos = can_votos + 1 WHERE can_nome= 'Nulos'";
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
