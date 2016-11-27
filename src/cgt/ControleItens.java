package cgt;

import cdp.Itens;
import cgd.ItensDAO;
import java.sql.SQLException;

/**
 *
 * @author Artur
 */
public class ControleItens {
    ItensDAO itensDAODAO;

    public ControleItens() {
        itensDAODAO = new ItensDAO();
    }

    public int inserirIten(Itens item) throws SQLException, ClassNotFoundException {
        itensDAODAO.inserir(item);
        return item.getIdItens();
    }
}
