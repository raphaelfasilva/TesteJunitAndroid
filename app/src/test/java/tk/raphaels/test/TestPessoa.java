package tk.raphaels.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import tk.raphaels.Model.Pessoa;
@RunWith(JUnit4.class)
public class TestPessoa{
    @Test
    public void testePessoaComIdadeMenorQue16AnosNaoPodeVotar(){
        Pessoa  pessoa = new Pessoa("Fulano de Tal",14);
        Boolean resultado = pessoa.podeVotar();
        Assertions.assertFalse(resultado);
    }
    @Test
    public void testePessoaComIdadeMaioQue16AnosPodeVotar(){
        Pessoa  pessoa = new Pessoa("Fulano de Tal",16);
        Boolean resultado = pessoa.podeVotar();
        Assertions.assertFalse(resultado);
    }
    @Test
    public void testePessoaComIdademenorQue16AnosPodeVotarComIdadeNegativa(){
        Pessoa  pessoa = new Pessoa("Fulano de Tal",-1);
        Boolean resultado = pessoa.podeVotar();
        Assertions.assertFalse(resultado);
    }
}

