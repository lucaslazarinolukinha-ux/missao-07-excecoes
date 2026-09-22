package br.com.nexustech.main;

import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.Matchmaker;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoJogo;
import br.com.nexustech.model.ModoRanqueado;

public class Main {

    public static void main(String[] args) {

        // ===================== NÍVEL 1 =====================

        // --- Exercício 2: Consertando o K/D (o Ex.1 "puro" já foi substituído aqui) ---
        int kills = 15;
        int deaths = 0;
        try {
            System.out.println(kills / deaths);
        } catch (ArithmeticException e) {
            // Ex.1: a exceção que aparece em vermelho no console é a ArithmeticException
            System.out.println("Taxa K/D: Jogador Invicto!");
        }

        // --- Exercício 3: O Inventário Bugado ---
        String[] inventario = new String[3];
        try {
            inventario[5] = "Espada";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inventário cheio!");
        }

        // --- Exercício 4: O Fantasma (NullPointerException) ---
        String jogador = null;
        if (jogador != null) {
            System.out.println(jogador);
        } else {
            System.out.println("Jogador desconectado");
        }

        // ===================== NÍVEL 2 =====================

        // --- Exercício 6: A Assinatura do Contrato ---
        try {
            conectarServidor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // --- Exercício 7: O Zelador ---
            System.out.println("Fechando portas de rede do jogo...");
        }

        // ===================== NÍVEL 3 =====================

        // --- Exercício 9: A Masmorra Fechada ---
        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // ===================== NÍVEL BOSS =====================

        // --- Exercício 14: A Batalha Final ---
        Matchmaker matchmaker = new Matchmaker();
        ModoJogo casual = new ModoCasual();
        ModoJogo ranqueado = new ModoRanqueado();

        try {
            matchmaker.encontrarSala(casual, false);
            matchmaker.encontrarSala(ranqueado, false);
            matchmaker.encontrarSala(ranqueado, true); // jogador banido
        } catch (BanidoException e) {
            System.out.println("Falha ao entrar na sala: " + e.getMessage());
        }
    }

    // --- Exercício 5: Simulando a Queda de Internet ---
    public static void conectarServidor() throws Exception {
        throw new Exception("Servidor caiu!");
    }
}
