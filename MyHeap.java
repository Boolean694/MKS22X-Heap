public class MyHeap {
  private static void pushDown(int[] dat, int size, int ind) {

  }
  private static void pushUp(int[] dat, int size, int ind) {

  }
  public static void heapify(int[] dat) {
    for(int q = 0; q < dat.length; q++) {
      /*if(dat[q/2] < dat[q]) {
        int temp = dat[q];
        dat[q] = dat[q/2];
        dat[q/2] = temp;
      }*/
      if(q * 2 < dat.length) {
        if(dat[q * 2] > dat[q]) {
          int temp = dat[q];
          dat[q] = dat[q * 2];
          dat[q * 2] = temp;
        }
      }
      if(((q * 2) + 1) < dat.length) {
        if(dat[(q * 2) + 1] > dat[q]) {
          int temp = dat[q];
          dat[q] = dat[(q * 2) + 1];
          dat[(q * 2) + 1] = temp;
        }
      }
    }
  }
  public static void heapsort(int[] dat) {

  }
  public static void main(String[] args) {
    int[] te = {4,8,3,6,2,5,7,9,0,1,3,3,7,4,5,8};
    heapify(te);
    for(int q = 0; q < te.length; q++) {
      System.out.print(te[q] + ",");
    }
  }
}
