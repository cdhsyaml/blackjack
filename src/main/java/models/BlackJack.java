package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {

    private List dealerCards;
    private List deckCount;



    private String[] suits = {"Spades", "Clubs" , "Diamonds" ,"hearts" };


    private String[] values = {"Ace", "2", "3" ,"4" ,"5" ,"6", "7" ,"8","9" ,"Jack" , "Queen" ,"King"};

    List<String> deck = new ArrayList<String >();


    public String[] getValues() {
        return values;
    }

    public String[] getSuits() {
        return suits;
    }



    public List<String> SingleCard(){

        for (String suit : suits){
            for (String value : values) {

                deck.add(value + " of " + suit);

            }
        } return deck;

    }

    public boolean playerHandCount (int dealerCards){
       boolean dealer = false;
        if (dealerCards == 21){
            dealer = true;
        }
        else {
            dealer = false;
        }

        return dealer;
    }

    public List getDealerCards() {
        return dealerCards;
    }

    public String randomCardSelection() throws Exception{
        Random randomCard = new Random();
        List<String> newDeck = SingleCard();
       String drawCard = newDeck.get(randomCard.nextInt(newDeck.size()));
        System.out.println(drawCard);
       return drawCard;
    }


}
