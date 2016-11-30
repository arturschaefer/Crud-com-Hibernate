/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Usuario;
import cgd.*;
import java.sql.SQLException;
import java.util.List;
/*
 * Autor:           Artur Schaefer <artur.schaefer2 at gmail.com>
 * Data:            22/11/2016
 * Hora:            17:00:56
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       ControleUsuario
 * Pacote de Criação:   cgt
 */
public class ControleUsuario {
    private Usuario usuario = new Usuario();
    private UsuarioDAO userDAO = new UsuarioDAO();

    public ControleUsuario() {
    }
    
    public Usuario envia(String nomeUsuario, String senha) {  
        usuario = userDAO.getUsuario(nomeUsuario, senha);
        if (usuario == null) {
            return null;
        } else {
            return usuario;
        }

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public List<Usuario> listaUsuarios(){
        List<Usuario> lista = null;
        lista = userDAO.listar(Usuario.class);
        return lista;
    }
    
    public int alterar(Usuario user) throws ClassNotFoundException, SQLException{
        userDAO.alterar(user);
        return user.getId();
    }

}
