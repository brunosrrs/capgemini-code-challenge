import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {



    @Test
    void shouldReturnValidWord() {
        try{
            Anagrams.verifyAnagram("ovo");
        } catch (InputMismatchException e){
            System.out.println("Execution error: " + e);
        }
    }
}