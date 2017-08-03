import models.BlackJack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/3/17.
 */
public class App {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Blackjack World!");

        BlackJack blackJack = new BlackJack();
        System.out.println(blackJack.SingleCard());
    }
}
