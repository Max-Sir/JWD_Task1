package com.maxsir.hometask.solution;


import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
        int x = 1235;
        System.out.println(Solution.lastDigit(x));

        int year = 2020;
        int month = Calendar.FEBRUARY;
        System.out.println(Solution.numberDayOfMonth(year, month));

        double s1 = 25.0;
        System.out.println(Solution.squares(s1) + " S1:S2 == " + s1 / Solution.squares(s1));

        int[] ints = {1, 2, 3, 4};
        System.out.println(Solution.checkCondition(ints));

        int toCheck = 6;
        System.out.println(Solution.isPerfect(toCheck));

        System.out.println((Solution.hhMMSSDateFormatter(40000)));

        System.out.println(Solution.closestPoint2D(5, 4, 10.56, 16.654));

        double argX = 3.0;
        System.out.printf("F(%f) = %f\n", argX, Solution.f(argX));

        double r = 9.85;
        var result = Solution.circle(r);
        System.out.printf("S = %f\tC=%f\n", result[0], result[1]);

        System.out.println();
        System.out.println("F(x) = tg(x)");
        System.out.println(Solution.tgRange(5.0, 100.5, 5.500000000000005));
    }
}
