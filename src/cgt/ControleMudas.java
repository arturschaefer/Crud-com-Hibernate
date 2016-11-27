package cgt;

import cdp.Mudas;
import cgd.MudaDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ControleMudas {

    MudaDAO mudaDAO;

    public ControleMudas() {
        mudaDAO = new MudaDAO();
    }

    public int inserirMuda(Mudas muda) throws SQLException, ClassNotFoundException {
        mudaDAO.inserir(muda);
        return muda.getIdMudas();
    }

    public int alterarMuda(Mudas pes) throws ClassNotFoundException, SQLException {
        mudaDAO.alterar(pes);
        return pes.getIdMudas();
    }

    public void excluirMuda(Mudas muda) throws SQLException {
        mudaDAO.excluir(muda);
    }

    public List<Mudas> listarMudas(int tipo, String pesq) throws SQLException {
        List<Mudas> lista = null;
        switch (tipo) {
            case 0:
                lista = mudaDAO.listarTodos();
                break;
            case 1:
                lista = mudaDAO.procuraPorNome(Mudas.class, "idMudas", pesq);
                break;
            case 2:
                lista = mudaDAO.procuraPorNome(Mudas.class, "nome", pesq);
                break;
        }

        return lista;
    }
}
