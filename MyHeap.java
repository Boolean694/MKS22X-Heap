public class MyHeap {
  private static void pushDown(int[] dat, int size, int ind) {
    int temp = 0;
    while(ind * 2 + 1 < size) {//has branches?
      if(ind * 2 + 2 >= size) {//ind is at node with one branch only
        if(dat[ind] < dat[ind * 2 + 1]) {
          temp = dat[ind];
          dat[ind] = dat[ind * 2 + 1];
          dat[ind * 2 + 1] = temp;
        }
      }
      else {

      }
    }
  }
  private static void pushUp(int[] dat, int size, int ind) {

  }
  public static void heapify(int[] dat) {

  }
  public static void heapsort(int[] dat) {

  }
  public static void main(String[] args) {
  int[] te = {5,0,8,7,4,6};
    pushDown(te,te.length - 1,7);
    for(int q = 0; q < te.length; q++) {
      System.out.print(te[q] + ",");
    }
  }
}
