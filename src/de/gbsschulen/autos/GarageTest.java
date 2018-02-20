package de.gbsschulen.autos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {

    private Garage garage;

    @Before
    public void before(){
        garage = new Garage(3);
    }

    @Test
    public void whenGarageIsCreatedThenGarageShouldNotBeNull(){
        assertNotNull(garage);
    }

    @Test
    public void whenPosIsNegavtiveThenCheckposValueIsFalse(){
        assertFalse(garage.checkPosition(-1));
    }

    @Test
    public void whenPosIsGreaterOrEqualsMaxAnzahlAutosThenCheckposValueIsFalse(){
        assertFalse(garage.checkPosition(3));
    }

    @Test
    public void whenPosIsGreaterOrZeroAndLowerMaxAnzahlAutosThenCheckposValueIsTrue() {
        assertTrue(garage.checkPosition(2));
    }

    @Test
    public void whenOneAutoIsAddedThenReturnValueIsTrue() {
        assertTrue(garage.hinzufuegen(new Auto("WM AM 226", 98), 0));
    }


    @Test
    public void whenTwoAutosAreAddedThenAnzahlReturnValueIs2(){
        garage = new Garage(2);
        garage.hinzufuegen(new Auto(), 0);
        garage.hinzufuegen(new Auto(), 1);
        assertEquals(2, garage.anzahl());
    }

    @Test
    public void whenOneAutoIsRemovedThenRemovedCarIsNotNull(){
        garage = new Garage(3);
        garage.hinzufuegen(new Auto(), 0);
        assertNotNull(garage.entferneAuto(0));
    }

}