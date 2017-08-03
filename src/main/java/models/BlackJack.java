package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {

    private List dealerCards;

    public List<Object> SingleCard(){
        List<Object> deck = new ArrayList<Object>();
        String[] suits = {"Spades", "Clubs" , "Diamonds" ,"hearts" };
        String[] values = {"Ace", "2", "3" ,"4" ,"5" ,"6", "7" ,"8","9" ,"Jack" , "Queen" ,"King"};

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


}
