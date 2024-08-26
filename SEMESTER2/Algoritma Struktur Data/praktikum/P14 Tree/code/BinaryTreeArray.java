public class BinaryTreeArray {
  int[] data;
  int idxLast;

  public BinaryTreeArray() {
    data = new int[10];
  }

  void populateData(int data[], int idxLast) {
    this.data = data;
    this.idxLast = idxLast;
  }

  void traverseInOrder(int idxStart) {
    if (idxStart <= idxLast) {
      traverseInOrder(2 * idxStart + 1);
      System.out.print(data[idxStart] + " ");
      traverseInOrder(2 * idxStart + 2);
    }
  }

  void traversePostOrder(int idxStart) {
    if (idxStart <= idxLast) {
      traverseInOrder(2 * idxStart + 1);
      traverseInOrder(2 * idxStart + 2);
      System.out.print(data[idxStart] + " ");
    }
  }

  void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
      System.out.print(data[idxStart] + " ");
      traverseInOrder(2 * idxStart + 1);
      traverseInOrder(2 * idxStart + 2);
    }
  }

  void add(int data) {
    if (idxLast == 0) {
      this.data[idxLast] = data;
      idxLast++;
      return;
    }

    int i = 0;
    while (true) {
      if (data < this.data[i]) {
        if (this.data[2 * i + 1] == 0) {
          this.data[2 * i + 1] = data;
          break;
        } else {
          i = 2 * i + 1;
        }
      } else {
        if (this.data[2 * i + 2] == 0) {
          this.data[2 * i + 2] = data;
          break;
        } else {
          i = 2 * i + 2;
        }
      }
    }
    idxLast++;
  }

}
