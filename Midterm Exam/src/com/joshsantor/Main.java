package com.joshsantor;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner readInput = new Scanner(System.in);
        CardStack deck = new CardStack(30);
        CardStack hand = new CardStack(30);
        CardStack discardPile = new CardStack(30);


        int deckCounter = 30;
        int discardCounter = 0;
        int handCounter = 0;
        int randCommand;
        int randNumb;
        int turnCounter = 1;
        String userInput; //For pause purposes with Scanner

        hand.push(new Cards("1","1"));          //
        deck.push(new Cards("1","1"));          // For some unknown reason the first element get erased
        discardPile.push(new Cards("1","1"));   //

        generateDeck(deck);                     //
        sendCards(deck,hand,5);       // Usual 5 cards at the start of the game
        deckCounter = deckCounter - 5;         //
        handCounter = handCounter + 5;         //

        do {
            System.out.println("TURN  " + turnCounter++);
            System.out.println("Cards in Hand:");
            hand.printStack();
            System.out.println("\n Amount of Cards in Hand: " + handCounter);
            System.out.println("\n Amount of Cards in deck: " + deckCounter);
            System.out.println("\n Amount of Cards in Discard Pile: " + discardCounter);
            System.out.println("\n Enter any key to proceed");
            userInput = readInput.nextLine();


            randCommand = (int) Math.floor(Math.random() * (3) + 1);
            randNumb = (int) Math.floor(Math.random() * (5) + 1);

            // randCommand for the randomized command
            // 1 = Draw
            // 2 = Discard
            // 3 = Get from Discard pile
            // randNumb is the amount of cards to be sent to other stack

            if (randCommand == 1)
            {
                System.out.println("You Decided to draw " + randNumb + " card/s from the deck.");
                System.out.println("\n Enter any key to proceed");
                userInput = readInput.nextLine();
                if(deckCounter < randNumb)
                {
                    sendCards(deck, hand, randNumb - deckCounter);
                    deckCounter = 0;
                    handCounter = handCounter + (randNumb-deckCounter);
                }
                else
                {
                    sendCards(deck, hand, randNumb);
                    deckCounter = deckCounter - randNumb;
                    handCounter = handCounter + randNumb;
                }
                if (deckCounter < 0)
                {
                    deckCounter = 0;
                }
            }
            else if (randCommand == 2)
            {
                System.out.println("You Decided to discard " + randNumb + " card/s from your hand.");
                System.out.println("\n Enter any key to proceed");
                userInput = readInput.nextLine();

                if (handCounter == 0)
                {
                    System.out.println("Sadly you have nothing to Discard...");
                    System.out.println("\n Enter any key to proceed");
                    userInput = readInput.nextLine();
                }
                else if (handCounter < randNumb)
                {
                    sendCards(hand,discardPile,randNumb-handCounter);
                    discardCounter = discardCounter + (randNumb - handCounter);
                    handCounter = 0;
                }
                else
                {
                    sendCards(hand, discardPile, randNumb);
                    discardCounter = discardCounter + randNumb;
                    handCounter = handCounter - randNumb;
                }
                if (handCounter < 0)
                {
                    handCounter = 0;
                }

            }
            else if (randCommand == 3)
            {
                System.out.println("You Decided to get " + randNumb + " card/s from the discard pile.");
                System.out.println("\n Enter any key to proceed");
                userInput = readInput.nextLine();

                if (discardCounter == 0)
                {
                    System.out.println("Sadly you have nothing to get from the discard pile...");
                    System.out.println("\n Enter any key to proceed");
                    userInput = readInput.nextLine();
                }
                else if (discardCounter<randNumb)
                {
                    sendCards(discardPile,hand,randNumb-discardCounter);
                    handCounter = handCounter + (randNumb-discardCounter);
                    discardCounter = 0;
                }
                else
                {
                sendCards(discardPile, hand, randNumb);
                discardCounter = discardCounter - randNumb;
                handCounter = handCounter + randNumb;
                }
                if (discardCounter < 0) {
                    discardCounter = 0;
                }
            }
        }
        while(deckCounter != 0);
        System.out.println("Deck is Empty... \nG A M E   O V E R!!!");
        System.out.println("Made by Albert Joseph Josh M. Santor");
    }

    public static void generateDeck(CardStack deck)
    {
        int deckCount = 0;
        int pogCounter = 0;
        int bDragonCounter = 0;
        int bBladeCounter = 0;
        int cSpellCounter = 0;
        int feeshCounter = 0;
        int cometCounter = 0;
        int tomatoCounter = 0;
        int dmCounter = 0;
        int baeCounter = 0;
        int bewdCounter = 0;
        int randGenerator;
        do{
            randGenerator = (int)Math.floor(Math.random()*(10)+1);
            switch (randGenerator) {
                case 1:
                    if (pogCounter != 3) {
                        deck.push(new Cards("Pot of Greed", "Spell"));
                        pogCounter++;
                        deckCount++;
                    }
                    break;

                case 2:
                    if (bDragonCounter != 3) {
                        deck.push(new Cards("Bolshack Dragon", "Monster - Dragon"));
                        bDragonCounter++;
                        deckCount++;
                    }
                    break;

                case 3:
                    if (bBladeCounter != 3) {
                        deck.push(new Cards("Blaster Blade", "Monster - Warrior"));
                        bBladeCounter++;
                        deckCount++;
                    }
                    break;

                case 4:
                    if (cSpellCounter != 3) {
                        deck.push(new Cards("Counterspell", "Spell"));
                        cSpellCounter++;
                        deckCount++;
                    }
                    break;

                case 5:
                    if (feeshCounter != 3) {
                        deck.push(new Cards("Finana Ryugu", "Vtuber - Nijisanji"));
                        feeshCounter++;
                        deckCount++;
                    }
                    break;

                case 6:
                    if (cometCounter != 3) {
                        deck.push(new Cards("Suisei Hoshimachi", "Vtuber - HoloLive"));
                        cometCounter++;
                        deckCount++;
                    }
                    break;

                case 7:
                    if (tomatoCounter != 3) {
                        deck.push(new Cards("Maki Nishikino", "Idol - Lovelive"));
                        tomatoCounter++;
                        deckCount++;
                    }
                    break;

                case 8:
                    if (dmCounter != 3) {
                        deck.push(new Cards("Dark Magician", "Monster - Spellcaster"));
                        dmCounter++;
                        deckCount++;
                    }
                    break;

                case 9:
                    if (baeCounter != 3) {
                        deck.push(new Cards("Veibae", "Vtuber - VShojo"));
                        baeCounter++;
                        deckCount++;
                    }
                    break;

                case 10:
                    if (bewdCounter != 3) {
                        deck.push(new Cards("Blue Eyes White Dragon", "Monster - Dragon"));
                        bewdCounter++;
                        deckCount++;
                    }
                    break;
                }
            }while(deckCount != 30);
        }
        public static void sendCards(CardStack sender, CardStack receiver,int randNumb)
        {
            for (int i = 0; i < randNumb; i++) {
                receiver.push(sender.pop());
            }
        }
}
