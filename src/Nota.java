void main() {
    IO.println("Bot:\tTung! Une ta them noten.");

    // Leximi i pikeve
    int points = Integer.parseInt(IO.readln("Sa pike ke? "));

    // Deklarimi dhe inicializimi i notes
    int grade = 5;

    // Logjika e if-it dhe else-if
    if (points >= 91) {
        grade = 10;
    } else if (points >= 81) {
        grade = 9;
    } else if (points >= 71) {
        grade = 8;
    } else if (points >= 61) {
        grade = 7;
    } else if (points >= 51) {
        grade = 6;
    } else {
        grade = 5;
    }

    // Output-i
    IO.println("Bot:\tNota: " + grade);

    if (grade > 5) {
        IO.println("Bot:\tUrime! Ti kalove.");
    } else {
//        IO.println("Bot:\tEnde jo. Te duhen edhe " + remaining + " pike.");
        int remaining = 51 - points;
        System.out.printf("Bot:\tEnde jo. Te duhet edhe %d pike", remaining);
    }
}