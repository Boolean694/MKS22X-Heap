public class MyHeap {
  private static void pushDown(int[] dat, int size, int ind) {
    if(ind * 2 + 1 >= size) {//if no more branches, stop
      return;
    }
    else {
      if(ind * 2 + 2 < size) { //two branches
        if(dat[ind * 2 + 1] <= dat[ind] && dat[ind * 2 + 2] <= dat[ind]) {return;}//if no more push down, stop
        if(dat[ind] < dat[ind * 2 + 1] && dat[ind] < dat[ind * 2 + 2]) {//if both branches larger than node
          if(dat[ind * 2 + 1] >= dat[ind * 2 + 2]) {//if left branch is bigger than right branch, swap node with left, call recursion on new ind
            int temp = dat[ind];
            dat[ind] = dat[ind * 2 + 1];
            dat[ind * 2 + 1] = temp;
            pushDown(dat, size, ind * 2 + 1);
            return;
          }
          else {//if right branch bigger than left, swap node with right, call recursion on new ind
            int temp = dat[ind];
            dat[ind] = dat[ind * 2 + 2];
            dat[ind * 2 + 2] = temp;
            pushDown(dat, size, ind * 2 + 2);
            return;
          }
        }
        else if(dat[ind] < dat[ind * 2 + 1]) {//if only left branch is bigger, swap with left
          int temp = dat[ind];
          dat[ind] = dat[ind * 2 + 1];
          dat[ind * 2 + 1] = temp;
          pushDown(dat, size, ind * 2 + 1);
          return;
        }
        else {//if only right branch is bigger, swap with right
          int temp = dat[ind];
          dat[ind] = dat[ind * 2 + 2];
          dat[ind * 2 + 2] = temp;
          pushDown(dat, size, ind * 2 + 2);
          return;
        }
      }
      else {//one branch
        if(dat[ind] < dat[ind * 2 + 1]) {
          int temp = dat[ind];
          dat[ind] = dat[ind * 2 + 1];
          dat[ind * 2 + 1] = temp;
        }
        return;
      }
    }
  }
  private static void pushUp(int[] dat, int size, int ind) {

  }
  public static void heapify(int[] dat) {
    for(int q = dat.length - 1; q >= 0; q--) {
      pushDown(dat, dat.length, q);
    }
  }
  public static void heapsort(int[] dat) {
    heapify(dat);
    int tempe = 0;
    for(int q = 0; q < dat.length; q++) {
      tempe = dat[0];//swap first element with last elem
      dat[0] = dat[dat.length - 1];
      dat[dat.length - 1] = tempe;
      pushDown(dat, dat.length - 1, 0);//push swapped element down to proper position
    }
  }
  public static void main(String[] args) {
  int[] te = {4,8,3,6,2,5,7,9,0,1,3,3,7,4,5,8};
    heapsort(te);
    for(int q = 0; q < te.length; q++) {
      System.out.print(te[q] + ",");
    }
  }
}
