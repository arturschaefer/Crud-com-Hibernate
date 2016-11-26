package cgd;

import cdp.Conta;
import cdp.Pessoa;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ContaDAO extends GenericaDAO {

    public ContaDAO() {
        super();
    }

    public List<Conta> listarTodos() {
        return listar(Conta.class);
    }

    public Conta procuraPessoa(String nome) {
        Pessoa pes = (Pessoa) procuraPorNome(Pessoa.class,"nome", nome).get(0);
        return pes.getConta();
    }
}
