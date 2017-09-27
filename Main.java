package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int playerLevel = 1;
        int playerExp = 0;
        int playerHp = 50;
        int playerMp = 5;

        int enemyLevel = 0;
        int enemyExp = 0;
        int enemyHp = 0;
        int enemyMp = 0;

        int battle = 0;

        // DISPLAY PLAYER STATS
        System.out.println("PLAYER STATS");
        System.out.println("Level: " + playerLevel);
        System.out.println("Exp: " + playerExp);
        System.out.println("HP: " + playerHp);
        System.out.println("MP: " + playerMp);
        System.out.println("");

        /*
        //DISPLAY ENEMY STATS
        System.out.println("ENEMY STATS");
        System.out.println("Level: " + enemyLevel);
        System.out.println("Exp: " + enemyExp);
        System.out.println("HP: " + enemyHp);
        System.out.println("MP: " + enemyMp);
        System.out.println("");
        */

        enemyLevel = 1;
        enemyExp = 25;
        enemyHp = 40;
        enemyMp = 5;

        do {


            // ENCOUNTER WEAK ENEMY
            System.out.println("You have encountered a weak enemy!");
            System.out.println("");

            System.out.println("ENEMY STATS");
            System.out.println("Level: " + enemyLevel);
            System.out.println("Exp: " + enemyExp);
            System.out.println("HP: " + enemyHp);
            System.out.println("MP: " + enemyMp);
            System.out.println("");

            System.out.println("Choose a move.");
            System.out.println("Press 1 to use Basic Attack");
            System.out.println("Press 2 to use Strong Attack");
            System.out.println("Press 3 to use Heal");

            int Move = input.nextInt();
            input.nextLine();

            if(Move == 1) {
                enemyHp = (enemyHp - 15);
                if (enemyHp < 0) {
                    enemyHp = 0;
                }
                System.out.println("Player HP: " + playerHp + "    Enemy HP: " + enemyHp);
            }

            else if (Move ==2) {
                enemyHp = (enemyHp - 25);
                if (enemyHp < 0) {
                    enemyHp = 0;
                }
                System.out.println("Player HP: " + playerHp + "    Enemy HP: " + enemyHp);
            }

            else if (Move == 3) {
                playerHp = (playerHp +10);
                if (enemyHp < 0) {
                    enemyHp = 0;
                    }
                System.out.println("Player HP: " + playerHp + "    Enemy HP: " + enemyHp);
            }

            if (enemyHp <= 0) {
                System.out.println("");
                System.out.println("YOU HAVE WON!");
                playerExp = (playerExp + 25);
                System.out.println("Player EXP earned: " + playerExp);
            }

        } while ((playerHp > 0) && (enemyHp >0));

        System.out.println("\nYou have conpleted your first battle, now you can learn the basics of the game.");
        System.out.println("Change");
    }
}
