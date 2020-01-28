/*
sin(x) = x - x^3/3! + x^5/5!...
*/

public class SinCalculator {
    public static double calculateWithForLoop(int x, int addendNumber) {
        double result = x;
        double numerator = x;
        double denominator = 1D;
        int sign = -1;
        for (int currentAddend = 2; currentAddend <= addendNumber; currentAddend++) {
            numerator *= x * x;
            denominator *= (currentAddend * 2 - 2) * (currentAddend * 2 - 1);
            numerator *= sign;
            result += numerator / denominator;

        }
        return result;
    }

}
