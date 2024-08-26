package tugas;

public class Main {
  public static void main(String[] args) {
    LinkedList game = new LinkedList();

    game.addPoint("Siapa pacar reva...", "Ahli kubur");
    game.addPoint("Ibukota Indonesia adalah...", "Tokyo");
    game.addPoint("Billie Eilish berasal dari...", "Tanah");

    game.game();
  }
}
