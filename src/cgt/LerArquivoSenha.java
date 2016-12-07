
package cgt;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Autor:           Artur Schaefer<artur.schaefer2 at gmail.com>
 * Data:            20/09/2016
 * Hora:            19:47:21
 * Codificação:     UTF-8 
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean Glazar
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       LerArquivoSenha
 * Pacote de Criação:   cgt
 */

public class LerArquivoSenha {
    public static void LerSenha(String Nome, String Senha){
        try (Scanner arq = new Scanner(new FileReader("pass"))) {  
            Nome = null;
            Senha = null;
            while(arq.hasNext()){
                Nome = arq.nextLine();
                Senha = arq.nextLine();
            }
            //System.err.println(Nome + " " + Senha);
        }
        catch (IOException erro){
            System.err.printf("Erro na abertura do arquivo: %s.\n",erro.getMessage());
        }
    }
}


/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos II
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */