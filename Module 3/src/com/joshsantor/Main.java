package com.joshsantor;

import java.awt.*;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        int playerCounter = 0;
        int gameCounter = 0;
        LinkedListStack stack = new LinkedListStack();

        do {
            int randomPlayers = (int) Math.floor(Math.random()*(7-1+1)+1);
            MatchQueue(randomPlayers,stack);
            playerCounter = playerCounter + randomPlayers;


            while(playerCounter>=5)
            {
                if (playerCounter >= 5)
                {
                    MatchFound(randomPlayers, stack);
                    System.out.println("\n\n5 Players now found a MATCH!\n\n");
                    playerCounter = playerCounter - 5;
                    gameCounter++;
                }
            }
        } while (gameCounter != 10);
    }


    public static void MatchQueue(int players, LinkedListStack stack)
    {
        int counter = 0;
        System.out.println(players + " Players are now Queuing....");


        while (counter != players) {
            stack.push(new Players());
            counter++;
        }
    }


    public static void MatchFound(int players, LinkedListStack stack)
    {
        while (players>=5)
        {
            stack.pop();
            players--;
        }
    }
}


