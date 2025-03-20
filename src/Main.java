/*
VAR
    numeroSecreto, tentativa, tentativas: Inteiro

INICIO
    Escreva "Informe um número para ser adivinhado: "
    Ler numeroSecreto

    tentativas ← 0

    ENQUANTO VERDADEIRO FAÇA
        Escreva "Tente adivinhar o número: "
        Ler tentativa

        tentativas ← tentativas + 1

        SE tentativa = numeroSecreto ENTÃO
            Escreva "Parabéns! Você acertou em " + tentativas + " tentativas."
            PARAR
        SENÃO SE tentativa < numeroSecreto ENTÃO
            Escreva "Seu número é menor que o meu."
        SENÃO
            Escreva "Seu número é maior que o meu."
        FIM SE
    FIM ENQUANTO
FIM

Teste de mesa

Entrada	Número Secreto	        Feedback	                    Tentativas
50	    75	                "Seu número é menor que o meu."	    1
80	    75	                "Seu número é maior que o meu."	    2
75	    75	                "Acertou em 3 tentativas!"	        3
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String sNumeroSecreto = JOptionPane.showInputDialog("Informe um número para ser adivinhado:");
        int numeroSecreto = Integer.parseInt(sNumeroSecreto);

        int tentativa, tentativas = 0;

        while (true) {
            // Entrada da tentativa do usuário
            String sTentativa = JOptionPane.showInputDialog("Tente adivinhar o número:");
            tentativa = Integer.parseInt(sTentativa);
            tentativas++;

            // Verifica se o número está correto
            if (tentativa == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
                break; // Sai do loop ao acertar
            } else if (tentativa < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Seu número é menor do que o meu. Tente novamente!");
            } else {
                JOptionPane.showMessageDialog(null, "Seu número é maior do que o meu. Tente novamente!");
            }
        }
    }
}