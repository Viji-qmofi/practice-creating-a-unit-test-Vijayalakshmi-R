package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTests {
//    The test class mirrors the name of the class being tested (with Test at the end)
//    The test method name clearly describes what is being tested
//    The test can run independently and doesn’t rely on other tests
//    There is at least one test for the normal (“happy path”) case
//    There is at least one test for an edge case or unusual input
//    The test uses appropriate assertions to verify behavior


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
