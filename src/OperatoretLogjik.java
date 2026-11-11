/*
* Operatoret logjik
* && (dhe - and)
* || (ose - or)
* ! (negacioni - e kunderta)
*
* */
void main() {
    int x = 100;
//
//    if (x >= 0) {
//        if (x <= 100) {
//            IO.println("");
//        }
//    }

    // && a eshte vlera brenda rangut (T && F => F)
    if (x >= 0 && x <= 100) {
        IO.println("Vlera eshte brenda rangut.");
    } else {
        IO.println("Vlera nuk eshte brenda rangut.");
    }

    // || a eshte vlera jashte rangut (T || F => T)
    if (x < 0 || x > 100) {
        IO.println("Vlera nuk eshte brenda rangut.");
    } else {
        IO.println("Vlera eshte brenda rangut.");
    }
}