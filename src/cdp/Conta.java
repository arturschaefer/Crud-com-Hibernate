package cdp;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta implements Serializable {

    @Id
    @GeneratedValue
    private int idConta;
    @Column
    private EstadoConta situação;
    @Column
    private String abertaEm;
    @Column
    private String fechadaEm;
    
    @Enumerated(EnumType.STRING)
    private EstadoConta situacao;    
    
    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;    
    
    @OneToMany(mappedBy = "conta")
    private List<Compra> compra;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public EstadoConta getSituação() {
        return situação;
    }

    public void setSituação(EstadoConta situação) {
        this.situação = situação;
    }

    public String getAbertaEm() {
        return abertaEm;
    }

    public void setAbertaEm(String abertaEm) {
        this.abertaEm = abertaEm;
    }

    public String getFechadaEm() {
        return fechadaEm;
    }

    public void setFechadaEm(String fechadaEm) {
        this.fechadaEm = fechadaEm;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    public EstadoConta getSituacao() {
        return situacao;
    }

    public void setSituacao(EstadoConta situacao) {
        this.situacao = situacao;
    }

}
