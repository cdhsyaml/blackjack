package models;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {


    public String SingleCard(){

//        String[] suits = {"Spades", "Clubs" , "Diamonds" ,"hearts" };
//        String[] values = {"Ace", "2", "3" ,"4" ,"5" ,"6", "7" ,"8","9" ,"Jack" , "Queen" ,"King"};

        String[] suits ={"Spades"};
        String[] values = {"Ace"};


        for (String suit : suits){
            for (String value : values) {

                return value + " of " + suit;

            }
        } return null;


    }

}
