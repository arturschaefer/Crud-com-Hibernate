package cgd;

import cdp.Mudas;
import java.util.List;

/**
 *
 * @author Artur
 */
public class MudaDAO extends GenericaDAO{
    public MudaDAO(){
        super();
    }

    public List<Mudas> listarTodos() {
        return listar(Mudas.class);
    }
   
}
