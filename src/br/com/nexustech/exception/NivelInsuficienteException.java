package br.com.nexustech.exception;

// Exercício 8: exceção customizada, herda de RuntimeException (unchecked)
public class NivelInsuficienteException extends RuntimeException {
    public NivelInsuficienteException() {
        super("Seu nível é muito baixo para esta masmorra!");
    }
}
