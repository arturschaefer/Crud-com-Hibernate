/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih;

/*
 * Autor:           Artur Schaefer <artur.schaefer2 at gmail.com>
 * Data:            30/11/2016
 * Hora:            18:39:52
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean 
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       CafeException
 * Pacote de Criação:   cih
 */
public class CafeException extends Exception{

    String msgsErro[] = new String[100];
    int codErro;

    public CafeException(int cod) {
        super();

        codErro = cod;

    }

    @Override
    public String toString() {
        return this.getMessage();
    }

    @Override
    public String getMessage() {
        return msgsErro[codErro];
    }
}
