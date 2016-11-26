/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cgd;

import java.util.List;
import cdp.Pessoa;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/*
 * Autor:           aschaefer
 * Data:            21/11/2016
 * Hora:            15:38:24
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       PessoaDAO
 * Pacote de Criação:   cgd
 */

public class PessoaDAO extends GenericaDAO{
    public PessoaDAO(){
        super();
    }

    public List<Pessoa> listarTodos() {
        return listar(Pessoa.class);
    }
    
    public List<Pessoa> procuraPessoa(String nome){
        return  procuraPorNome(Pessoa.class, nome);
    }
}
