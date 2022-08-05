/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTObiblioteca;

/**
 *
 * @author clsedu
 */
public class PrincipalDTO {
    
    private int id_codigo_livro;
    private String titulo_livro;
    private String autor_livro;
    private String editora_livro;
    private String edicao_livro;
    private int ano_livro;

    public int getId_codigo_livro() {
        return id_codigo_livro;
    }

    public void setId_codigo_livro(int id_codigo_livro) {
        this.id_codigo_livro = id_codigo_livro;
    }

   

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }

    public String getEditora_livro() {
        return editora_livro;
    }

    public void setEditora_livro(String editora_livro) {
        this.editora_livro = editora_livro;
    }

    public String getEdicao_livro() {
        return edicao_livro;
    }

    public void setEdicao_livro(String edicao_livro) {
        this.edicao_livro = edicao_livro;
    }

    public int getAno_livro() {
        return ano_livro;
    }

    public void setAno_livro(int ano_livro) {
        this.ano_livro = ano_livro;
    }
    
    
    
}
