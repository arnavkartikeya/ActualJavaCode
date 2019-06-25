class SortMergedArr{
  public static void main(String[] args){

  }
  public static int[] mergeAndSort(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    for(int i = 0; i < c.length - 1; i++){
      int currentMin = c[i];
      int minIndex = i;
      for(int j = i +1; j < c.length; j++){
        if(currentMin > c[j]){
          currentMin = c[j];
          minIndex = j;
        }
      }
      if(currentMin != i){
        c[minIndex] = c[i];
        c[i] = currentMin;
      }
    }
  }
}
