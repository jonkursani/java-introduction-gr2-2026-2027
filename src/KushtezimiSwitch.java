void main() {
   int choice = 2;

//   if (choice == 1) {
//   } else if (choice == 2) {
//   } else {
//   }

    switch (choice) {
       case 1 -> IO.println("Ti zgjodhe opsionin 1");
       case 2 -> IO.println("Ti zgjodhe opsionin 2");
       default -> IO.println("Opsioni nuk ekziston");
   }

   // Switch expression
    String category = switch (choice) {
        case 1 -> "Sport";
        case 2 -> "Matematike";
        default -> "Kategoria nuk ekziston";
    };

    IO.println("Ti zgjodhe kategorine: " + category);
}