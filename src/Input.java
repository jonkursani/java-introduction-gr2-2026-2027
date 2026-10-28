void main() {
//    IO.print("Si quhesh? ");
//    var name = IO.readln();
//    IO.println("Une quhem: " + name);

//    IO.print("Sa vjec je? ");
//    String age = IO.readln(); // String
//    var age = IO.readln(); // String (klase)
//    String ageText = IO.readln();
//    int age = Integer.parseInt(ageText);
//    int age = Integer.parseInt(IO.readln());
//    IO.println("Vitin tjeter behem: " + (age + 1));

    String name = IO.readln("Si quhesh? ");
//    String priceText = IO.readln("Sa kushton kafja? ");
//    double price = Double.parseDouble(priceText);
    double price = Double.parseDouble(IO.readln("Sa kushton kafja? "));
    IO.println(name + " paguan " + (price * 2) + " euro per 2 kafe.");
}