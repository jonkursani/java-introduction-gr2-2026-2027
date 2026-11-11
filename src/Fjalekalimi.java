void main() {

    // Lexo fjalekalimin prej userit
    String password = IO.readln("Fjalekalimi: ");

    // Gjatesia e tekstit
    int length = password.length();

    // A ka shkronje te madhe
    String lower = password.toLowerCase(); // Po => po
    Boolean hasUpper = !password.equals(lower); // !(Po = po) = !F => T

    // A ka shkronje te vogel
    String upper = password.toUpperCase();
    Boolean hasLower = !password.equals(upper);

    // A eshte common password (123456, password, qwerty)
    boolean isCommon = password.equals("123456")
            || password.equals("password")
            || password.equals("qwerty");

    // Output-i
//    if ((password.equals("123456") || password.equals("password") || password.equals("qwerty") || length < 8) {
    if (isCommon || length < 8) {
        IO.println("Fjalekalimi eshte i dobet.");
    } else if (length >= 12 && hasUpper && hasLower) {
        IO.println("Fjalekalimi eshte i forte.");
    } else {
        IO.println("Fjalekalimi eshte i mesatar.");
    }
}