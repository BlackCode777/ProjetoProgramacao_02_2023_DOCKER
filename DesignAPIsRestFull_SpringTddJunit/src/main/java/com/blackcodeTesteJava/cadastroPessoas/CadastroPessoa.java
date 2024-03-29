package com.blackcodeTesteJava.cadastroPessoas;

import com.blackcodeTesteJava.Pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {

    private List<Pessoa> pessoas;

    public CadastroPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getCadastroPessoa() {
        return this.pessoas;
    }

    public void adicionar(Pessoa pessoa) {
        if( pessoa.getNome() == null ){
            throw new PessoaSemNotException();
        }
        this.pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        if(this.pessoas.isEmpty()){
            throw new CadastroVazioException();
        }
        this.pessoas.remove(pessoa);
    }
}
