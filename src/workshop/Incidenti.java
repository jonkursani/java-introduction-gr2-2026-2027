void main() {
    // 1. menuja
    IO.println("1. Malware");
    IO.println("2. Phishing");
    IO.println("3. DDoS");
    IO.println("4. Ransomware"); // Ndryshimi

    var type = Integer.parseInt(IO.readln("Lloji (1-4): ")); // Ndryshimi
    // 2. pesha e llojit: switch që jep vlerë
    var weight = switch (type) {
        case 1 -> 3.0;
        case 2 -> 2.0;
        case 3 -> 2.5;
        case 4 -> 4.0; // ndryshimi
        default -> 0.0;
    };
    if (weight == 0.0) {
        IO.println("Lloj i panjohur.");
    } else {
        // 3. përdoruesit e prekur: nga 1 deri në 1000
        var users = Integer.parseInt(IO.readln("Përdorues të prekur (1-1000): "));
        if (users < 1 || users > 1000) {
            IO.println("Vetëm 1 deri në 1000.");
        } else {
            var risk = weight * users / 100;

            // Ndryshimin
            if (type == 2 && users > 50) {
                IO.println("Ndërroni fjalëkalimet e të gjithëve");
            }

            // 4. serveri kryesor: +5 në rrezik
            var typedServer = IO.readln("Serveri kryesor? (po/jo) ");
            var server = typedServer.trim().toLowerCase();
            if (server.equals("po")) {
                risk = risk + 5;
            }
            // 5. rreziku dhe veprimi
            System.out.printf("Rreziku: %.2f%n", risk);
//            var action = risk >= 10 ? "Lajmëroni ekipin tani." : "Regjistrojeni dhe ndiqeni.";
//            IO.println(action);

            // Sfida
            if (risk >= 20) {
                IO.println("KRITIK: thirrni menaxherin.");
            } else if (risk >= 10) {
                IO.println("Lajmëroni ekipin tani.");
            } else {
                IO.println("Regjistrojeni dhe ndiqeni.");
            }
        }
    }
}