package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTests {
    // ✔ Mirrors class name
    // ✔ Happy path + edge case
    // ✔ Independent tests
    // ✔ Uses assertions

    @Test
    public void calculateLetterGrade_returnsA_forHighScore(){
    GradeCalculator gCalc = new GradeCalculator();
    assertEquals('A',gCalc.calculateLetterGrade(93));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateLetterGrade_throwsException_forInvalidScore() {
        GradeCalculator calc = new GradeCalculator();
        calc.calculateLetterGrade(120);
    }
}
