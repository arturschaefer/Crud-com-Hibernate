package cgt;

import cdp.Conta;
import cdp.Endereco;
import cdp.Pessoa;
import cdp.Viveiro;
import cgd.PessoaDAO;
import cgd.ViveiroDAO;
import java.sql.SQLException;
import java.util.List;

/*
 * Autor:           aschaefer
 * Data:            21/11/2016
 * Hora:            15:37:37
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       ControlePessoa
 * Pacote de Criação:   cgd
 */
public class ControleViveiros {

    ViveiroDAO vivDAO;

    public ControleViveiros() {
        vivDAO = new ViveiroDAO();
    }

    public int inserirViveiro(Viveiro viv) throws SQLException, ClassNotFoundException {
        vivDAO.inserir(viv);
        return viv.getIdViveiro();
    }

    public int alterarViveiro(Pessoa pes) throws ClassNotFoundException, SQLException {
        vivDAO.alterar(pes);
        return pes.getCod();
    }

    public void excluirViveiro(Pessoa pes) throws SQLException {
        vivDAO.excluir(pes);
    }

    public List<Viveiro> listarViveiro(int tipo, String pesq) throws SQLException {
        List<Viveiro> lista = null;
        switch (tipo) {
            case 0:
                lista = vivDAO.listarTodos();
                break;
        }

        return lista;
    }
}
