public class MyHeap {
  private static void pushDown(int[] dat, int size, int ind) {
    if(ind * 2 + 1 >= size) {//if no more branches, stop
      return;
    }
    else {
      if(ind * 2 + 2 < size) { //two branches
        if(dat[ind * 2 + 1] < dat[ind] && dat[ind * 2 + 2] < dat[ind]) {return;}//if no more push down, stop
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
    /*int temp = 0;
    while(ind * 2 + 1 < size) {//has branches?
      if(ind * 2 + 2 >= size) {//one branch only
        if(dat[ind] < dat[ind * 2 + 1]) {//if branch is greater than ind, swap
          temp = dat[ind];
          dat[ind] = dat[ind * 2 + 1];
          dat[ind * 2 + 1] = temp;
        }
      }
      else {//two branches
        if(Math.min(dat[ind * 2 + 1], dat[ind * 2 + 2]) < dat[ind]) {return;}//if sorted, then stop
        else {//not sorted
          if(Math.min(dat[ind * 2 + 1], dat[ind * 2 + 2]) == dat[ind * 2 + 1]) {//if smaller is left branch, swap with right

            System.out.println("two branches, left is smaller, swap with right");
            System.out.println("dat[ind]: " + dat[ind] + ", right branch: " + dat[ind * 2 + 2]);

            temp = dat[ind];
            dat[ind] = dat[ind * 2 + 2];
            dat[ind * 2 + 2] = temp;
          }
          else {//if smaller is right branch, swap with left

            System.out.println("two branches, right is smaller, swap with left");
            System.out.println("dat[ind]: " + dat[ind] + ", left branch: " + dat[ind * 2 + 1]);

            temp = dat[ind];
            dat[ind] = dat[ind * 2 + 1];
            dat[ind * 2 + 1] = temp;
          }
        }
      }
    }*/
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
