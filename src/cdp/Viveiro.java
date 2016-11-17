package cdp;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "viveiro")
public class Viveiro {

    @Id
    @GeneratedValue
    private int idViveiro;
    @Column
    private double areaDisponivel;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private Irrigacao tipoDeIrrigacao;
    
    @OneToMany (mappedBy = "idLote")
    private List<LoteDeMudas> loteDeMudas;

    public int getIdViveiro() {
        return idViveiro;
    }

    public void setIdViveiro(int idViveiro) {
        this.idViveiro = idViveiro;
    }

    public double getAreaDisponivel() {
        return areaDisponivel;
    }

    public void setAreaDisponivel(double areaDisponivel) {
        this.areaDisponivel = areaDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Irrigacao getTipoDeIrrigacao() {
        return tipoDeIrrigacao;
    }

    public void setTipoDeIrrigacao(Irrigacao tipoDeIrrigacao) {
        this.tipoDeIrrigacao = tipoDeIrrigacao;
    }
}
