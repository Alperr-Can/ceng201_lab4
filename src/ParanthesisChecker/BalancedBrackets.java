/*
 * Alper Can
 * 240444001
 * 26.10.2026
 */

package ParanthesisChecker;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack stack = new BracketStack();

        // 1. String'i karakter karakter dolaş
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 2. Açılış parantezi ise stack'e ekle (push)
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // 3. Kapanış parantezi ise kontrol et
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Eşleşecek açılış parantezi yoksa dengesizdir
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (!isMatchingPair(topChar, ch)) {
                    return false;
                }
            }
        }

        // 4. Sonda stack tamamen boşsa tüm parantezler doğru kapanmıştır
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        if (opening == '[' && closing == ']') return true;
        if (opening == '{' && closing == '}') return true;

        return false;
    }
}