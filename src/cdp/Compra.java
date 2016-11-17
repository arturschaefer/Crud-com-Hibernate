package cdp;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    @Id
    @GeneratedValue
    private int idCompra;
    @Column
    private String dataDaCompra;
    @Column
    private double valorTotal;
    @Column
    private String dataDoEnvio;

    @ManyToOne
    @JoinColumn(name = "idConta")
    private Conta conta;
    
    @OneToMany (mappedBy = "compra")    
    private List<Itens> itens;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataDoEnvio() {
        return dataDoEnvio;
    }

    public void setDataDoEnvio(String dataDoEnvio) {
        this.dataDoEnvio = dataDoEnvio;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
