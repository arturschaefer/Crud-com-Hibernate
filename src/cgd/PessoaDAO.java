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

    public List<Pessoa> pesquisarNome(String pesq) {
        return listar(Pessoa.class);
    }
    
    public List<Pessoa> procuraPessoa(String nome){
        List<Pessoa> pes = null;
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();
            
            Criteria criteria = sessao.createCriteria(Pessoa.class)
   .add(Restrictions.like("nome", "%"+nome+"%"));
            
            pes = criteria.list();
            
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
        return pes;
    }
}
