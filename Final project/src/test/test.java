package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import guessinggame.guessinggame;

public class test {
    private guessinggame game;

    @Before
    public void setUp() {
        game = new guessinggame();
    }

    @Test
    public void testGetTotalGuess() {
        game.initializeGame();
        assertEquals(100, game.getTotalGuess());
    }

    @Test
    public void testGetCorrectAnswer() {
        game.initializeGame();
        assertTrue(game.getCorrectAnswer() <= 15 && game.getCorrectAnswer() >= 1);
    }

    @Test
    public void testCheckUserGuessWithCorrectAnswer() {
        game.initializeGame();
        assertEquals(1, game.checkUserGuess(game.getCorrectAnswer()));
    }

    @Test
    public void testCheckUserGuessWithIncorrectAnswer() {
        game.initializeGame();
        assertEquals(0, game.checkUserGuess(game.getCorrectAnswer() + 1));
    }

    @Test
    public void testCheckUserGuessDecreasesTotalGuess() {
        game.initializeGame();
        int initialTotalGuess = game.getTotalGuess();
        game.checkUserGuess(game.getCorrectAnswer() + 1);
        assertEquals(initialTotalGuess - 1, game.getTotalGuess());
    }

    @Test
    public void testInitializeGameResetsTotalGuess() {
        game.initializeGame();
        int initialTotalGuess = game.getTotalGuess();
        game.checkUserGuess(game.getCorrectAnswer() + 1);
        game.initializeGame();
        assertEquals(100, game.getTotalGuess());
    }

    @Test
    public void testInitializeGameResetsCorrectAnswer() {
        game.initializeGame();
        int initialCorrectAnswer = game.getCorrectAnswer();
        game.checkUserGuess(game.getCorrectAnswer() + 1);
        game.initializeGame();
        assertTrue(initialCorrectAnswer != game.getCorrectAnswer());
    }

}
