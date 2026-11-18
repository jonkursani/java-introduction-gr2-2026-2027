/*
* Fjalekalimi V2
* */
void main() {
    String password = IO.readln("Fjalekalimi: "); // String

    // Gjatesia e fjalekalimit
    int length = password.length();

    // A ka shkronje te madhe
    String lower = password.toLowerCase();
    boolean hasUpper = !password.equals(lower);

    // A ka shkronje te vogel
    String upper = password.toUpperCase();
    boolean hasLower = !password.equals(upper);

    // A eshte i njohur
    boolean isCommon = lower.equals("12345678") || lower.equals("password") || lower.equals("qwerty");

    // Kontrollojme fjalekalimin
    if (isCommon || length < 8) {
        IO.println("Fjalekalimi eshte i dobet.");
    } else {
        int score = 0;

        if (length >= 12) {
            score++;
//            score += 1;
//            score = score + 1;
        }

        if (hasUpper) {
            score++;
        }

        // nese if-i ka vetem nje rresht mundeni mi largu kllapat
        if (hasLower)
            score++;

        // switch expression => switch-i ne anen e djathte te barazimit
        String level = switch (score) {
            case 0, 1 -> "I dobet";
            case 2 -> "Mesatar";
            case 3 -> "I forte";
            default -> "Score gabim";
        };

//        IO.println("Pike: " + score + " nga 3. " + level + ".");
        System.out.printf("Pike: %d nga 3. %s.%n", score, level);
    }
}