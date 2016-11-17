package cdp;

import java.io.Serializable;
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
    private String email;
    @Column
    private int telefone01;
    @Column
    private int telefone02;
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Endereco endereco;
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Conta conta;

    public Pessoa() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Pessoa(int cod, String nome, String cpf, String email, int telefone01, int telefone02, Endereco endereco) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.endereco = endereco;
    }

}
