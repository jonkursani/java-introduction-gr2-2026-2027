/*
*  Kushtezimet ne Java
*  if, else if, else
*  if (T/F) {
*   Pjese e if-it
*  }
*
* */
void main() {
    int number = 1;

    int a = 0;
    if (number > 0) {
        a = 1;
        IO.println("Numri eshte pozitiv");
        IO.println("Vlera e a: " + a);
    } else if (number < 0) {
        a = 2;
        IO.println("Numri eshte negativ");
        IO.println("Vlera e a: " + a); // a nuk ekziston ne kete scope
    } else {
        a = 3;
        IO.println("Numri eshte zero");
        IO.println("Vlera e a: " + a); // a nuk ekziston ne kete scope
    }

    IO.println("Vlera e a: " + a); // a ekziston ne kete scope
    IO.println("Fundi i programit");


    // Krahasimi i Stringjeve
    // jo == por me metoden .equals()
    String answer = IO.readln("A je student? ");

    IO.println("Pergjigja jote: " + answer);
    IO.println("Pergjigja jote: " + (answer == "po"));
    IO.println("Pergjigja jote: " + (answer.equals("po")));
//    IO.println("Pergjigja jote: " + (answer.toLowerCase().equals("po")));
    IO.println("Pergjigja jote: " + (answer.equalsIgnoreCase("po")));

}

// Jashte scope-it (trupit) te metodes main
//IO.println(number);