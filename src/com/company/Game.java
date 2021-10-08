package com.company;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private ConfigGame configGame;
    private final Menu menuPrincipal;
    final Dado dado;
    String op;
    private final Player[] jugador = new Player[2];

    public Game() {
        menuPrincipal = new Menu(this, configGame);
        configGame = new ConfigGame();
        dado = new Dado();
        this.jugador[0] = new Player();
        this.jugador[1] = new Player();
        jugador[0].setName("jugador" + 1);
        jugador[1].setName("jugador" + 2);
    }

    public void start() {
        menuPrincipal.show();
    }

    public void play() {
        System.out.println("Cantidad de dado: " + configGame.getDado());
        System.out.println("Cantidad de jugadores " + configGame.getJugador());
        System.out.println("Tirando...");
        System.out.println();
        for (int i = 0; i < configGame.getJugador(); i++) {
            jugador[i].dado.jugar();
            System.out.println(jugador[i].getName() + " ha tirat estos numeros " + jugador[i].dado.dado + " " + jugador[i].dado.dado2 + " " + jugador[i].dado.dado3);

            if (jugador[i].dado.dado == jugador[i].dado.dado2 && jugador[i].dado.dado2 == jugador[i].dado.dado3){
                jugador[i].setWin(true);
            }
        }

        jugador[1].setPartidas(1);
        jugador[0].setPartidas(1);

        if (jugador[0].getWin() && jugador[1].getWin()) {
            System.out.println("Empate");

        }else if (jugador[0].getWin()){
            System.out.println("Ha gando el " +jugador[0].getName());
            jugador[0].setGanadas(1);
            jugador[1].setPerdidas(1);
            jugador[0].setWin(false);
        }else if (jugador[1].getWin()){
            System.out.println("Ha gando el " +jugador[1].getName());
            jugador[1].setGanadas(1);
            jugador[0].setPerdidas(1);
            jugador[1].setWin(false);
        }else{
            System.out.println("Nadie gano esta ronda !");
        }

        System.out.println();
        System.out.print("Quieres seguir? ");
        op = sc.nextLine();
        System.out.println();
        if (op.equals("y")){
            play();
        }else{
            for (int i = 0; i < configGame.getJugador(); i++) {
                System.out.println(jugador[i].getName() + " ha ganado " + jugador[i].getGanadas() + ", ha perdido " + jugador[i].getPerdidas() + " y en total ha jugado " + jugador[i].getPartidas() + " partidas.");
            }
            System.out.println();
        }
    }
}
