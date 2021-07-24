package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Usuario;
import br.edu.ifpb.padroes.service.UsuarioServiceImpl;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class UsuarioDAO extends DAO{

    private Connection conexao = connect();
    private String arquivoBanco;
    public UsuarioDAO(String arquivoBanco) {
        super(arquivoBanco);
    }

    public void addUsuario(Usuario usuario) {
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (?, ?, ?, ?)")) {
            stmt.setLong(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
        } catch (SQLException ex) {
            this.trataExcecao(ex);
        }
    }

    public void updateUsuario(Usuario usuario) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void deleteUsuario(Usuario usuario) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public List<Usuario> listUsuarios() {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public Usuario getUsuario(Long id) {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public void trataExcecao(Exception ex) {
        Logger.getLogger(UsuarioServiceImpl.class.getName()).warning(ex.getMessage());
    }


}
