package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

public interface adicionarRespostaService {
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
