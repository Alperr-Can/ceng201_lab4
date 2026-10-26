/*
 * Alper Can
 * 240444001
 * 26.10.2026
 */

package ReversingEquation;

public class EquationReverser {

    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();

        int i = 0;

        // Denklemi soldan sağa doğru dolaş
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // Karakter bir rakamsa, sayının tamamını tek parça olarak al
            if (Character.isDigit(current)) {
                int start = i;
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                // Başlangıçtan rakam olmayan karaktere kadar olan kısmı kesip stack'e at
                stack.push(equation.substring(start, i));
            }
            // Rakam değilse operatörü stack'e at ve indeksi 1 ilerlet
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // Stack'teki tüm elemanları pop ederek StringBuilder ile birleştir
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}