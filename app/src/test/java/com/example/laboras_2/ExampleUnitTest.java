package com.example.laboras_2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Given_TextString_When_noWordsAreEntered(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = elementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_oneWordsIsEntered(){
        final String givenString = "labas";

        final int expectedResult = 1;
        final int actualResult = elementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_noNumbersAreEntered(){
        final String givenString = "labas";

        final int expectedResult = 0;
        final int actualResult = elementsCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_NumbersAndWordsAreEntered(){
        final String givenString = "12a5";

        final int expectedResult = 3;
        final int actualResult = elementsCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_VariousSymbolsAreEntered(){
        final String givenString = "l, 55 l /abas";

        final int expectedResult = 13;
        final int actualResult = elementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_SymbolsAreEntered(){
        final String givenString = " ,, /";

        final int expectedResult = 0;
        final int actualResult = elementsCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }


}