/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    @Test
    void getLettersTest(){
        PasswordGenerator pg = new PasswordGenerator();
        assertEquals("[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]", pg.getLetters().toString());
    }
   @Test
    void getNumbersTest(){
        PasswordGenerator pg = new PasswordGenerator();
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", pg.getNumbers().toString());
   }
   @Test
    void generatePasswordTest(){
        PasswordGenerator pg = new PasswordGenerator();
       ArrayList<Character> numbers = new ArrayList<>();
       numbers.add('a');
       ArrayList<Character> letters = new ArrayList<>();
       letters.add('a');
       ArrayList<Character> specials = new ArrayList<>();
       specials.add('%');
       char[] password = pg.generatePassword(3, 1, 1, letters, numbers, specials);
       String strPass = Arrays.toString(password);
       assertTrue(strPass.equals("1a%") || strPass.equals("1%a") || strPass.equals("a%1") || strPass.equals("a1%") || strPass.equals("%1a") || strPass.equals("%a1"));
   }
}