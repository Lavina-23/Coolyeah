package film;

public class DoubleLinkedLists {
  Node head;
  int size;

  public DoubleLinkedLists() {
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int size() {
    return size;
  }

  public void addFirst(int id, String judul, double rating) {
    if (isEmpty()) {
      head = new Node(null, id, judul, rating, null);
    } else {
      Node newNode = new Node(null, id, judul, rating, head);
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  public void addLast(int id, String judul, double rating) {
    if (isEmpty()) {
      addFirst(id, judul, rating);
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      Node newNode = new Node(current, id, judul, rating, null);
      current.next = newNode;
    }
    size++;
  }

  public void add(int index, int id, String judul, double rating) {
    if (isEmpty()) {
      addFirst(id, judul, rating);
    } else if (index < 0 || index > size) {
      System.out.println("Index tidak valid !");
    } else {
      Node current = head;
      int i = 0;
      while (i < index) {
        current = current.next;
        i++;
      }
      if (current.prev == null) {
        Node newNode = new Node(null, id, judul, rating, current);
        current.prev = newNode;
        head = newNode;
      } else {
        Node newNode = new Node(current.prev, id, judul, rating, current);
        if (current.prev != null) {
          current.prev.next = newNode;

        }
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev = newNode;
      }
    }
    size++;
  }

  public void removeFirst() throws Exception {
    if (isEmpty()) {
      throw new Exception("Linked list masih kosong, tidak dapat dihapus");
    } else if (size == 1) {
      removeLast();
    } else {
      head = head.next;
      head.prev = null;
      size--;
    }
  }

  public void removeLast() throws Exception {
    if (isEmpty()) {
      throw new Exception("Linked list masih kosong, tidak dapat dihapus");
    } else if (head.next == null) {
      head = null;
      size--;
      return;
    }

    Node current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    current.next = null;
    size--;
  }

  public void remove(int index) throws Exception {
    if (isEmpty() || index >= size) {
      throw new Exception("Nilai index diluar batas");
    } else if (index == 0) {
      removeFirst();
    } else {
      Node current = head;
      int i = 0;
      while (i < index) {
        current = current.next;
        i++;
      }
      if (current.next == null) {
        current.prev.next = null;
      } else if (current.prev == null) {
        current = current.next;
        current.prev = null;
        head = current;
      } else {
        current.prev.next = current.next;
        current.next.prev = current.prev;
      }
      size--;
    }
  }

  public void print() {
    System.out.println("Cetak Data");
    if (!isEmpty()) {
      Node data = head;
      while (data != null) {
        System.out.println("ID: " + data.id);
        System.out.println("  Judul Film: " + data.judul);
        System.out.println("  Rating: " + data.rating);
        data = data.next;
      }
    } else {
      System.out.println("Linked list kosong");
    }
  }

  public void getId(int id) {
    if (isEmpty()) {
      System.out.println("Linked list kosong");
    }

    Node tmp = head;
    int index = 0;
    while (tmp != null && tmp.id != id) {
      tmp = tmp.next;
      index++;
    }

    if (tmp != null) {
      System.out.println("Data ID Film: " + id + " berada di node ke-" + (index + 1));
      System.out.println("IDENTITAS:");
      System.out.println("  ID: " + tmp.id);
      System.out.println("  Judul Film: " + tmp.judul);
      System.out.println("  Rating: " + tmp.rating);
    } else {
      System.out.println("Film dengan ID: " + id + " tidak tersedia");
    }
  }

  public void sortRating() {
    if (head == null || head.next == null) {
      return;
    }

    boolean swapped;
    do {
      swapped = false;
      Node prev = null;
      Node current = head;
      Node nextNode = head.next;

      while (nextNode != null) {
        if (current.rating < nextNode.rating) {
          if (prev != null) {
            prev.next = nextNode;
          } else {
            head = nextNode;
          }

          current.next = nextNode.next;
          nextNode.next = current;
          prev = nextNode;
          nextNode = current.next;
          swapped = true;
        } else {
          prev = current;
          current = nextNode;
          nextNode = nextNode.next;
        }
      }
    } while (swapped);
  }

}
