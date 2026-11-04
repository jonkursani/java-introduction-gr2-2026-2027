/*
*   Kastimi ne Java
* */
void main() {
    // Implicit
    int age = 20;
//    long length = age;
    double length = age; // 20.0

    // Kastimi explicit
    double price = 9.99;
    int euro = (int) price;
//    int euro = (int) (price + 1);

    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    IO.println(max);
    IO.println(min);
    IO.println(max + 1);

    // a++, ++a trick
    var x = 1;
    IO.println("x: " + x);
    IO.println("x++: " + (x++));
    IO.println("x: " + x);
    IO.println("++x: " + (++x));
    IO.println("x: " + x);

    // Klasa - Math
    IO.println("sqrt: " + Math.sqrt(age));
    IO.println("pow: " + Math.pow(age, 2));
    var firstMin = Math.min(1, 2);
    IO.println(Math.min(firstMin, 3));
    IO.println(Math.min(1, Math.min(2, 3)));
    IO.println(Math.round(2.5));
    IO.println(Math.floor(2.9));
    IO.println(Math.ceil(2.1));
}