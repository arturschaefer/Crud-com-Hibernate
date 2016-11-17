package cdp;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "lotemudas")
public class LoteDeMudas implements Serializable {

    @Id
    @GeneratedValue
    private int idLote;
    @Column
    private int qnt;
    @Column
    private double preco;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    private Mudas mudas;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    private Viveiro viveiro;

    public double calcPreco(int qnt, double preco) {
        return 0;
    }

}
