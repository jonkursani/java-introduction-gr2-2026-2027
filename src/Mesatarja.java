/*
* Ky program llogariten mesataren e 3 notave te studentit
* */
void main() {
    IO.println("Bot:\tTung! Une e llogaris mesataren tende.");
    int first = Integer.parseInt(IO.readln("Bot:\tNota e pare: "));
    int second = Integer.parseInt(IO.readln("Bot:\tNota e dyte: "));
    int third = Integer.parseInt(IO.readln("Bot:\tNota e trete: "));

    // Shuma e notave
    int sum = first + second + third;

    // Mesatarja
//    double average = sum / 3.0;
    double average = (double) sum / 3;

    // Dy numra pas presjes
//    double twoDigits = (double) Math.round(average * 100) / 100;
    double twoDigits = Math.round(average * 100) / 100.0;

    // Nota e rrumbullaksuar
    int grade = (int) Math.round(average);

    // Nota me e vogel, nota me e madhe
//    int minFirst = Math.min(first, second);
//    int min = Math.min(minFirst, third);
    int min = Math.min(first, Math.min(second, third));

    int max = Math.max(first, Math.max(second, third));

    // Output-i
    IO.println("Bot:\tShuma: " + sum);
    IO.println("Bot:\tMesatarja: " + average);
    IO.println("Bot:\tMe dy shifra: " + twoDigits);
    IO.println("Bot:\tNota e rrumbullaksuar: " + grade);
    IO.println("Bot:\tMe e larta " + max + ", me e uleta: " + min);
}