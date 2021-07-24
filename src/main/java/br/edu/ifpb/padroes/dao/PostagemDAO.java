package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;
import br.edu.ifpb.padroes.service.UsuarioServiceImpl;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class PostagemDAO extends DAO {

    private Connection conexao = connect();
    private String arquivoBanco;
    public PostagemDAO(String arquivoBanco) {
        super(arquivoBanco);

    }

    public void addPostagemPublica(Postagem postagem) {
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO POSTAGEM( ID, TITULO, USUARIO_ID, MENSAGEM, TIPO) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setLong(1, postagem.getId());
            stmt.setString(2, postagem.getTitulo());
            stmt.setLong(3, postagem.getUsuario().getId());
            stmt.setString(4, postagem.getMensagem());
            stmt.setString(5, Postagem.PostagemTipo.PUBLICA.toString());
            stmt.execute();
        } catch (SQLException ex) {
            this.trataExcecao(ex);
        }
    }

    public void addPostagemPrivada(Postagem postagem) {
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO POSTAGEM( ID, TITULO, USUARIO_ID, MENSAGEM, TIPO) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setLong(1, postagem.getId());
            stmt.setString(2, postagem.getTitulo());
            stmt.setLong(3, postagem.getUsuario().getId());
            stmt.setString(4, postagem.getMensagem());
            stmt.setString(5, Postagem.PostagemTipo.PRIVADA.toString());
            stmt.execute();
        } catch (SQLException ex) {
            this.trataExcecao(ex);
        }
    }

    public void addPostagemResposta(PostagemResposta postagem) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void updatePostagem(Postagem postagem) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void deletePostagem(Postagem postagem) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public List<Postagem> listPostagens() {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public Postagem getPostagem(Long id) {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public void trataExcecao(Exception ex) {
        Logger.getLogger(UsuarioServiceImpl.class.getName()).warning(ex.getMessage());
    }


}
