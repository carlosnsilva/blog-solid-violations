package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.Postagens;
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
    public abstract void addPostagem();


    public void addPostagemPublica(Postagem postagem) {
        Postagens postagensPublicas = new Postagens();
        postagensPublicas.addPostagemPublica(postagem, conexao);
    }

     public void addPostagemPrivada(Postagem postagem) {
        Postagens postagensPublicas = new Postagens();
        postagensPublicas.addPostagemPrivada(postagem, conexao);
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
