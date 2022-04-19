import java.util.Arrays;
import java.util.List;

public class ClienteBuilder {
    private Cliente cliente;
    List<Integer> idsTiposConta = Arrays.asList(1,2);
    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public Cliente build() {
        if (cliente.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        if (!validaCpf.isCPF(cliente.getCpf())){
            throw new IllegalArgumentException("CPF inválido");
        }
        if (!idsTiposConta.contains(cliente.getIdTipoConta())){
            throw new IllegalArgumentException("Tipo de conta inválido");
        }
        return cliente;
    }

    public ClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder setTelefone(String telefone) {
        cliente.setTelefone(telefone);
        return this;
    }

    public ClienteBuilder setIdCadastro(int idCadastro) {
        cliente.setIdCadastro(idCadastro);
        return this;
    }

    public ClienteBuilder setIdTipoConta(int idTipoConta) {
        cliente.setIdTipoConta(idTipoConta);
        return this;
    }
}
