package com.blackcodeTesteJava;

import com.blackcodeTesteJava.Pessoas.Pessoa;
import com.blackcodeTesteJava.cadastroPessoas.CadastroPessoa;
import com.blackcodeTesteJava.cadastroPessoas.CadastroVazioException;
import com.blackcodeTesteJava.cadastroPessoas.PessoaSemNotException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadastroPessoasTest {

    // public void

    @Test
    @DisplayName("Deve criar o cadastro de pessoas.")
    public void deveCriarClassCadastroPessoa(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Assertions.assertThat( cadastroPessoa.getCadastroPessoa() ).isEmpty();
    }

    @Test
    @DisplayName("Deve adicionar uma pessoas.")
    public void deveAdicionarUmaPessoa(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Simone");
        // executa
        cadastroPessoa.adicionar(pessoa);
        // Verifica
        Assertions.assertThat( cadastroPessoa.getCadastroPessoa() )
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test
    @DisplayName("Não deve adicionar uma pessoa com nome vazio.")
    public void naoDeveAdicionarpessoaComNomeVazio(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();

        // Execução
        org.junit.jupiter.api.Assertions
                        .assertThrows(
                                PessoaSemNotException.class, () -> cadastroPessoa.adicionar(pessoa)
                        );
    }

    @Test
    @DisplayName("Deveremover uma pessoas.")
    public void deveRemoverUmaPessoa(){
        //Cenário de teste
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Simone");
        cadastroPessoa.adicionar(pessoa);
        //Execução do cenário de teste
        cadastroPessoa.removerPessoa(pessoa);
        //Verificação
        Assertions.assertThat( cadastroPessoa.getCadastroPessoa() ).isEmpty();
    }

    @Test
    @DisplayName("Deve mostrar um erro ao remover uma pessoa que não existe no banco.")
    public void deveMostrarErroAoTentarRemoverPessoaInexistente(){
        //cenario
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();
        //execucao
        org.junit.jupiter.api.Assertions
                .assertThrows(
                        CadastroVazioException.class, () -> cadastroPessoa.removerPessoa(pessoa)
                );

    }

}
