/*
* Variablat dhe data tipet
*
* data tipi (tipi i te dhenave) label (etiketa) = vlera
* */
void main() {
    // Deklarimi dhe inicializimi
    int age = 19;

    // Deklarim
    int one;

    // Inicializim
    one = 1;

    IO.println(age); // 19
    IO.println(one); // 1
    IO.println("age");
    IO.println("one");

    age = 20;
    IO.println(age); // 20

    /*
    * Data tipet
    * */

    // int
    int two = 2;

    // long
    long population = 8_100_000_000L;
//    long three = 3L;

    // double
    double price = 2.5;
//    double price2 = 2; // 2.0

    // boolean (true, false)
    boolean isStudent = true;
    boolean isMarried;
    isMarried = false;
    IO.println(isStudent);
    IO.println(isMarried);
    IO.println("isMarried: " + isMarried);


    // char
    char questionMark = '?';
    char letterA = 'A';

    // String
    String ab = "AB";
    String name = "Arta";

    // var -> compailer - ne runtime e percakton prej vleres
    var three = 3; // int
    var cmimi = 3.5; // double
    var letterB = 'B'; // char
    var gjatesiaDeriTeDielli = 8_1456788768765L;
//    three = "three"; // ERROR

    // ERROR
//    char letterC;
//    IO.println(letterC);

    // char
    int codeA = letterA; // int
    IO.println(codeA); // 65
    int codeQuestion = questionMark;
    IO.println(codeQuestion);

    // Constante (final)
    final double VAT = 0.18;
//    VAT = 0.2;
    final int WEEK_DAYS = 7;

//    "Gerti " + " 19" = "Gerti  19"

    IO.println(name + ": " + age);
}