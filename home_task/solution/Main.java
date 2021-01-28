package home_task.solution;


import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
        int x = 1235;
        System.out.println(Solution.lastDigit(x));

        int year = 2020;
        int month = Calendar.FEBRUARY;
        System.out.println(Solution.numberDayOfMonth(year, month));

        double S1 = 25.0;
        System.out.println(Solution.squares(S1) + " S1:S2 == " + S1 / Solution.squares(S1));

        int[] vals = {1, 2, 3, 4};
        System.out.println(Solution.checkCondition(vals));

        int to_check = 6;
        System.out.println(Solution.isPerfect(to_check));

        Solution.hh_mm_ssDateFormatter(40000);

        Solution.closestPoint2D(5, 4, 10.56, 16.654);

        double arg_x = 3.0;
        System.out.printf("F(%f) = %f\n", arg_x, Solution.f(arg_x));

        double R = 9.85;
        var result = Solution.circle(R);
        System.out.printf("S = %f\tC=%f\n", result[0], result[1]);

        System.out.println();
        System.out.println("F(x)=tg(x)");
        Solution.tgRange(5.0, 10.5, 5.500000000000005);
    }
}
