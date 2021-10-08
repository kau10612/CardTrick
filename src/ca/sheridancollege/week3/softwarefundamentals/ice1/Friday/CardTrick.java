package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

import java.util.Scanner;

/**
 *
 * @author Ronak
 * @modifier Ramneek Kaur Student Id: 991631069
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 ])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4) + 0]);

            magicHand[i] = c; //Add c to the user
        }

        //insert code to ask user for Card value and suit, create their card
        Card luckyCard = new Card();
        System.out.print(" Select the cards from 1 to 13:  ");
        int cardValue = sc.nextInt();
        luckyCard.setValue(cardValue);
        System.out.print("Please select any one suit from the cards: "
                + "diamonds,spades,club,hearts:  ");
        int cardsSuit = sc.nextInt();
        luckyCard.setSuit(Card.SUITS[cardsSuit - 1]);

        // and search magicHand here
        boolean match = true;
        for (Card magicHand1 : magicHand) {
            if (luckyCard.getSuit().equals(magicHand1.getSuit()) && 
                    luckyCard.getValue() == magicHand1.getValue()) {
                match = true;
                break;
            } else {
                match = false;
            }
        }

        //Then report the result here
        if (match) {
            System.out.println("Great! You won");
        } else {
            System.out.println("Sorry! You lose");
        }
    }
}
