package cdp;

import java.io.Serializable;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private int cod;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String rg;

    public Pessoa(String nome, String cpf, String rg, int telefone01, int telefone02, String observacoes, Endereco endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.observacoes = observacoes;
        this.endereco = endereco;
        this.conta = conta;
    }
    
    @Column
    private int telefone01;
    @Column
    private int telefone02;
    @Column
    private String observacoes;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    public Pessoa() {
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone01() {
        return telefone01;
    }

    public void setTelefone01(int telefone01) {
        this.telefone01 = telefone01;
    }

    public int getTelefone02() {
        return telefone02;
    }

    public void setTelefone02(int telefone02) {
        this.telefone02 = telefone02;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Object[] toArray() {
        //return new Object[] {cod, nome, cpf, rg, telefone01, telefone02, observacoes, endereco, conta};   
        return new Object[] {cpf, nome, telefone01, endereco.getCidade()};
    }
    
    
}
