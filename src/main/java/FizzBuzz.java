/*
* Für Vielfache von 3 gibt „Fizz“ aus.
Für Vielfache von 5 gib „Buzz“ aus.
Für Vielfache von 3 und 5 gib „FizzBuzz“ aus.
* Als Antwort erwaren wir den jeweils passenden String zur gegebenen Zahl.
* Zu testen: 3 / 17 / 5
**/

public class FizzBuzz {
    public static String fizzbuzzer(int number) {
        if (number%3==0){
            return "Fizz";
        } else if (number%5==0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
