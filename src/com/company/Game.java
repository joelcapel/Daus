package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Game {
    public final static int MAX_PLAYERS = 4;

    private Menu menu;
    private ConfigGame configGame;
    private Player[] playersList;

    public Game(){
        playersList = new Player[MAX_PLAYERS];
        configGame = new ConfigGame(playersList);
        menu = new Menu(this,configGame);
    }

    public void start() {
        menu.show();
    }

    public void play() {
        System.out.println("\n\033[1;34mNivel de juego: " + configGame.getLevel());
        System.out.println("\n\033[1;34mJugando...");
        System.out.println("\n\033[1;34mHay " + configGame.getNumPlayers() + " jugadores");
        Dados dados = new Dados();
    }
}
