import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StairTest {

    @Test
    void shouldReturnValidPassword() {
        try{
            Stair.hasValidPassword(6);
        } catch(InputMismatchException e){
            Assertions.fail("Execution error " + e);
        }
    }

}