package cdp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itens")
public class Itens implements Serializable {
        
    @Id
    @GeneratedValue
    private int idItens;
    @Column
    private int quantidade;
    @Column
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "idCompra")
    private Compra compra;
    
    @ManyToOne
    @JoinColumn(name = "idMudas")
    private Mudas mudasI;

    public double calculaValor(int qnt, double val) {
        return qnt * val;
    }

    public int getIdItens() {
        return idItens;
    }

    public void setIdItens(int idItens) {
        this.idItens = idItens;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Mudas getMudas() {
        return mudasI;
    }

    public void setMudas(Mudas mudas) {
        this.mudasI = mudas;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Mudas getMudasI() {
        return mudasI;
    }

    public void setMudasI(Mudas mudasI) {
        this.mudasI = mudasI;
    }

}
