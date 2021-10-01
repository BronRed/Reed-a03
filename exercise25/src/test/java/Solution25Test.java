
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void passwordValidatorVeryWeak() {
        Solution25 sol = new Solution25();
        String string = "12345";
        String result = sol.passwordValidator(string);
        assertEquals("a very weak password.", result);
    }
    @Test
    void passwordValidatorWeak() {
        Solution25 sol = new Solution25();
        String string = "abcdef";
        String result = sol.passwordValidator(string);
        assertEquals("a weak password.", result);
    }
    @Test
    void passwordValidatorStrong() {
        Solution25 sol = new Solution25();
        String string = "abc123xyz";
        String result = sol.passwordValidator(string);
        assertEquals("a strong password.", result);
    }
    @Test
    void passwordValidatorVeryStrong() {
        Solution25 sol = new Solution25();
        String string = "1337h@xor!";
        String result = sol.passwordValidator(string);
        assertEquals("a very strong password.", result);
    }
    @Test
    void passwordValidatorUnknown() {
        Solution25 sol = new Solution25();
        String string = ".";
        String result = sol.passwordValidator(string);
        assertEquals("a password of unknown strength.", result);
    }
}