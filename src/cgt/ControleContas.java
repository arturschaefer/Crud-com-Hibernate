package cgt;

import cdp.Conta;
import cdp.Pessoa;
import cgd.ContaDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ControleContas {
    ContaDAO contaDAO;

    public ControleContas() {
        contaDAO = new ContaDAO();
    }

    public int inserirConta(Conta cont) throws SQLException, ClassNotFoundException {
        contaDAO.inserir(cont);
        return cont.getIdConta();
    }

    public int alterarConta(Conta cont) throws ClassNotFoundException, SQLException {
        contaDAO.alterar(cont);
        return cont.getIdConta();
    }

    public void excluirVeiculo(Conta cont) throws SQLException {
        contaDAO.excluir(cont);
    }

    public List<Conta> listarContas(int tipo, String pesq) throws SQLException {
        List<Conta> lista = null;
        switch (tipo) {
            case 0:
                lista = contaDAO.listarTodos();
                break;
            case 1:
                lista = contaDAO.procuraPorNome(Pessoa.class, "cpf", pesq);
                break;
        }

        return lista;
    }
}
