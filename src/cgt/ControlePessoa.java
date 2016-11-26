package cgt;

import cdp.Conta;
import cdp.Endereco;
import cdp.Pessoa;
import cgd.PessoaDAO;
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
public class ControlePessoa {

    PessoaDAO pesDAO;

    public ControlePessoa() {
        pesDAO = new PessoaDAO();
    }

    public int inserirPessoa(Pessoa pes) throws SQLException, ClassNotFoundException {
        pesDAO.inserir(pes);
        return pes.getCod();
    }

    public int alterarPessoa(Pessoa pes) throws ClassNotFoundException, SQLException {
        pesDAO.alterar(pes);
        return pes.getCod();
    }

    public void excluirVeiculo(Pessoa pes) throws SQLException {
        pesDAO.excluir(pes);
    }

    public List<Pessoa> listarPessoas(int tipo, String pesq) throws SQLException {
        List<Pessoa> lista = null;
        switch (tipo) {
            case 0:
                lista = pesDAO.listarTodos();
                break;
            case 1:
                lista = pesDAO.procuraPessoa(pesq);
                break;
            case 2:
                lista = pesDAO.procuraCPF(pesq);
                break;
        }

        return lista;
    }
}
