/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * CardTrick classssssss.....!
 * Modifier: Dipen Gohel
 * Date: 19 9 2024
 */




package card;

import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomNumberGenerator(1,13));
            c.setSuit(Card.SUITS[randomNumberGenerator(0,3)]);
            magicHand[i] = c;
        }
        
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]); ]
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card value (1-13): ");
        int cardValue = sc.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int cardSuit = sc.nextInt();
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(Card.SUITS[cardSuit]);
        
        boolean cardFound = false;
        for(Card card : magicHand) {
            if(card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        
    }
    public static int randomNumberGenerator(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
}
