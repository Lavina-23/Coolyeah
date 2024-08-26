package tugas;

import java.util.Scanner;

public class LinkedList {
  Node head;

  public LinkedList() {
    head = null;
  }

  public void addPoint(String question, String answer) {
    Node newNode = new Node(question, answer);

    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void game() {
    Scanner sc = new Scanner(System.in);
    Node current = head;

    while (current != null) {
      System.out.println("Pertanyaan: " + current.question);
      System.out.print("Jawaban: ");
      String input = sc.nextLine();

      if (input.equalsIgnoreCase(current.answer)) {
        System.out.println("JAWABAN BENAR");
        current = current.next;
      } else {
        System.out.println("JAWABAN SALAH");
      }
    }
    System.out.println("See You !");
  }
}
