import java.util.Scanner;

public class Main {
//    Napisz kalkulator, który:

//    1. Będzie obsługiwał następujące działania:
//      - dodawanie
//      - odejmowanie
//      - mnożenie
//      - dzielenie
//    2. Będzie działał bez przerwy
//    3. W dowolnym momencie będzie można zakończyć jego działanie przez wpisanie "quit"
//    4. Będzie posiadał moduł pamięci, który będzie podawał wynik danych obliczeń z pamięci,
//          jeśli dana operacja była już wykonywana

//    Zadanie domowe:
//    -3. Srawdzenie czy mamy prawidłowe działanie.
//    -2. Sprawdzenie czy liczba 2 jest liczba
//    -1. Odwrotność działań
//    0. Dodaj pamięć do reszty operacji
//    1. Dodaj funkcjonalność liczenia pierwiastka (tylko dla liczb dodatnich)
//    2. Dodaj funkcjonalność wyświetlania znajdujących się w pamięci obliczeń


//    Trzy fazy patrzenia jak ktoś kodzi:
//    1. Sam bym nigdy na to nie wpadł/wpadła
//    2. Aha, tak to można zrobić
//    3. Ja bym to raczej zrobił/zrobiła inaczej

    public static void main(String[] args) {

        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("a"));

        Kalkulator kalkulator = new Kalkulator();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj pierwsza liczbe");
            String liczba1Tekst = keyboard.next();
            if (isQuit(liczba1Tekst)) {
                break;
            }

            while (!isNumeric(liczba1Tekst)) {
                System.out.println(liczba1Tekst + " to nie liczba. Podaj prawidlowa.");
                liczba1Tekst = keyboard.next();
            }

            System.out.println("Podaj druga liczbe");
            String liczba2Tekst = keyboard.next();
            if (isQuit(liczba2Tekst)) {
                break;
            }

            System.out.println("Podaj dzialanie");
            String dzialanie = keyboard.next();
            if (isQuit(dzialanie)) {
                break;
            }

            double liczba1 = Double.parseDouble(liczba1Tekst);
            double liczba2 = Double.parseDouble(liczba2Tekst);



            switch (dzialanie) {
                case "+":
                    kalkulator.dodaj(liczba1, liczba2);
                    break;
                case "-":
                    kalkulator.odejmij(liczba1, liczba2);
                    break;
                case "*":
                    kalkulator.pomnoz(liczba1, liczba2);
                    break;
                case "/":
                    kalkulator.podziel(liczba1, liczba2);
                    break;
            }
        }
    }

    private static boolean isQuit(String value) {
        return value.equals("quit");
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
