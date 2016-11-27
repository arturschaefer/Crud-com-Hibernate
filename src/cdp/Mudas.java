package cdp;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "muda")
public class Mudas implements Serializable {

    @Id
    @GeneratedValue
    private int idMudas;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String tempoDeCultivo;
    @Column
    private double tamanho;
    @Column
    private double precoUnidade;
    
    @OneToMany (mappedBy = "mudas", cascade =  CascadeType.ALL)
    private List<LoteDeMudas> loteDeMudasM;
    
    @OneToMany (mappedBy = "mudasI", cascade =  CascadeType.ALL)
    private List<Itens> itens;

    public int getIdMudas() {
        return idMudas;
    }

    public void setIdMudas(int idMudas) {
        this.idMudas = idMudas;
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

    public String getTempoDeCultivo() {
        return tempoDeCultivo;
    }

    public void setTempoDeCultivo(String tempoDeCultivo) {
        this.tempoDeCultivo = tempoDeCultivo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public List<LoteDeMudas> getLoteDeMudas() {
        return loteDeMudasM;
    }

    public void setLoteDeMudas(List<LoteDeMudas> loteDeMudas) {
        this.loteDeMudasM = loteDeMudas;
    }

    public Object[] toArray() {
        return new Object[] {idMudas, nome, descricao, precoUnidade};
    }
}
