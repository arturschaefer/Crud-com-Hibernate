package cgd;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/*
 * Autor:           aschaefer
 * Data:            21/11/2016
 * Hora:            14:57:17
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       GenericaDAO
 * Pacote de Criação:   cgd
 */
public class GenericaDAO {

    public void gerarBanco() {
        Session sessao = retornaSessao();
        sessao.close();
    }

    public Session retornaSessao() {
        Session sess = null;
        try {
            sess = HibernateUtil.getSessionFactory().getCurrentSession();
        } catch (org.hibernate.HibernateException he) {
            sess = HibernateUtil.getSessionFactory().openSession();
        }
        return sess;
    }

    public void inserir(Object obj) throws SQLException, ClassNotFoundException {
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();
            sessao.save(obj);
            sessao.getTransaction().commit();

        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(e);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public void alterar(Object obj) throws ClassNotFoundException, SQLException {
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();

            sessao.update(obj);

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
    }

    public void excluir(Object obj) throws SQLException {
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();

            sessao.delete(obj);

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
    }

    public List listar(Class classe) {

        List lista = null;
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();

            Criteria cons = sessao.createCriteria(classe);
            lista = cons.list();

            sessao.getTransaction().commit();

        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            lista = null;
            throw new HibernateException(e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
            return lista;
        }
    }
    //SERVE SÓ QUANDO HÁ UMA COLUNA CHAMADA NOME
    public List procuraPorNome(Class classe, String nomeColuna, String nomePesquisa) {

        List lista = null;
        Session sessao = null;
        try {
            //sessao = HibernateUtil.getSessionFactory().openSession();
            sessao = retornaSessao();
            sessao.beginTransaction();

            Criteria criteria = sessao.createCriteria(classe)
   .add(Restrictions.like(nomeColuna, nomePesquisa));
            lista = criteria.list();

            sessao.getTransaction().commit();

        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            lista = null;
            throw new HibernateException(e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
            return lista;
        }
    }
}
