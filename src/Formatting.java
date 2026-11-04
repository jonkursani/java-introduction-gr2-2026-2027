/*
* Formatimi i tekstit duke perdorur metoden printf()
* */
void main() {
    var name = "Arta"; // String
    var age = 20; // int
    var average = 8.3333; // double
    var grade = 'A'; // char

    // Formatimi i tekstit (printf) sillet sikur print (kursori ne rreshtin e njejte)
    System.out.printf("Emri: %s, Mosha: %d%n", name, age);
    // Shkurtesa: souf => System.out.printf();
    System.out.printf("Nota mesatare: %.2f, Nota finale: %c%n", average, grade);
}