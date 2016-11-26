package cgd;

import cdp.Viveiro;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ViveiroDAO extends GenericaDAO{
    public ViveiroDAO(){
        super();
    }

    public List<Viveiro> listarTodos() {
        return listar(Viveiro.class);
    }
}
