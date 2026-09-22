package br.com.nexustech.model;

import br.com.nexustech.exception.NivelInsuficienteException;

// Exercício 9
public class Masmorra {
    public void entrar(int nivelJogador) {
        if (nivelJogador < 50) {
            throw new NivelInsuficienteException();
        }
        System.out.println("Você entrou na masmorra!");
    }
}
