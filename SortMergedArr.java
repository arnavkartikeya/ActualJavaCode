import java.util.Scanner;
class SortMergedc{
  public static void main(String[] args){
    int[] a = {1,2,3};
    int[] b = {5,23,4,5,6,7,8,4,2,2};
    int[] c = mergeAndSort(a,b);
    for(int i : c){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public static int[] mergeAndSort(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    for(int i = 0; i < a.length; i++){
      c[i] = a[i];
    }
    for(int i = 0; i < b.length; i++){
      c[i+a.length] = b[i];
    }
    return sort(c);
  }
  public static int[] sort(int[] c){
    for(int i = 0; i < c.length - 1; i++){
      int currentMin = c[i];
      int minIndex = i;
      for(int j = i+1; j < c.length; j++){
        if(currentMin > c[j]){
          currentMin = c[j];
          minIndex = j;
        }
      }
      if(minIndex != i){
        c[minIndex] = c[i];
        c[i] = currentMin;
      }
    }
    return c;
  }
}
