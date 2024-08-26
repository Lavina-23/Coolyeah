package tugas;

public class Node {
  String answer, question;
  Node next;

  public Node(String question, String answer) {
    this.question = question;
    this.answer = answer;
    this.next = null;
  }
}