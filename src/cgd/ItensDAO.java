/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgd;

import cdp.Mudas;
import java.util.List;

/**
 *
 * @author Artur
 */
public class ItensDAO extends GenericaDAO{
    public ItensDAO(){
        super();
    }
    
    public List<Mudas> listarTodos() {
        return listar(Mudas.class);
    }            
}
