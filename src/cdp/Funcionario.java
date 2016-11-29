package cdp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@PrimaryKeyJoinColumn
@Table(name = "funcionario")
public class Funcionario extends Pessoa {
    @Column
    private int carteiraDeTrabalho;
    @Column
    private double salario;
    @Column
    private String tipoDeVinculo;
    @Column
    private String dataDeAdmissão;
    @Column
    private String dataDeDemissão;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(int carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String getTipoDeVinculo() {
        return tipoDeVinculo;
    }

    public void setTipoDeVinculo(String tipoDeVinculo) {
        this.tipoDeVinculo = tipoDeVinculo;
    }

    public String getDataDeAdmissão() {
        return dataDeAdmissão;
    }

    public void setDataDeAdmissão(String dataDeAdmissão) {
        this.dataDeAdmissão = dataDeAdmissão;
    }

    public String getDataDeDemissão() {
        return dataDeDemissão;
    }

    public void setDataDeDemissão(String dataDeDemissão) {
        this.dataDeDemissão = dataDeDemissão;
    }

}
