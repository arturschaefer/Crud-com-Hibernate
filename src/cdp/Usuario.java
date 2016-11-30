package cdp;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Autor:           aschaefer
 * Data:            16/11/2016
 * Hora:            10:39:23
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Usuario
 * Pacote de Criação:   cdp
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue
    private int id;

    @Column(name = "userName", nullable = false, unique = true)
    private String nomeUsuario;

    @Column(name = "password", nullable = false, unique = false)
    private String senha;

    @Column(name = "lastAccess", unique = true)
    @Temporal(TemporalType.DATE)
    private Calendar ultimoAcesso;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Calendar ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
