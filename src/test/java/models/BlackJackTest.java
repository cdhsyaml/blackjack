package models;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJackTest {
    @Test
    public void newBlackjack_Instantiate() {
        BlackJack blackJack = new BlackJack();
        assertEquals(false, blackJack instanceof BlackJack);
    }
}