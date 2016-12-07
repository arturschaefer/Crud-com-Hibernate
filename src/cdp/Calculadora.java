
package cdp;

import java.util.ArrayList;
import java.util.List;

/*
 * Autor:           Artur Schaefer<artur.schaefer2 at gmail.com>
 * Data:            20/09/2016
 * Hora:            15:11:01
 * Codificação:     UTF-8 
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Jean Glazar
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       Calculadora
 * Pacote de Criação:   cdp
 */

public class Calculadora {
    private String resultado = null;
    
    public String inicia(){
        return resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<>();
        List<Character> listaOperadores = new ArrayList<>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;

    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0.0;
        int j=0;
        for (int i = 0; i < listaNumeros.size()-1; i++) {

            if ( total==0.0) {
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i + 1).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero1, operador, numero2);
            }
            else if (total>0.0) {
                
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(j).charValue();
                total = executarOperacao(total, operador, numero2);
                j++;
            }
            
            

        }

        resultado = ""+total;
        return resultado;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        }
        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {

        List<Double> listaNumeros = new ArrayList<>();

        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroEmString.isEmpty())
        {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
            
        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {

        List<Character> listaOperadores = new ArrayList<>();


        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }
        return isOperador;
    }
}


/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos II
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */