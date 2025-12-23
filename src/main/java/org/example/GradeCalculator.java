package org.example;

public class GradeCalculator {
    public char calculateLetterGrade(int score){
        if(score < 0 || score > 100)
            throw new IllegalArgumentException("Invalid Score");
        if (score >= 90)
            return 'A';
        if (score >= 80)
            return 'B';
        if (score >= 70)
            return 'C';
        if (score >= 60)
            return 'D';
        return 'F';
    }
}
