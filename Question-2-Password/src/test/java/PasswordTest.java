import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {


    @Test
    void shouldReturnTrueForNumber() {
        String password = "hjgfh7";
        boolean expectedReturn = true;
        boolean receivedReturn = Password.hasValidNumber(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnFalseForNumber() {
        String password = "hjgfh";
        boolean expectedReturn = false;
        boolean receivedReturn = Password.hasValidNumber(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnTrueForUpperCase() {
        String password = "Abc";
        boolean expectedReturn = true;
        boolean receivedReturn = Password.hasValidUpperCase(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnFalseForUpperCase() {
        String password = "abc";
        boolean expectedReturn = false;
        boolean receivedReturn = Password.hasValidUpperCase(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnTrueForLowerCase() {
        String password = "test";
        boolean expectedReturn = true;
        boolean receivedReturn = Password.hasValidLowerCase(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnFalseForLowerCase() {
        String password = "TEST";
        boolean expectedReturn = false;
        boolean receivedReturn = Password.hasValidLowerCase(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnTrueForSpecialCharacter() {
        String password = "ab@67";
        boolean expectedReturn = true;
        boolean receivedReturn = Password.hasSpecialCharacter(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnFalseForSpecialCharacter() {
        String password = "ab67";
        boolean expectedReturn = false;
        boolean receivedReturn = Password.hasSpecialCharacter(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnTrueForValidLenght() {
        String password = "Ya3%ab";
        boolean expectedReturn = true;
        boolean receivedReturn = Password.hasValidLenght(password);
        assertEquals(expectedReturn, receivedReturn);
    }

    @Test
    void shouldReturnFalseForValidLenght() {
        String password = "Ya3";
        boolean expectedReturn = false;
        boolean receivedReturn = Password.hasSpecialCharacter(password);
        assertEquals(expectedReturn, receivedReturn);
    }
}