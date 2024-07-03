package chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s) {
        if (s.length() < 8) {
            return PasswordStrength.NORMAL;
        }
        if (!meetsContainingNumber(s)) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }
    private boolean meetsContainingNumber(String s) {
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}