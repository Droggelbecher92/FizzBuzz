import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
* Für Vielfache von 3 gibt „Fizz“ aus.
Für Vielfache von 5 gib „Buzz“ aus.
Für Vielfache von 3 und 5 gib „FizzBuzz“ aus.
* Zu testen: 3
**/
class FizzBuzzTest {

    @Test
    void shouldReturnFizzWithNumber3(){
        //Given
        int number = 3;
        String expected = "Fizz";

        //When
        String actual = FizzBuzz.fizzbuzzer(number);
        //Then
        assertEquals(expected,actual);

    }

}