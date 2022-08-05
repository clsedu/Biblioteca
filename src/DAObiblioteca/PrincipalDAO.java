/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAObiblioteca;

import DTObiblioteca.PrincipalDTO;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author clsedu
 */
public class PrincipalDAO {
    
       Connection conn;
       PreparedStatement pstm;
       ResultSet rs;
       ArrayList<PrincipalDTO> lista = new ArrayList<>();
//    
    public void cadastrarLivro(PrincipalDTO objprincipaldto){
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "insert into livros (titulo_livro, autor_livro, editora_livro, edicao_livro, ano_livro) values (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprincipaldto.getTitulo_livro());
            pstm.setString(2, objprincipaldto.getAutor_livro());
            pstm.setString(3, objprincipaldto.getEditora_livro());
            pstm.setString(4, objprincipaldto.getEdicao_livro());
            pstm.setInt(5, objprincipaldto.getAno_livro());
            
            pstm.execute();
            pstm.close();
        
            
            //ResultSet rs = pstm.executeQuery();
            //return rs;
            
        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null,"PrinicpalDAO: "+ erro);
            
        }
    
   
       }
    
    public ArrayList<PrincipalDTO> PesquisarLivro(){
        String sql = "select * from livros";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
           while(rs.next()){
               PrincipalDTO objprincipaldto = new PrincipalDTO();
               objprincipaldto.setId_codigo_livro(rs.getInt("id_codigo_livro"));
               objprincipaldto.setTitulo_livro(rs.getString("titulo_livro"));
               objprincipaldto.setAutor_livro(rs.getString("autor_livro"));
               objprincipaldto.setEditora_livro(rs.getString("editora_livro"));
               objprincipaldto.setEdicao_livro(rs.getString("edicao_livro"));
               objprincipaldto.setAno_livro(rs.getInt("ano_livro"));
               
               lista.add(objprincipaldto);
               
           }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"PrincipalDAO Pesquisar" +  erro);
        }
        return lista;
     }
    
    }
    

