package atm;

public class App {
  public static void main(String[] args) {

    Nasabah[] nasabah = new Nasabah[2];
    nasabah[0] = new Nasabah("1234567890", "Lavina", "230804", "BSI", 10_000_000);
    nasabah[1] = new Nasabah("0987654321", "Yono", "050505", "Mandiri", 20_000_000);

    Nasabah n = new Nasabah(null, null, null, null, 0);
    while (n.login(nasabah)) {
      n.mainMenu(nasabah, 0);
      n.showSaldo(nasabah, 0);
      n.tarikTunai(nasabah, 0);
    }
  }
}
