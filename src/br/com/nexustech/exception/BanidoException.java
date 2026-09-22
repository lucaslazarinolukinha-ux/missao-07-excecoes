package br.com.nexustech.exception;

// Exercício 12: herda de Exception normal (checked exception), não de RuntimeException
public class BanidoException extends Exception {
    public BanidoException() {
        super("Jogador Banido!");
    }
}
