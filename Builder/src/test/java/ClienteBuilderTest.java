import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteBuilderTest {

    @Test
    void deveRetornarExcecaoClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setCpf("07524559070")
                    .setIdTipoConta(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteSemCpf() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Jorge")
                    .setIdTipoConta(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCpfInvalido() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Jorge")
                    .setCpf("000000000000")
                    .setIdTipoConta(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteSemTipoDeConta() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Jorge")
                    .setCpf("07524559070")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de conta inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteTipoDeContaInvalido() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Jorge")
                    .setCpf("07524559070")
                    .setIdTipoConta(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de conta inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setNome("Jorge")
                .setCpf("07524559070")
                .setIdTipoConta(1)
                .build();
        assertNotNull(cliente);
    }
}
