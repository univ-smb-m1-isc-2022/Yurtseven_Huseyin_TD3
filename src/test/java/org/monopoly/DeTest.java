package org.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeTest {

    @Test
    public void testConstructeur() {
        De de = new De();
        assertEquals(1, de.getValeur());
    }

    @Test
    public void testLancer() {
        De de = new De();
        de.lancer();
        int valeur = de.getValeur();
        assertTrue(valeur >= 1 && valeur <= 6);
    }

    @Test
    public void testGetValeur() {
        De de = new De();
        de.lancer();
        int valeur = de.getValeur();
        assertEquals(valeur, de.getValeur());
    }

}
