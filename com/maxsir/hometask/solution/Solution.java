package com.maxsir.hometask.solution;

import java.awt.geom.Point2D;
import java.time.*;
import java.util.*;

public class Solution {                                                     //1
    public static int lastDigit(int x)
    {
        return (int) Math.pow(x % 10, 2) % 10;
    }

    public static int numberDayOfMonth(int year, int month)                  //2
    {
        Calendar monthStart = new GregorianCalendar(year, month, 1);
        return monthStart.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static double squares(double s1)                                   //3
    {
        return s1 / 2;
    }

    public static boolean checkCondition(int[] k)                             //4
    {
        int cnt = 0;
        for (int j : k) {
            if (j % 2 == 0) {
                cnt++;
            }
            if (cnt == 2) {
                break;
            }
        }
        return cnt == 2;
    }

    public static boolean isPerfect(int x)                                      //5
    {
        int sum = 0;
        for (int i = 1; i <= x / 2; i++)
        {
            if (x % i == 0)
            {
                sum += i;
            }
        }
        return sum == x;
    }

    public static LocalTime hhMMSSDateFormatter(int nthSecond)                       //6
    {
        return LocalTime.ofSecondOfDay(nthSecond);
    }

    public static String closestPoint2D(double x1, double y1, double x2, double y2)    //7
    {
        String magicString = " point with coordinates: ";

        return "The closest to (0,0) point is: "

                + (Point2D.distance(x1, y1, 0, 0) < Point2D.distance(x2, y2, 0, 0) ?

                "1st" + magicString + String.format("(%.3f , %.3f)", x1, y1) : "2nd" + magicString +

                String.format("(%.3f , %.3f)", x2, y2));
    }

    public static double f(double x)                                              //8
    {
        return (x < 3)   ?   1 / (Math.pow(x, 3) - 6)   :   -Math.pow(x, 2) + 3 * x + 9;
    }

    public static double[] circle(double R) {                                      //9
        double S = Math.PI * Math.pow(R, 2);
        double C = 2 * Math.PI * R;
        return new double[]{S, C};
    }

    public static String tgRange(double a, double b, double h) {                      //10
        String res="";
        for (double i = a; i<=b; i += h) {
            res+=i + "\t" + Math.tan(i)+"\n";
        }
        return res;
    }
}
