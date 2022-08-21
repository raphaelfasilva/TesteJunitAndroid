package tk.raphaels.test;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.mockito.Mockito.*;
import tk.raphaels.controller.PessoaController;
import tk.raphaels.model.Pessoa;
@RunWith(JUnit4.class)
public class TestePessoaJunitMockito {
    PessoaController pessoaController = null;
    Pessoa pessoa = null;
    @Before
    public void setUP(){
        pessoa = new Pessoa();
    }
    @Test
    public void testePessoaComIdadeMaioQue16AnosPodeVotar(){
        pessoa.setNome("Fulano");
        pessoa.setIdade(16);
        PessoaController pessoaController = mock(PessoaController.class);
        when(pessoaController.Podevotar(pessoa.getIdade())).thenReturn(true);
        Assertions.assertTrue(pessoaController.Podevotar(pessoa.getIdade()));
    }
    @Test
    public void testePessoaComIdadeMenorQue16AnosPodeVotar(){
        pessoa.setNome("Ciclano");
        pessoa.setIdade(14);
        PessoaController pessoaController = mock(PessoaController.class);
        when(pessoaController.Podevotar(pessoa.getIdade())).thenReturn(false);
        Assertions.assertFalse(pessoaController.Podevotar(pessoa.getIdade()));
    }
}
