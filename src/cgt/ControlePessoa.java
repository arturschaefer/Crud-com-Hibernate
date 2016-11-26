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

    public int inserirPessoa(String nome, String cpf, int telefone01, int telefone02,
            Endereco endereco, Conta conta, String observacoes,
            String rg) throws SQLException, ClassNotFoundException {

        Pessoa pes = new Pessoa(nome, cpf, rg, telefone01, telefone02,
                observacoes, endereco, conta);
        pesDAO.inserir(pes);
        return pes.getCod();
    }

    /*
    public int alterarVeiculo(int id, String placa, String modelo, String marca, int ano, String cor,
            double diaria) throws ClassNotFoundException, SQLException {

        Veiculo veic = new Veiculo(id, placa, modelo, marca, ano, cor, diaria);

        pesDAO.alterar(veic);

        return veic.getIdVeiculo();
    }

    public void excluirVeiculo(Veiculo veic) throws SQLException {

        pesDAO.excluir(veic);
    }
     */

    //SERÁ QUE PODE ISSO, UMA JTABLE NO CONTROLE?
    //FAZ UM POUCO DE SENTIDO PORQUE É O CONTROLE QUE ALTERA A VISÃO, MAS AO MESMO TEMPO É ESTRANHO
    //PORQUE O CONTROLE ERA PARA PASSAR SOMENTE DADOS E NÃO VISUAL
    public List<Pessoa> listarPessoas(int tipo, String pesq) throws SQLException {

        List<Pessoa> lista = null;
        switch (tipo) {
            case 0:
                lista = pesDAO.listarTodos();
                break;
            case 1:
                lista = pesDAO.procuraPessoa(pesq);
                break;
        }

        return lista;
    }
}
