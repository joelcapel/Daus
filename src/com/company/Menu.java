package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    Game game;
    ConfigGame configGame;

    public Menu(Game game, ConfigGame configGame) {
        this.game = game;
        this.configGame = configGame;
    }

    public void show() {
        menuPrincipal();
    }

        private void menuPrincipal(){
            int opcio;
            do {
                System.out.println("\n\033[1;32m1. PLAY");
                System.out.println("\n\033[1;32m2. SETTINGS");
                System.out.println("\n\033[1;31m3. EXIT");
                System.out.println();

                System.out.print("\n\033[1;34mQue quieres hacer? ");
                opcio = scanner.nextInt();
                switch (opcio) {
                    case 1:
                        playMenu();
                        break;
                    case 2:
                        settingsMenu();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\n\033[1;31Has de escoger 1, 2 o 3");
                }
            } while (opcio != 3);
        }

    private void playMenu() {
        int opcio;
        do {
            System.out.println("\n\033[1;32m1. DADOS");
            System.out.println("\n\033[1;32m2. PARCHIS");
            System.out.println("\n\033[1;32m3. TIC TAC TOE");
            System.out.println("\n\033[1;31mRETURN");
            System.out.println();

            System.out.print("\n\033[1;34mQue quieres hacer? ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    game.play();
                    break;
                case 2:
                    System.out.println("\n\033[1;31mEn este momento no se encuentra disponible parchis!");
                    break;
                case 3:
                    System.out.println("\n\033[1;31mEn este momento no se encuentra disponible TIC TAC TOE!");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n\033[1;31mHas de escoger 1, 2, 3 o 4");
            }
        } while (opcio != 4);
    }

        private void settingsMenu() {
                int opcio;
                do {
                    System.out.println("\n\033[1;32m1. GAME");
                    System.out.println("\n\033[1;32m2. PLAYERS");
                    System.out.println("\n\033[1;31m3. RETURN");
                    System.out.println();

                    System.out.print("\n\033[1;34mQue quieres hacer? ");
                    opcio = scanner.nextInt();
                    switch (opcio) {
                        case 1:
                            gameSettings();
                            break;
                        case 2:
                            playerSettings();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("\n\033[1;31mHas de escoger 1, 2 o 3");
                    }
                } while (opcio != 3);
        }

        private void gameSettings() {
                int level;
                System.out.println("\n\033[1;34mEscoge nivel de juego entre 1-5");
                level = scanner.nextInt();
                configGame.setLevel(level);
        }

        private void playerSettings(){
                int njug;
                System.out.println("\n\033[1;34mNumero de jugadores" + "(Maximo " + Game.MAX_PLAYERS + ")?");
                njug = scanner.nextInt();
                configGame.setNumPlayers(njug);
        }
}

