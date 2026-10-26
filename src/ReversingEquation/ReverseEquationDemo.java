/*
 * Alper Can
 * 240444001
 * 26.10.2026
 */

package ReversingEquation;

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        for (String eq : equations) {
            System.out.println("Input:  " + eq);
            System.out.println("Output: " + EquationReverser.reverseEquation(eq));
            System.out.println();
        }
    }
}