/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Endereco;
import cdp.Pessoa;
import cgd.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author aschaefer
 */
public class TesteHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sessao = sf.openSession();
        
        Pessoa pes = new Pessoa();
        Endereco endereco = new Endereco();
        
        endereco.setBairro("centro");
        endereco.setCep(29725000);
        endereco.setCidade("Marilândia");
        endereco.setRua("Virginia Paganini Tozzi");
        
        pes.setCpf("12156544727");
        pes.setNome("Artur");
        pes.setEndereco(endereco);
        pes.setTelefone01(000000);
        pes.setTelefone02(111111);
        
        Transaction ts = sessao.beginTransaction();
        
        sessao.save(endereco);
        sessao.save(pes);
        
        ts.commit();
        sessao.flush();
        sessao.close();                 
    }
    
}
