package br.edu.ifpb.padroes.modelo;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.*;

import java.sql.Connection;

public abstract class TipoPostagem {
    public abstract void addPostagemPublica(Postagem postagem, Connection conexao);
    public abstract void addPostagemPrivada(Postagem postagem, Connection conexao);

}
