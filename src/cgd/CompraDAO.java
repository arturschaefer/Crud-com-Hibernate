package cgd;

import cdp.Compra;
import cdp.Pessoa;
import java.util.List;

/**
 *
 * @author Artur
 */
public class CompraDAO extends GenericaDAO{
    public CompraDAO(){
        super();
    }

    public List<Compra> listarTodos() {
        return listar(Compra.class);
    }
    
    public List<Compra> procuraCompra(String nomeColuna, String nomepesq){
        return  procuraPorNome(Pessoa.class,nomeColuna, nomepesq);
    }
    
    
}
