void main() {
    IO.println("Kuizi me kategori");
    IO.println("1. Fjalekalimet");
    IO.println("2. Rrjeti");
    IO.println("3. Phishing");

    // Lexojme kategorine
    String category = IO.readln("Kategoria (1-3): ");

    boolean isValid = category.equals("1") || category.equals("2") || category.equals("3");

//    if (!(category.equals("1") || category.equals("2") || category.equals("3"))) {
    // nese nuk osht valid !isValid
    if (!isValid) {
        IO.println("Gabim: Kategoria nuk ekziston");
    } else {
        int score = 0;

        // Kontrollo kategorine
        switch (category) {
            case "1" -> {
                int answer1 = Integer.parseInt(IO.readln("Sa shenja te pakten ka nje fjalekalim i forte? "));

                if (answer1 >= 12) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Fjalekalimi i forte ka te pakten 12 shenja.");
                }

                String answer2 = IO.readln("A eshte Password1 fjalekalim i forte (Po, Jo)? ");
                String clean2 = answer2.trim(); // largo hapesirat e panevojshme

                if (clean2.equalsIgnoreCase("jo")) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Password1 nuk eshte fjalekalim i forte.");
                }
            }
            case "2" -> {
                int answer1 = Integer.parseInt(IO.readln("Cilin port perdor HTTPS? "));

                if (answer1 == 443) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! HTTPS perdor portin 443.");
                }

                int answer2 = Integer.parseInt(IO.readln("Sa bit ka nje adreve IPv4? "));

                if (answer2 == 32) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Adresa IPv4 ka 32 bit.");
                }
            }
            case "3" -> {
                String answer1 = IO.readln("Banka kërkon fjalëkalimin me e-mail. E jepni? (Po, Jo) ");

//                if (answer1.trim().toLowerCase().equals("jo")) {
                if (answer1.trim().equalsIgnoreCase("jo")) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Nuk duhet ta jepni fjalekalimin.");
                }

                String answer2 = IO.readln("Linku: paypa1.com. A është PayPal? (Po, Jo) ");

                if (answer2.trim().equalsIgnoreCase("jo")) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Linku nuk eshte i PayPal.");
                }
            }
        }

        String result = score == 2 ? "Shkelqyeshem!" : "Edhe pak!";

        System.out.printf("Pike: %d nga 2. %s%n", score, result);
    }
}