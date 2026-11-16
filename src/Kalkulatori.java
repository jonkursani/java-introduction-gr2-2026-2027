/*
*   Kalkulatori duke perdorur Switch
*
* */
void main() {
    double first = Double.parseDouble(IO.readln("Numri i pare: "));
    String operator = IO.readln("Veprimi (+ - * /): ");
    double second = Double.parseDouble(IO.readln("Numri i dyte: "));

//  var result = switch (operator) { // switch expression
    switch (operator) {
        case "+" -> IO.println("Rezultati: " + (first + second));
//        case "+" -> first + second; // switch expression
        case "-" -> IO.println("Rezultati: " + (first - second));
        case "*" -> IO.println("Rezultati: " + (first * second));
        case "/" -> {
            if (second == 0) {
                IO.println("Gabim: Nuk mund te behet pjestimi me zero");
            } else {
                IO.println("Rezultati: " + (first / second));
            }
        }
        default -> IO.println("Gabim: Operator i pavlefshem: " + operator);
    }
}