package deckofcards;

import java.util.ArrayList;

public class Deckofcards {

    public static void main(String[] args){
        int[] deck = new int[52];
        String [] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6","7", "8", "9", "10", "Jack", "Queen", "King"};

        //Initialise cards
        for (int i =0; i<deck.length; i++){
            deck[i] = i;
        }

        //Display all the cards
        for (int i=0; i<52; i++) {
            String suit = suits[deck[i] /13];
            String rank = ranks[deck[i] %13];
            System.out.println(rank + " of " +suit);
        }
    }

    }

