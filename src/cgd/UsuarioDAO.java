/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgd;

import cdp.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import org.hibernate.Session;

/*
 * Autor:           Artur Schaefer <artur.schaefer2 at gmail.com>
 * Data:            22/11/2016
 * Hora:            18:11:33
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       UsuarioDAO
 * Pacote de Criação:   cgd
 */
public class UsuarioDAO extends GenericaDAO{

    public UsuarioDAO() {
    }

    /*private final EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("usuarios");
    private EntityManager em = factory.createEntityManager();
    */
    public Usuario getUsuario(String nomeUsuario, String senha)  {
        Session ses = this.retornaSessao();
        try {
            Usuario usuario = (Usuario) ses.getSessionFactory().getCurrentSession()
                    .createQuery(
                            "SELECT u from usuarios u where u.userName = :name and u.password = :senha")
                    .setParameter("name", nomeUsuario)
                    .setParameter("senha", senha);
            return usuario;
        } catch (NoResultException e) {
            return null;
        }
    }
}
