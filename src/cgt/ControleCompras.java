package cgt;

import cdp.Compra;
import cdp.Pessoa;
import cgd.CompraDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ControleCompras {
    CompraDAO compraDAO;

    public ControleCompras() {
        compraDAO = new CompraDAO();
    }

    public int inserirCompra(Compra compra) throws SQLException, ClassNotFoundException {
        compraDAO.inserir(compra);
        return compra.getIdCompra();
    }

    public int alterarPessoa(Compra compra) throws ClassNotFoundException, SQLException {
        compraDAO.alterar(compra);
        return compra.getIdCompra();
    }

    public void excluirPessoa(Compra compra) throws SQLException {
        compraDAO.excluir(compra);
    }

    public List<Compra> listarCompras(int tipo, String pesq) throws SQLException {
        List<Compra> lista = null;
        switch (tipo) {
            case 0:
                lista = compraDAO.listarTodos();
                break;
            case 1:
                lista = compraDAO.procuraCompra("idCompra", "1");
                break;
        }

        return lista;
    }
}
